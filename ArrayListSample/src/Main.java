import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player(1, "Saitama", 999)); //do not actually write the var name, they appear naturally
        playerList.add(new Player(2, "Goku", 500));
        playerList.add(new Player(3, "Deku", 100));

        //initial contents
        for (Player player : playerList) { //print the loop
            System.out.println(player);
        }
        //add new player
        playerList.add(2, new Player (4, "Sakamoto", 10));
        System.out.println("");
        for (Player player : playerList) { //print the loop
            System.out.println(player);
        }

        System.out.println(""); //newline
        System.out.println("Player at index 2 " + playerList.get(2)); //get list

        //remove player
        System.out.println("");
        playerList.remove(1); //make sure to specify the type when selecting
        for (Player player : playerList) { //print the loop
            System.out.println(player);
        }

        //check if player object is there
        boolean contains = playerList.contains(new Player(1, "Saitama", 999));
        System.out.println("\nList has Saitama? " + contains);


    }
}
