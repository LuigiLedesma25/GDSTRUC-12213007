public class Main {
    public static void main(String[] args){
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addToFront(new Player(1, "Saitama", 999));
        playerLinkedList.addToFront(new Player(2, "Deku", 100));
        playerLinkedList.addToFront(new Player(3, "Saiki", 500));

        playerLinkedList.printList();
        boolean here = playerLinkedList.contains(new Player(3, "Saiki", 500));
        System.out.println("\nIs Saiki here? " + here);

        //removal of first
        System.out.println("");
        playerLinkedList.removeFront();
        playerLinkedList.printList();

        //searching
        boolean there = playerLinkedList.contains(new Player(3, "Saiki", 500));
        System.out.println("\nIs Saiki here? " + there); //use a diff var name each time for new searches

        int index = playerLinkedList.indexOf(new Player(2, "Deku", 100));
        System.out.println("\nDeku index: " + index);
        //size function

        //contains and index of
    }
}
