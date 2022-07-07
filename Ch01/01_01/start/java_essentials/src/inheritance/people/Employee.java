package inheritance.people;

public class Employee extends Person {
    private String employeedId;
    private String title;

    public String getEmployeedId() {
        return employeedId;
    }

    public void setEmployeedId(String employeedId) {
        this.employeedId = employeedId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
