package hw_07.command;

public class Alarm {
    private boolean active = false;
    public void activate() { active = true; System.out.println("Сигнализация активирована"); }
    public void deactivate() { active = false; System.out.println("Сигнализация деактивирована"); }
}
