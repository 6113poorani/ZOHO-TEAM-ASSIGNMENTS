package library.books;

public class Books {
    private String title;
    private String author;
    private boolean isAvailable=false;
    public Books(String title,String author){
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
