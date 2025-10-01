public class PlayerNode {
    private Player player;
    private PlayerNode next;
    private PlayerNode previous; //next+prev = double-linked list

    public PlayerNode getPrevious() {
        return previous;
    }

    public void setPrevious(PlayerNode previous) {
        this.previous = previous;
    }



    public PlayerNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNext() {
        return next;
    }

    public void setNext(PlayerNode next) {
        this.next = next;
    }
}
