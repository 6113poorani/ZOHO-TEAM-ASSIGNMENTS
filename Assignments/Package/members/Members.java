package library.members;

public class Members {
    private String name;
    private int id;
    private int borrow;
    public Members(String name,int id){
        this.name=name;
        this.id=id;
        this.borrow=0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getBorrow() {
        return borrow;
    }

    public void setBorrow() {
        this.borrow = borrow+1;
    }
    public void returnbook() {
        if(this.borrow>0){
            this.borrow--;
        }

    }

}
