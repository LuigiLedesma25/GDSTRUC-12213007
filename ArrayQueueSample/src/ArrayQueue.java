public class ArrayQueue {
    private Player[] queue;
    private int front; //first element
    private int back; //last element, moves constantly

    public ArrayQueue(int capacity) {
        queue = new Player[capacity];
        front = 0;
        back = 0;
    }

    public void enqueue(Player player){ //add item at back of queue
        //if the last element of array is not empty
        if (back == queue.length){
            Player[] newQueue = new Player[queue.length * 2];
            System.arraycopy(queue, front, newQueue, 0, size());
            queue = newQueue;
            front = 0;
            back = size();
        }

        queue[back++] = player;
    }

    public Player dequeue(){ //remove item at front of queue
        //if queue is empty
        if (size() == 0){
            return null;
        }

        Player removedPlayer = queue[front];
        queue[front++] = null;

        //reset front and back if queue is empty
        if (size() == 0){
            front = 0;
            back = 0;
        }

        return removedPlayer;
    }

    public Player peek(){ //get item at front of queue
        if (size() == 0){
            return null;
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue(){
        for (int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
    }
}
