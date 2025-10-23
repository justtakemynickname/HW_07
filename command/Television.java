package hw_07.command;

public class Television {
    private boolean on = false;
    public void on() { on = true; System.out.println("Телевизор включен"); }
    public void off() { on = false; System.out.println("Телевизор выключен"); }
}
