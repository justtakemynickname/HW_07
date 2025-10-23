// hw_07/command/Invoker.java
package hw_07.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class Invoker {
    private final Deque<ICommand> history = new ArrayDeque<>();
    public void executeCommand(ICommand cmd) {
        if (cmd == null) { System.out.println("Ошибка: команда не задана"); return; }
        cmd.execute();
        history.push(cmd);
    }
    public void undoLast() {
        if (history.isEmpty()) { System.out.println("Ошибка: нет команд для отмены"); return; }
        ICommand cmd = history.pop();
        cmd.undo();
    }
    public void undoMultiple(int n) {
        if (n <= 0) return;
        for (int i = 0; i < n; i++) {
            if (history.isEmpty()) { System.out.println("Ошибка: недостаточно команд для отмены"); return; }
            history.pop().undo();
        }
    }
}
