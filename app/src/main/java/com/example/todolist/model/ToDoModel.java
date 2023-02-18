package com.example.todolist.model;

public class ToDoModel {

    private int id,status;
    private String task;

    // id - is an integer - primary key
    // status - is actually a boolean - but we are going to use integer as boolean 0 for false ,1 for true
    // task - is a String - contain the task


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
