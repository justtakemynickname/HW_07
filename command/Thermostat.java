package hw_07.command;

public class Thermostat {
    private int temperature;
    public Thermostat(int initial) { temperature = initial; }
    public void increase(int v) { temperature += v; System.out.println("Температура: " + temperature); }
    public void decrease(int v) { temperature -= v; System.out.println("Температура: " + temperature); }
    public int getTemperature() { return temperature; }
}
