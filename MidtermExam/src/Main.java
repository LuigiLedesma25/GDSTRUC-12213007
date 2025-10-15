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

        int randomNum;
        int cardNum;
        Card poppedItem;
        int size = Deck.getSize();
        System.out.println("Deck Contents");
        Deck.printStack();
        System.out.print("\nPress Enter to Continue:");
        System.in.read(); //Press Enter to cont.
        //Set Loop
        while(true){
            randomNum = (int)(Math.random() * 3 + 1); //random choice of 3
            cardNum = (int)(Math.random() * 4 + 1); //random amt of 5
            if(randomNum == 1) {
                System.out.println("\nYou drew " + cardNum + " cards from the Deck."); //Draw
                if(cardNum > size) {
                    cardNum = size;
                }
                for (int i = cardNum; i > 0; i--) {
                    poppedItem = Deck.pop(); //remove top and set variable
                    Hand.push(poppedItem);
                }
            }
            else if(randomNum == 2) {
                System.out.println("\nYou discarded " + cardNum + " cards from the Hand."); //Discard
                if(cardNum > Hand.getSize()) {
                    System.out.println("\nHand count is too small. Skipping action.");
                }
                else{
                    for (int i = cardNum; i > 0; i--) {
                        poppedItem = Hand.pop(); //remove top and set variable
                        Discard.push(poppedItem);
                    }
                }
            }
            else{
                System.out.println("\nYou retrieved " + cardNum + " cards from the Discard."); //Retrieve
                if(cardNum > Discard.getSize()) {
                    System.out.println("\nDiscard pile is too small. Skipping action.");
                }
                else{
                    for (int i = cardNum; i > 0; i--) {
                        poppedItem = Discard.pop(); //remove top and set variable
                        Hand.push(poppedItem);
                    }
                }
            }
            //Print Results
            System.out.println("\nDeck Count: " + Deck.getSize());
            System.out.println("\nHand Contents");
            Hand.printStack();
            System.out.println("\nDiscard Count " + Discard.getSize());
            //End Loop
            size = Deck.getSize();
            if(size <= 0) {
                break;
            }
            System.out.print("\nPress Enter to Continue:");
            System.in.read();
        }

        System.out.println("\nDeck is now empty.");
    }
}
//done