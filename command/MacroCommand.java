package hw_07.command;

import java.util.List;

public class MacroCommand implements ICommand {
    private final List<ICommand> commands;
    public MacroCommand(List<ICommand> commands) { this.commands = commands; }
    public void execute() { for (ICommand c : commands) c.execute(); }
    public void undo() { for (int i = commands.size()-1; i>=0; i--) commands.get(i).undo(); }
}
