package uap.basis;

public abstract class Shape {
    private String name;
    
    public Shape() {
        this.name = "Shape";
    }
    
    public void setName(String inputName) {
        this.name = inputName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public abstract void printInfo();
}