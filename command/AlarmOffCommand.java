package hw_07.command;

public class AlarmOffCommand implements ICommand {
    private final Alarm alarm;
    public AlarmOffCommand(Alarm alarm) { this.alarm = alarm; }
    public void execute() { alarm.deactivate(); }
    public void undo() { alarm.activate(); }
}
