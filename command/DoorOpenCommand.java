package hw_07.command;

public class DoorOpenCommand implements ICommand {
    private final Door door;
    public DoorOpenCommand(Door door) { this.door = door; }
    public void execute() { door.open(); }
    public void undo() { door.close(); }
}
