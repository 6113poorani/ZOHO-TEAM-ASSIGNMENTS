package University.student;
import University.courses.Courses;
import java.util.*;

public class Students {
    String name;
    List<Courses> enrolledCourses;
    public Students(String name){
        this.name=name;
        this.enrolledCourses=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Courses> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void addCourse(Courses course){
        if(!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudents(this);
            System.out.println(name+" enrolled "+course.getName());
        }
        else
            System.out.println("The course is already enrolled ");
    }
}
