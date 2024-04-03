package mx.uv.coatza.todo.model;

public class todo {
    private int id;
    private String title;
    private String description;
    private boolean completed;



    public todo(int id, String title, String description, boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
