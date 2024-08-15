package University.faculty;

import University.courses.Courses;
import java.util.*;
public class Faculty {
    private String name;
    private List<Courses> taught;
    public Faculty(String name){
        this.name=name;
        this.taught=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Courses> getTaught() {
        return taught;
    }

    public void addCourse(Courses c){
        if (!taught.contains(c)) {
            taught.add(c);
            System.out.println(name + " is now teaching " + c.getName());
        } else {
            System.out.println(name + " is already teaching " + c.getName());
        }

    }
}
