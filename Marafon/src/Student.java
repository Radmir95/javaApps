
public class Student {
    private double result;
    private String name;
    private String lastName;

    public Student(){
        this.result = Math.random()*2+2;
        this.name = "Ivan";
        this.lastName = "Petrov";
    }

    public Student(String name, String lastName) {
        this.result = Math.random()*2+2;
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
