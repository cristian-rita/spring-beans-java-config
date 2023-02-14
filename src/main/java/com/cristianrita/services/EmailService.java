package com.cristianrita.services;

public class EmailService implements Sender {
    public EmailService() {
        System.out.println("EmailService created!");
    }

    @Override
    public void send(String to, String message) {
        System.out.println("Sending email to " + to + " with message " + message);
    }

    public void initializeEmailService() {
        System.out.println("Doing initialization work");
    }
}
