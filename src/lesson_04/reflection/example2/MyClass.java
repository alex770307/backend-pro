package lesson_04.reflection.example2;

public class MyClass {
    private int number;
    private String name = "default value";

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println(name + ", " + number);
    }
}
