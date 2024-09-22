package WeekPlanner;

import java.util.HashMap;
import java.util.Scanner;

public class WeekTask {
    public static void main(String[] args) {
        WeekTask weekTask = new WeekTask();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to WeekPLannner");
            System.out.println("1. Set task  for a day");
            System.out.println("2. View tasks for a day");
            System.out.println("3. View all tasks for a week");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter day : ");
                    String day = scanner.next();
                    weekTask.setTask(day);
                    break;
                case 2:
                    System.out.println("Enter day : ");
                    day = scanner.next();
                    weekTask.viewTask(day);
                    break;
                case 3:

                    weekTask.viewAlltasks();
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
            }


        } while (choice != 4);
        scanner.close();
    }

    private HashMap<String, String> weekPlan;
    private Scanner scanner;

    public WeekTask() {
        weekPlan = new HashMap<>();
        scanner = new Scanner(System.in);

        weekPlan.put("Monday", "");
        weekPlan.put("Tuesday", "");
        weekPlan.put("Wednesday", "");
        weekPlan.put("Thursday", "");
        weekPlan.put("Friday", "");
        weekPlan.put("Saturday", "");
        weekPlan.put("Sunday", "");
    }

    public void setTask(String day) {
        System.out.println("Enter task for" + day);
        String task = scanner.next();
        weekPlan.put(day, task);
        System.out.println("Task set for" + day);
    }

    public void viewTask(String day) {
        String task = weekPlan.get(day);
        if (task.isEmpty()) {
            System.out.println("No task for" + day);
        } else {
            System.out.println(day + " " + task);
        }
    }

    public void viewAlltasks() {
        System.out.println("Week planner : ");
        for (String day : weekPlan.keySet()) {
            String task = weekPlan.get(day);
            if (task.isEmpty()) {
                System.out.println("No task for" + day);
            } else {
                System.out.println(day + " " + task);
            }
        }
    }
}

