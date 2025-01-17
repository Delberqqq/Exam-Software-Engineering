package org.example;

import org.example.singleton.NotificationService;
import org.example.observer.*;
import org.example.decorator.*;
import org.example.state.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        NotificationService notificationService = NotificationService.getInstance();

        // Observer
        NotificationManager manager = new NotificationManager();
        Subscriber alice = new UserSubscriber("Alice");
        Subscriber bob = new UserSubscriber("Bob");
        manager.subscribe(alice);
        manager.subscribe(bob);

        manager.notifySubscribers("Promotion: 20% off!");

        // Decorator
        Message message = new BasicMessage("Your order has been shipped.");
        Message encryptedMessage = new EncryptedMessageDecorator(message);
        notificationService.sendNotification(encryptedMessage.getContent());

        // State
        Notification notification = new Notification();
        notification.setState(new NewState());
        notification.process();
    }
}
