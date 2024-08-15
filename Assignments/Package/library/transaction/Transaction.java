package library.transaction;

import library.books.Books;
import library.members.Members;

public class Transaction {
    private Books book;
    private Members member;
    private String transaction;
    public Transaction(Books book,Members member,String transaction){
        this.book=book;
        this.member=member;
        this.transaction=transaction;
        process();
    }
    public void process(){
        if(transaction.equals("Borrow")){
            if(book.isAvailable()==true){
                book.setAvailable(false);
                member.setBorrow();
                System.out.println(member.getName()+" borrowed "+book.getTitle());
            }
            else
                System.out.println("Book is not Available");
        }
        else if(transaction.equals("Return")){
            if(book.isAvailable()==false){
                book.setAvailable(true);
                member.returnbook();
                System.out.println(member.getName()+" returned "+book.getTitle());
            }
            else{
                System.out.println("Book is not borrowed");
            }
        }
    }
}
