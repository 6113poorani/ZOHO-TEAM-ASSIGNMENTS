package CustomException;

public class Main2{
    public static void main(String[] args) {
        int n=-1;
        try {
            if (n < 0) {
                throw new customException();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
}
