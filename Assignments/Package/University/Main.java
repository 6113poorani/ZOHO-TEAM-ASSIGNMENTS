package University;

import University.courses.Courses;
import University.faculty.Faculty;
import University.student.Students;

public class Main {
    public static void main(String[] args) {
        Faculty f1=new Faculty("poorani");
        Courses c1=new Courses("java",f1);
        f1.addCourse(c1);
        Students s1=new Students("xxx");
        s1.addCourse(c1);
    }
}
