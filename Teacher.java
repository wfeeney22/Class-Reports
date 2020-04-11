package school;
import java.util.*;
import util.Displayable;

public class Teacher extends Person implements Displayable{
    String subject = null;

    public Teacher(){}

    public Teacher(String firstName, String lastName, String subject){
        super (firstName, lastName);
        setSubject(subject);
    }

    public String display(){
        return getFullName() + " teaches " + getSubject();
    }

    public String getSubject() {return subject;}

    public void setSubject(String subject){
        this.subject = subject;
    }

 
}