package hw_07.command;

public class TempUpCommand implements ICommand {
    private final Thermostat thermostat;
    private final int delta;
    public TempUpCommand(Thermostat t, int d) { thermostat = t; delta = d; }
    public void execute() { thermostat.increase(delta); }
    public void undo() { thermostat.decrease(delta); }
}
