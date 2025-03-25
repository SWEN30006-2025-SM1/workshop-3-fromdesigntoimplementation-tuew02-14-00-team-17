package com.unimelb.swen30006.workshops;

public class Assignment {
    String description;
    Date dueDate;
    int maxAttempts;
    String name;

    public Assignment(String description, Date dueDate, int maxAttempts, String name) {
        this.description = description;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
        this.name = name;
    }

    public void invalidSubmissions() {
        // Logic for invalid submissions
    }

    public void validSubmissions() {
        // Logic for valid submissions
    }
}
