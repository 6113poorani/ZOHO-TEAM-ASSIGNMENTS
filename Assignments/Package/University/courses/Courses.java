package University.courses;

import University.faculty.Faculty;
import University.student.Students;
import java.util.*;

public class Courses {
    private String name;
    private Faculty faculty;
    List<Students> enrolledStudents;
    public Courses(String name,Faculty faculty){
        this.name=name;
        this.faculty=faculty;
        this.enrolledStudents=new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public List<Students> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void addStudents(Students s){
        if(!enrolledStudents.contains(s)){
            enrolledStudents.add(s);
        }
        else
            System.out.println("The student already enrolled this course");
    }

}
