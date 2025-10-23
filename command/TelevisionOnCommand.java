package hw_07.command;

public class TelevisionOnCommand implements ICommand {
    private final Television tv;
    public TelevisionOnCommand(Television tv) { this.tv = tv; }
    public void execute() { tv.on(); }
    public void undo() { tv.off(); }
}
