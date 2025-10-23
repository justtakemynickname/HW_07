package hw_07;

import hw_07.command.*;
import hw_07.template.*;
import hw_07.mediator.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        demoCommand();
        System.out.println("\n----------------------\n");
        demoTemplate();
        System.out.println("\n----------------------\n");
        demoMediator();
    }

    static void demoCommand() {
        System.out.println("COMMAND DEMO");
        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat(20);
        Television tv = new Television();
        Alarm alarm = new Alarm();

        Invoker invoker = new Invoker();

        ICommand lightOn = new LightOnCommand(light);
        ICommand lightOff = new LightOffCommand(light);
        ICommand doorOpen = new DoorOpenCommand(door);
        ICommand doorClose = new DoorCloseCommand(door);
        ICommand tempUp = new TempUpCommand(thermostat, 3);
        ICommand tempDown = new TempDownCommand(thermostat, 2);
        ICommand tvOn = new TelevisionOnCommand(tv);
        ICommand tvOff = new TelevisionOffCommand(tv);
        ICommand alarmOn = new AlarmOnCommand(alarm);
        ICommand alarmOff = new AlarmOffCommand(alarm);

        invoker.executeCommand(lightOn);
        invoker.executeCommand(doorOpen);
        invoker.executeCommand(tempUp);

        invoker.undoLast();

        MacroCommand morning = new MacroCommand(Arrays.asList(lightOn, tvOn, tempUp));
        invoker.executeCommand(morning);
        invoker.undoMultiple(2);

        invoker.executeCommand(alarmOn);
        invoker.undoLast();

        invoker.undoLast();
    }

    static void demoTemplate() {
        System.out.println("TEMPLATE METHOD DEMO");
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        HotChocolate hotChocolate = new HotChocolate();
        Coffee coffeeNoCond = new Coffee(true);

        System.out.println("\nTea:");
        tea.prepareRecipe();

        System.out.println("\nCoffee:");
        coffee.prepareRecipe();

        System.out.println("\nHotChocolate:");
        hotChocolate.prepareRecipe();

        System.out.println("\nCoffee without condiments (hook):");
        coffeeNoCond.prepareRecipe();

        Coffee broken = new Coffee();
        broken.setHasIngredients(false);
        System.out.println("\nBroken coffee (no ingredients):");
        broken.prepareRecipe();
    }

    static void demoMediator() {
        System.out.println("MEDIATOR DEMO");
        ChatRoom room = new ChatRoom();
        User alice = new User(room, "Alice");
        User bob = new User(room, "Bob");
        User charlie = new User(room, "Charlie");

        alice.join();
        bob.join();
        charlie.join();

        alice.send("Hello everyone");
        bob.sendPrivate("Hi Charlie", "Charlie");

        charlie.leave();

        alice.send("Charlie left?");
        User ghost = new User(room, "Ghost");
        ghost.send("I am not joined");

        room.showHistory();
    }
}
