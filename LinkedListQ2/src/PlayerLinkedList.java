public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);

        // list is not empty
        if (head != null) {
            newNode.setNext(head);
        }

        head = newNode;
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
    public void removeFirst() {
        PlayerNode current = head;
        ;
    }
}

