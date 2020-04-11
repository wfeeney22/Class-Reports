package school;
import java.util.*;
import util.Displayable;

public class Classroom implements Displayable{
    int roomNumber = 0;
    Displayable teacher;
    ArrayList<Displayable> students;
    String s = null;

    public Classroom(){}

    public Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students){
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.students = students;

    }

    @Override
    public String display(){
        return s;
    }
}