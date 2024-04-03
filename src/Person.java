package src;

public class Person {
    private int id = 1;
    static int count = 1;
    public Person() {
        id = count++;
    }
    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }
}
