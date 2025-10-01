public class PlayerLinkedList {
    private PlayerNode head;
    private int size = 0; //starts empty

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);

        // list is not empty
        if (head != null) {
            newNode.setNext(head);
            head.setPrevious(newNode); //two-way reference
        }

        head = newNode;
        size++; //auto increases size
    }

    public boolean contains(Player player){ //search function
        PlayerNode current = head;
        boolean found = false;

        while (current != null){
            if (player.equals(current.getPlayer())){
                found = true;
                break;
            }
            current = current.getNext();
        }
        return found;
    }

    public int indexOf(Player player){ //search via index
        PlayerNode current = head;
        int index = -1; //start with invalid index, incase nothing valid is found
        int currentIndex = 0; //separate value to assess where is valid
        while (current != null){
            if (player.equals(current.getPlayer())){
                index = currentIndex; //transfer then break loop if found
                break;
            }
            currentIndex++;
            current = current.getNext();
        }
        return index;
    }

    public void printList() {
        PlayerNode current = head;

        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNext();
        }

        System.out.print("NULL");
    }
    public Player removeFront() { //remove first element
        PlayerNode removeHead = head; //temp var to know what to clear
        Player removePlayer = head.getPlayer(); //plucks first element
        head = head.getNext(); //transfer head to next element
        removeHead.setNext(null);
        head.setPrevious(null);
        size--; //auto deducts size
        return removePlayer; //removes plucked element

    }
    public int getSize(){ //reveals size value
        return size;
    }
}

