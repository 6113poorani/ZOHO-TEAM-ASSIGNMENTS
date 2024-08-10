class Student{
    String name;
    int age;
    Student(){
        this.name="Unknown";
        this.age=20;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void detailsInfo(){
        System.out.println("Name of the Student: "+name);
        System.out.println("Age of the student "+age);
    }
}
class ZSGSStudent extends Student{
    int year;
    String course;
    ZSGSStudent(){
        super();
        this.year=2000;
        this.course="REACT";
    }
    ZSGSStudent(String name,int age,int year,String course){
        super(name,age);
        this.year=year;
        this.course=course;
    }
    void detailsInfo(){
        super.detailsInfo();
        System.out.println("year of joining :"+year);
        System.out.println("Course name :"+course);
        System.out.println("-------------------------------------------------");
    }
}
public class ZSMain {
    public static void main(String[] args) {
        ZSGSStudent s1=new ZSGSStudent();
        s1.detailsInfo();
        ZSGSStudent s2=new ZSGSStudent("Poorani",21,2024,"java");
        s2.detailsInfo();
        ZSGSStudent s3=new ZSGSStudent("Lokeshwari",20,2025,"html");
        s3.detailsInfo();
        ZSGSStudent s4=new ZSGSStudent("sangamithra",19,2026,"javascript");
        s4.detailsInfo();


    }
}
