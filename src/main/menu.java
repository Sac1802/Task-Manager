package src.main;
import java.util.Scanner;

public class menu {
    
    public void showMenu(){
        int election = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("~~~~~~Task Manager in Terminal~~~~~~");
            System.out.println("1. Add new Task");
            System.out.println("2. View all tasks");
            System.out.println("3. Start Task");
            System.out.println("4. Finish task");
            System.out.println("5. Delete Task");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");
            election = scanner.nextInt();
        }while(election != 6);
        scanner.close();
    }

}
