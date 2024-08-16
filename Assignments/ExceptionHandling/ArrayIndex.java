public class ArrayIndex {
    public static void main(String[] args) {
        try{
            System.out.println(args[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }
    }
}
