import java.util.*;
import util.*;
import school.*;

public class PrintReports{
    Student s;
   Teacher t;
    Classroom c;
    String firstName = null;
    String lastName = null;
    String subject = null;
    int studentId = 0;
    int finalGrade = 0;
    int roomNumber = 0;
    int i = 0;
    ArrayList<Displayable> tch = new ArrayList<Displayable>();
    ArrayList<Displayable> stu = new ArrayList<Displayable>();
    ArrayList<Displayable> cls = new ArrayList<Displayable>();
    //ArrayList<Displayable> rep = new ArrayList<Displayable>(cls);

    public Displayable enterTeacher(){
        System.out.println("Now enter the Teacher's name and Subject.");
        firstName = KeyboardReader.getPromptedString("Enter the teacher's first name:");
        lastName = KeyboardReader.getPromptedString("Enter the teacher's last name:");
        subject = KeyboardReader.getPromptedString("Enter the subject taught:");
        t = new Teacher(firstName, lastName, subject);
        tch.add(t);
        return t;

    }
    public Displayable enterStudent(){
        System.out.println("You will now enter the students of the class.");
        firstName = KeyboardReader.getPromptedString("Enter the student's first name:");
        lastName = KeyboardReader.getPromptedString("Enter the student's last name:");
        do{studentId = KeyboardReader.getPromptedInt("Enter the student's ID number:");
            if (studentId <= 0) System.out.println("ID number must be greater than zero.");
    }while (studentId <= 0);
        do{finalGrade = KeyboardReader.getPromptedInt("Enter the student's final grade:");
            if (finalGrade < 0 || finalGrade > 100) System.out.println("Final Grade must be between 0 and 100.");
    }while (finalGrade < 0 || finalGrade > 100);
    s = new Student(firstName, lastName, studentId, finalGrade);
    stu.add(s);
    return s;
    }

    public Displayable enterClassroom(){
        char again = 'Y';
        System.out.println("First you will enter the classroom.");
        do {roomNumber = KeyboardReader.getPromptedInt("Enter the classroom number:");
        if (roomNumber < 100) System.out.println("Classroom number must be more than 100");
    } while (roomNumber < 100);

     enterTeacher();

    do{
         enterStudent();
        again = KeyboardReader.getPromptedChar("Would you like to enter another student? (Y or N)");
    } while (again == 'Y' || again == 'y');

    
    c = new Classroom();
    // Maybe put cls.add(c) here, instead of put after the enterClassroom() method in PrintReports
    return c;
    
}

    
    

    void report(ArrayList<Displayable> rep){
        for(i = 0; i < cls.size(); i++){
            c.display();
            System.out.println("Room number: " + roomNumber);
            System.out.println();
            System.out.println(t.display());
            System.out.println();
            System.out.println();
            for(i = 0; i < stu.size(); i++){
                System.out.println(stu.get(i).display());
            }
          
        }
    }

    public static void main(String[] args){
        new PrintReports();
    }

    public PrintReports(){
        char another = 'Y';
        do { 
           enterClassroom();
            cls.add(c);
            // Maybe not here, instead put at the end of enterClassroom() method
           another = KeyboardReader.getPromptedChar("Would you like to enter another classroom? (Y or N)");
        }
        while (another == 'Y' || another == 'y');

        for(i = 0; i < cls.size(); i++){
        cls.get(i);
        report(cls());
        System.out.println();
        }
    }

}
