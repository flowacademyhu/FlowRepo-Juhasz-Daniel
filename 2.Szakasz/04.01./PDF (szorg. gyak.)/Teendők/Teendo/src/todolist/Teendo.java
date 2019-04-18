package todolist;

public class Teendo {

    private String name;
    private String time;
    private int priority;
    private boolean completed;

    public Teendo() {
    }

    public boolean atvalt(){
        if(this.completed == false) {
            this.completed = true;
        } else {
            this.completed = false;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
