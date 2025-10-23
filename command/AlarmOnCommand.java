package hw_07.command;

public class AlarmOnCommand implements ICommand {
    private final Alarm alarm;
    public AlarmOnCommand(Alarm alarm) { this.alarm = alarm; }
    public void execute() { alarm.activate(); }
    public void undo() { alarm.deactivate(); }
}
