package com.example.todo_app.Data;

import java.util.ArrayList;

public class DataClass {
    public String text;
    public boolean isDone;
    public ArrayList<DataClass> id;

    public DataClass( boolean isDone, String text) {
        this.text = text;
        this.isDone = isDone;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
