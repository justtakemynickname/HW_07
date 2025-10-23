package hw_07.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IMediator {
    private final List<User> users = new ArrayList<>();
    private final List<String> history = new ArrayList<>();
    public void join(User user) {
        if (!users.contains(user)) {
            users.add(user);
            String note = user.getName() + " присоединился";
            System.out.println(note);
            history.add(note);
        }
    }
    public void leave(User user) {
        if (users.remove(user)) {
            String note = user.getName() + " покинул чат";
            System.out.println(note);
            history.add(note);
        } else {
            System.out.println("Ошибка: пользователь не в чате");
        }
    }
    public void sendMessage(String message, User sender) {
        if (!users.contains(sender)) { System.out.println("Ошибка: отправитель не в чате"); return; }
        for (User u : users) if (u != sender) u.receive(message, sender.getName());
        history.add(sender.getName() + ": " + message);
    }
    public void sendPrivate(String message, User sender, String receiverName) {
        if (!users.contains(sender)) { System.out.println("Ошибка: отправитель не в чате"); return; }
        User receiver = null;
        for (User u : users) if (u.getName().equals(receiverName)) receiver = u;
        if (receiver == null) { System.out.println("Ошибка: получатель не найден"); return; }
        receiver.receivePrivate(message, sender.getName());
        history.add("(ЛС) " + sender.getName() + " -> " + receiverName + ": " + message);
    }
    public void showHistory() {
        System.out.println("История чата:");
        for (String s : history) System.out.println(s);
    }
}
