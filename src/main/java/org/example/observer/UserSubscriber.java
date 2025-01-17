package org.example.observer;

public class UserSubscriber implements Subscriber {
    private String name;

    public UserSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
