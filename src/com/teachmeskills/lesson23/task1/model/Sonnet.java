package com.teachmeskills.lesson23.task1.model;

import java.util.List;

public class Sonnet {
    private String  lastName;
    private String firstName;
    private String title;
    private List<String> line;

    public List<String> getLine() {
        return line;
    }

    public String getTitle() {
        return title;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLine(List<String> line) {
        this.line = line;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}


