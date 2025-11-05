package src.main;

import java.sql.Date;
import java.util.HashMap;

public class ManageTask{
    private HashMap<Integer,Task> listTask = new HashMap<>();

    public void addNewTask(String title, String description, char pririty, Date date){
        int id = listTask.size() + 1;
        States statesTask = States.OPEN;
        Task taskSave = new Task(id, title, description, pririty, date, statesTask);
        listTask.put(id, taskSave);
    }

    public void taskList(){
        for(Task task : listTask.values()){
            System.out.println(task.toString());
        }
    }


    public void startTask(int id){
        Task updatedTask = listTask.get(id);
        updatedTask.setStates(States.IN_PROGRESS);
        listTask.put(id, updatedTask);
    }

    public void finishtTask(int id){
        Task updatedTask = listTask.get(id);
        updatedTask.setStates(States.FINISHED);
        listTask.put(id, updatedTask);
    }

    public void deleteTask(int id){
        listTask.remove(id);
    }

    public boolean findUser(int id){
        return listTask.containsKey(id);
    }

    
}