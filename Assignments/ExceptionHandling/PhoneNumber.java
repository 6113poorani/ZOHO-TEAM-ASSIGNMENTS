import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {

        try{
            Scanner scn=new Scanner(System.in);
            Long n=scn.nextLong();
            System.out.println(n);
        }
        catch(InputMismatchException e){
            System.out.println("There is no alphabetic or special characters allowed");
        }

    }
}
