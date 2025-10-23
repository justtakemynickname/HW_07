package hw_07.command;

public class DoorCloseCommand implements ICommand {
    private final Door door;
    public DoorCloseCommand(Door door) { this.door = door; }
    public void execute() { door.close(); }
    public void undo() { door.open(); }
}
