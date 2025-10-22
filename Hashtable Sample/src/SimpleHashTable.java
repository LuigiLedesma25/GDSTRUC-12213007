public class SimpleHashTable {
    private SavedPlayer[] hashtable;

    public SimpleHashTable() {
        hashtable = new SavedPlayer[10];
    }

    public int hashKey(String key){
        return key.length() % hashtable.length; //length of 'key', number of characters
    }

    public int findKey(String key){
        int hashedKey = hashKey(key);
        int stoppingIndex = hashedKey;
        //check if it's already correct hashedkey
        if(isOccupied(hashedKey) && hashtable[hashedKey].getKey().equals(key)){ //no exclamation means check if equal
            return hashedKey;
        }
        //perform linear probing
        if (hashedKey == hashtable.length - 1){ //if at end of array
            hashedKey = 0;
        }
        else{
            hashedKey++;
        }
        while(hashedKey != stoppingIndex && isOccupied(hashedKey) && !hashtable[hashedKey].getKey().equals(key)){
            hashedKey = (hashedKey + 1) % hashtable.length; //move to next line
        }

        if (isOccupied(hashedKey) && hashtable[hashedKey].getKey().equals(key)){ //saved player found
            return hashedKey;
        }
        return -1;
    }

    public boolean isOccupied(int hashedKey){ //check if its already in use
        return hashtable[hashedKey] != null;
    }

    public void put(String key, Player value){ //encode
        int hashedKey = hashKey(key);

        //performin linear probing, required for exact results
        if (isOccupied(hashedKey)){
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1) { //hashed key is at end of array
                hashedKey = 0;
            }
            else {
                hashedKey++;
            }

            while (hashedKey != stoppingIndex && hashtable[hashedKey] != null){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey)){ //hashed key is taken
            System.out.println("Cannot put player " + key + ". Hashtable is full.");
        }
        else {
            hashtable[hashedKey] = new SavedPlayer(key, value);
        }
    }
    public Player get(String key) {
        int hashedKey = hashKey(key);

        if (hashedKey == -1){
            return null;
        }

        return hashtable[hashedKey].getValue();
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            Player player = null;

            if (hashtable[i] != null){
                player = hashtable[i].getValue();
            }

            System.out.println("Element " + i + " = " + hashtable[i]);
        }
    }
}
