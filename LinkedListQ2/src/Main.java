public class Main {
    public static void main(String[] args){
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addToFront(new Player(1, "Saitama", 999));
        playerLinkedList.addToFront(new Player(2, "Deku", 100));
        playerLinkedList.addToFront(new Player(3, "Saiki", 500));

        playerLinkedList.printList();

        //removal of first
        System.out.println("");
        playerLinkedList.removeFirst();

        playerLinkedList.printList();
        //size function

        //contains and index of
    }
}
