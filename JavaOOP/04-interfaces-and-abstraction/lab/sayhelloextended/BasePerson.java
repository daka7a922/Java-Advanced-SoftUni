package sayhelloextended;

public abstract class BasePerson {

    private String name;

    protected BasePerson(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(){
        this.name = name;
    }
}
