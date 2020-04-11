package school;
import java.util.*;
import util.Displayable;

public class Student extends Person implements Displayable{
    int studentId = 0;
    int finalGrade = 0;

    public Student(){}

    public Student(String firstName, String lastName, int studentId, int finalGrade){
        super (firstName, lastName);
        setStudentId(studentId);
        setFinalGrade(finalGrade);
    }

    public String display(){
        return "Student Id: " + getStudentId() + "       " + getFullName() + "      Final Grade: " + getFinalGrade();
    }

    public int getStudentId(){return studentId;}

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getFinalGrade(){return finalGrade;}

    public void setFinalGrade(int finalGrade){
        this.finalGrade = finalGrade;
    }
}