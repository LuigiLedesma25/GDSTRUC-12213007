import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayQueue playerQueue = new ArrayQueue(10);
        playerQueue.enqueue(new Player(1, "Voyager"));
        playerQueue.enqueue(new Player(2, "Setanta"));
        playerQueue.enqueue(new Player(3, "Taisui"));
        playerQueue.enqueue(new Player(4, "Alexander"));
        playerQueue.enqueue(new Player(5, "KoGil"));
        playerQueue.enqueue(new Player(6, "Nemo"));
        playerQueue.enqueue(new Player(7, "Hans"));
        playerQueue.enqueue(new Player(8, "Nobukatsu"));
        playerQueue.enqueue(new Player(9, "Ritsuka"));
        playerQueue.enqueue(new Player(10, "Paris"));

        ArrayQueue gameQueue = new ArrayQueue(10);
        Player removedItemPlayer;
        Player removedItemGame;
        int gameNum = 0;
        int ranNum;
        int size = 0;

        playerQueue.printQueue();
        System.out.print("\nPress Enter to Continue:");
        System.in.read();
        //Loop
        while(true){
            ranNum = (int)(Math.random() * 7 + 1); //random choice of 7
            if(ranNum > playerQueue.size()) {
                System.out.println("\nRolled number is too small. Adding one player instead.");
                ranNum = 1;
            }
            for (int i = ranNum; i > 0; i--) {
                removedItemPlayer = playerQueue.dequeue();
                gameQueue.enqueue(removedItemPlayer);
            }
            System.out.println("\nLoaded in " + ranNum + " players.");
            System.out.println("\nCurrent Players in Queue");
            gameQueue.printQueue();
            size = gameQueue.size();
            System.out.println("\nNumber of Games so far: " + gameNum);
            if(size >= 5) {
                System.out.println("\nA Game has started! Removing players...");//Start Game
                gameNum = gameNum + 1;
                for (int i = 5; i > 0; i--) {
                    removedItemGame = gameQueue.dequeue();
                    playerQueue.enqueue(removedItemGame);
                }
            }
            //Confirm Games
            if(gameNum == 10) {
                break;
            }
            System.out.print("\nPress Enter to Continue:");
            System.in.read();
        }
        System.out.println("\nTen Games have been reached. Ending Program.");


    }
}
//Post-Notes: Declare Back code in Enqueue before Front. Can also make it a SimpleArray for Player Roster to make it easier. Check DMs with Sir.