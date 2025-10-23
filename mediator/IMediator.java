package hw_07.mediator;

public interface IMediator {
    void join(User user);
    void leave(User user);
    void sendMessage(String message, User sender);
    void sendPrivate(String message, User sender, String receiverName);
    void showHistory();
}
