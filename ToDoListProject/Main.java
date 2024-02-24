import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ToDoList toDoList =new ToDoList();
        Scanner scan =new Scanner(System.in);
        boolean exit = false;

while(!exit){
    System.out.println("WELCOME \n1. Add Task\n2." +
     "Mark Task as Complete\n3. Delete Task\n4."
     +" View Tasks\n5. Exit");
    System.out.print("Enter your choice: ");


    int choice =scan.nextInt();
    scan.nextLine();

    switch (choice){
        case 1:
            System.out.print("Enter task to add: ");
            String taskToAdd = scan.nextLine();
            toDoList.add(taskToAdd);
            System.out.println("You addeed "+taskToAdd +" as a new task.");
            break;
        case 2:
            System.out.print("pick the task you finished: ");
            int taskToMark = scan.nextInt();
            toDoList.markComplate(taskToMark);
            break;
        case 3:
            System.out.print("pick the task you want to delete: ");
            int taskToDelete = scan.nextInt();
            toDoList.delete(taskToDelete);
            break;
        case 4:
            toDoList.showTask();
            break;
                
        case 5:
            exit = true;
            break;
        default:
            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
    }
        }
            scan.close();
            }

        }
    