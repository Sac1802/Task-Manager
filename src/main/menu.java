package src.main;

import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.Scanner;

public class menu {
    private final ManageTask manageTask;
    Scanner scanner = new Scanner(System.in);

    public menu() {
        manageTask = new ManageTask();
    }

    public void showMenu() {
        int election = 0;
        do {
            System.out.println("~~~~~~Task Manager in Terminal~~~~~~");
            System.out.println("1. Add new Task");
            System.out.println("2. View all tasks");
            System.out.println("3. Start Task");
            System.out.println("4. Finish task");
            System.out.println("5. Delete Task");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");
            election = scanner.nextInt();
            scanner.nextLine();
            optionUser(election);
        } while (election != 6);
        scanner.close();
    }

    private void optionUser(int election) {
        switch (election) {
            case 1:
                addTak();
                clearConsole();
                break;
            case 2:
                listTask();
                break;
            case 3:
                updateStatus("start");
                clearConsole();
                break;
            case 4:
                updateStatus("finish");
                clearConsole();
                break;
            case 5:
                updateStatus("delete");
                clearConsole();
                break;
            default:
                break;
        }
        
    }

    private void addTak() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.println("H -> (Higt), M -> (Medium), L -> (Low)");
        System.out.print("Priority : ");
        String priority = scanner.nextLine();
        System.out.println("Formater Date DD/MM/YYYY");
        System.out.print("Date: ");
        String date = scanner.nextLine();
        Date dateConvert = convertStringToDate(date);
        char priorityChar = convertStringToChar(priority);
        manageTask.addNewTask(title, description, priorityChar, dateConvert);
    }

    private void listTask() {
        manageTask.taskList();
    }

    private void updateStatus(String option) {
        manageTask.taskList();
        System.out.print("Enter Id of Task: ");
        int id = scanner.nextInt();
        if (manageTask.findUser(id)) {
            switch (option) {
                case "start":
                    manageTask.startTask(id);
                    break;
                case "finish":
                    manageTask.finishtTask(id);
                    break;
                case "delete":
                    manageTask.deleteTask(id);
                    break;
                default:
                    break;
            }
        }
    }

    private Date convertStringToDate(String date) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilDate = format.parse(date);
            return new java.sql.Date(utilDate.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private char convertStringToChar(String priority) {
        try {
            char value = priority.charAt(0);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return 'n';
        }
    }

    private void clearConsole() {
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la consola");
        }
    }
}
