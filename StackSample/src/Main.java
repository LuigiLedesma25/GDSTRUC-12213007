public class Main {
    public static void main(String[] args) {
        ArrayStack playerStack = new ArrayStack(10); //whatever is added last is pushed to first
        playerStack.push(new Player(1, "Saitama", 999));
        playerStack.push(new Player(2, "Deku", 100));
        playerStack.push(new Player(3, "Saiki", 500));
        System.out.println("Initial stack contents");
        playerStack.printStack();

        System.out.println("Pop element " + playerStack.pop());
        System.out.println("Peek after pop " + playerStack.peek());

        playerStack.push(new Player(4, "Sakamoto", 10));
        playerStack.printStack();
    }
}
        //push adds, pop is removal, peek is accessing top item but no changes