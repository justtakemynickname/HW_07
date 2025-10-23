package hw_07.command;

public class TempDownCommand implements ICommand {
    private final Thermostat thermostat;
    private final int delta;
    public TempDownCommand(Thermostat t, int d) { thermostat = t; delta = d; }
    public void execute() { thermostat.decrease(delta); }
    public void undo() { thermostat.increase(delta); }
}
