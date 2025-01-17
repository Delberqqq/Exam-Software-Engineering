package org.example.decorator;

public class EncryptedMessageDecorator implements Message {
    private Message message;

    public EncryptedMessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return "Encrypted: " + message.getContent();
    }
}
