package com.toborowicz;

public class Task {
    private String task;

    @Override
    public String toString() {
        return task;
    }

    public Task(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

}
