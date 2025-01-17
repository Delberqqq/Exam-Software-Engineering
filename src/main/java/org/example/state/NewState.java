package org.example.state;

public class NewState implements NotificationState {
    @Override
    public void handle() {
        System.out.println("Notification is NEW.");
    }
}
