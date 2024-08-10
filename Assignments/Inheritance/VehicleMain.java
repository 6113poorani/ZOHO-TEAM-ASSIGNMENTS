class Vehicle{
    String brand;
    String color;
    int year;
    Vehicle(){
        this.brand="unknown";
        this.color="black";
        this.year=2000;
    }
    Vehicle(String brand,String color,int year){
        this.brand=brand;
        this.color=color;
        this.year=year;
    }
    void describe(){
        System.out.println("Brand of the Vehicle : "+brand);
        System.out.println("Color of the Vehicle : "+color);
        System.out.println("Manufactured Year : "+year);
    }
}
class Car extends Vehicle{
    int wheels;
    Car(){
        super();
    }
    Car(String brand,String color,int year,int wheels){
        super(brand,color,year);
        this.wheels=wheels;
    }
    void describe(){
        super.describe();
        System.out.println("No.of.Wheels for the Car : "+wheels);
    }
}
class MotorCycle extends Vehicle{
    boolean helmet;
    MotorCycle(){
        super();
    }
    MotorCycle(String brand,String color,int year,boolean helmet){
        super(brand,color,year);
        this.helmet=helmet;
    }
    void describe(){
        super.describe();
        System.out.println("Free helmet : "+helmet);
    }
}
class Flight extends Vehicle{
    boolean parasuit;
    Flight(){
        super();
    }
    Flight( String brand,String color,int year,boolean parasuit){
        super(brand,color,year);
        this.parasuit=parasuit;
    }
    void describe(){
        super.describe();
        System.out.println("Free parasuit : "+parasuit);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
    Vehicle v=new Vehicle();
    Car c=new Car("Toyoto","Black",2010,5);
    MotorCycle m=new MotorCycle("Honda","white",2014,true);
    Flight f=new Flight("Spicejet","red",2034,true);
    v.describe();
        System.out.println("---------------------------------------");
        c.describe();
        System.out.println("---------------------------------------");
        m.describe();
        System.out.println("---------------------------------------");
        f.describe();
        System.out.println("---------------------------------------");
    }
}
