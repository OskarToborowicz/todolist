package com.toborowicz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Type in the task you want to do.");
        Scanner scan = new Scanner(System.in);
        Task task = new Task(scan.nextLine());
        List<Task> taskList = new ArrayList<>();
        taskList.add(task);
        System.out.println("Do you want to add more to the list? (type yes if you want to continue)");
        while (scan.nextLine().equals("yes")){
            taskList.add(new Task(scan.nextLine().trim()));
            System.out.println("Do you want to add more to the list? (type yes if you want to continue)");
        }

        scan.close();
        System.out.println(taskList.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }
}
