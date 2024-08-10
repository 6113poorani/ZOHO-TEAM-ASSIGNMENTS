class LibraryManagementSystem{
    String userType;
    String userName;
    String passWord;
    void login(){

    }
    void register(){

    }
    void logout(){

    }
}
class User extends LibraryManagementSystem{
    String name;
    int id;
    void verify(){

    }
    void checkAccount(){

    }
    void get_book_info(){

    }
}
class  Librarian extends LibraryManagementSystem{
    String name,passWord,searchString;
    int id;
    void verify_librarian(){

    }
    void search(){

    }
}
class Book extends LibraryManagementSystem{
    String title,author,isbn,publication;
    void show_duedt(){

    }
    void reservation_status(){

    }
    void feedBack(){

    }
    void book_request(){

    }
    void renew_info(){

    }
}
class Account extends User{
    int no_borrowed_books, no_reserved_books;
     int no_returned_books, no_lost_books,fine_amount;
     void calculate_fine(){

     }
}
class LibraryDataBase extends Librarian{
    int List_of_books;
    void add(){

    }
    void delete(){

    }
    void update(){

    }
    void dispaly(){

    }
    void search(){

    }
}
class Staff extends User{
    String dept;
}
class Students extends User{
    String Class;
}
public class LibraryMain {
    public static void main(String[] args) {

    }
}

