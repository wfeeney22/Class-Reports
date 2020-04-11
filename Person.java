package school;

public abstract class Person{
    public String firstName = null;
    public String lastName = null;

    public Person(){
    }

    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {return lastName;}

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}