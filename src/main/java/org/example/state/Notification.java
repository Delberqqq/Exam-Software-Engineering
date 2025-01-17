package org.example.state;

public class Notification {
    private NotificationState state;

    public void setState(NotificationState state) {
        this.state = state;
    }

    public void process() {
        state.handle();
    }
}
