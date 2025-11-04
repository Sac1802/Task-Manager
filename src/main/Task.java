package src.main;
import java.util.Date;

public class Task {

    private int id;
    private String title;
    private String description;
    private char priority;
    private Date date;
    private States statesTask;

    public Task(int id, String title, String decription, char priority, Date date, States statesTask) {
        this.id = id;
        this.title = title;
        this.description = decription;
        this.priority = priority;
        this.date = date;
        this.statesTask = statesTask;
    }

    /**
     * Getters Methods
     */
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public char getPriority() {
        return priority;
    }

    public Date getDate() {
        return date;
    }

    public States getStates(){
        return statesTask;
    }

    /**
     * Setters Method
     */

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(char priority) {
        this.priority = priority;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStates(States statesTask){
        this.statesTask = statesTask;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", date=" + date +
                ", State Task=" + statesTask +
                '}';
    }

}
