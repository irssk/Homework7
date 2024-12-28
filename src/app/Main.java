package app;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add("Alen");
        board.add("Yoda");
        board.add("Obi-van");

        board.draw();

        System.out.println("Delivering: " + board.deliver());
        board.draw();

        System.out.println("Delivering order 3: " + board.deliver(3));
        board.draw();
    }
}