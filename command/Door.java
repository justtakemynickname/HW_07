package hw_07.command;

public class Door {
    private boolean open = false;
    public void open() { open = true; System.out.println("Дверь открыта"); }
    public void close() { open = false; System.out.println("Дверь закрыта"); }
}
