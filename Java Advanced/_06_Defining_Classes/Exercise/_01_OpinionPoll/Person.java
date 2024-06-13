package _06_Defining_Classes.Exercise._01_OpinionPoll;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){

        this.name = name;
        this.age = age;

    }

public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public String toString(){

    return String.format("%s - %d",this.getName(), this.getAge());
}


}
