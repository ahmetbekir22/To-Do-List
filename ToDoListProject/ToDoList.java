import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void  add(String task){
        tasks.add(task);
    }

    public void markComplate(int index){
        if(index>=0 && index <tasks.size()){
            String task =tasks.get(index);
            System.out.println(tasks.set(index,"[Complated] "+ task));            
        }else{
            System.out.println("invalid task index.!");
        }
    }

    public void delete(int index){
        if(index>=0 && index <=tasks.size()){
            String task =tasks.remove(index);
            System.out.println(task +" has been deleted.");
        }else{
            System.out.println("invalid task index!");
        }
    }

    public void showTask(){
        System.out.println("\ncurrent tasks: ");
        for(int i = 0;i <tasks.size();i++){
            System.out.println((i +1) + ":"+ tasks.get(i));
        }
    }
}
