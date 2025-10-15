import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CardStack Deck = new CardStack(30);
        Deck.push(new Card(1, "Alpha"));
        Deck.push(new Card(2, "Beta"));
        Deck.push(new Card(3, "Charlie"));
        Deck.push(new Card(4, "Delta"));
        Deck.push(new Card(5, "Eula"));
        Deck.push(new Card(6, "Seth"));
        Deck.push(new Card(7, "Hornet"));
        Deck.push(new Card(8, "Lycaon"));
        Deck.push(new Card(9, "Venti"));
        Deck.push(new Card(10, "Zera"));
        Deck.push(new Card(11, "Alpha"));
        Deck.push(new Card(12, "Beta"));
        Deck.push(new Card(13, "Charlie"));
        Deck.push(new Card(14, "Delta"));
        Deck.push(new Card(15, "Eula"));
        Deck.push(new Card(16, "Seth"));
        Deck.push(new Card(17, "Hornet"));
        Deck.push(new Card(18, "Lycaon"));
        Deck.push(new Card(19, "Venti"));
        Deck.push(new Card(20, "Zera"));
        Deck.push(new Card(21, "Alpha"));
        Deck.push(new Card(22, "Beta"));
        Deck.push(new Card(23, "Charlie"));
        Deck.push(new Card(24, "Delta"));
        Deck.push(new Card(25, "Eula"));
        Deck.push(new Card(26, "Seth"));
        Deck.push(new Card(27, "Hornet"));
        Deck.push(new Card(28, "Lycaon"));
        Deck.push(new Card(29, "Venti"));
        Deck.push(new Card(30, "Zera"));

        CardStack Hand = new CardStack(30);
        CardStack Discard = new CardStack(30);

        System.out.println("Deck Contents");
        Deck.printStack();
        int randomNum = 0;
        int cardNum = 0;
        System.out.println(randomNum);
        System.in.read(); //Press Enter to cont.

        System.out.println("Remove top card from Deck. ");
        Card poppedItem = Deck.pop(); //remove top and set variable
        Hand.push(poppedItem); //add them back
        Deck.printStack();
        Hand.printStack();

        while(Deck.getSize() > 0){
            randomNum = (int)(Math.random() * 2 + 1); //random choice of (3)
            cardNum = (int)(Math.random() * 5 + 1); //random amt of 5
            if(randomNum == 1) {
                System.out.println("\nYou drew " + cardNum + " cards from the Deck.");
                for (int i = cardNum; i >= 0; i--) {
                    poppedItem = Deck.pop(); //remove top and set variable
                    Hand.push(poppedItem);
                }
            }
            System.out.println("\nDeck Contents");
            System.out.println("\nHand Contents");
            System.out.println("\nDiscard Contents");
            System.in.read();
        }




    }
}
