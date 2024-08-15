package library;

import library.books.Books;
import library.members.Members;
import library.transaction.Transaction;

public class Main {
    public static void main(String[] args) {
        Books b=new Books("java","xxx");
        Members m=new Members("poorani",1);
        Transaction t=new Transaction(b,m,"Borrow");
        Transaction t1=new Transaction(b,m,"Return");
        Transaction t2=new Transaction(b,m,"Return");

    }
}
