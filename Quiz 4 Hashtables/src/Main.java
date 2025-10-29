public class Main {
    public static void main(String[] args){
        Player pikachu = new Player(1, "Pikachu", 25);
        Player celebi = new Player(2, "Celebi", 251);
        Player hitmonchan = new Player(3, "Hitmonchan", 107);
        Player mankey = new Player(4, "Mankey", 56);
        Player starmie = new Player(5, "Starmie", 121);
        Player togepi = new Player(6, "Togepi", 26);

        SimpleHashTable hashtable = new SimpleHashTable();
        hashtable.put(pikachu.getUserName(), pikachu);
        hashtable.put(celebi.getUserName(), celebi);
        hashtable.put(hitmonchan.getUserName(), hitmonchan);
        hashtable.put(mankey.getUserName(), mankey);
        hashtable.put(starmie.getUserName(), starmie);
        hashtable.put(togepi.getUserName(), togepi);

        hashtable.printHashtable();

        System.out.println("\nElement at key " + celebi.getUserName() + " = " + hashtable.get(celebi.getUserName()));

        hashtable.remove(pikachu.getUserName());

        hashtable.printHashtable();
    }
}

