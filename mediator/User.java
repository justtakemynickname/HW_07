package hw_07.mediator;

public class User {
    private final IMediator mediator;
    private final String name;
    public User(IMediator mediator, String name) { this.mediator = mediator; this.name = name; }
    public String getName() { return name; }
    public void join() { mediator.join(this); }
    public void leave() { mediator.leave(this); }
    public void send(String message) { mediator.sendMessage(message, this); }
    public void sendPrivate(String message, String receiverName) { mediator.sendPrivate(message, this, receiverName); }
    public void receive(String message, String from) { System.out.println(name + " получил от " + from + ": " + message); }
    public void receivePrivate(String message, String from) { System.out.println(name + " получил личное от " + from + ": " + message); }
}
