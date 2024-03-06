public class Book {
    String author, title;
    boolean isAvailable;
    int ISBN;

    Book(String author, String title, boolean isAvailable, int ISBN){
        this.author = author;
        this.title = title;
        this.isAvailable = isAvailable;
        this.ISBN = ISBN;
    }

    void bookDetail(){

        System.out.println("====================");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Availble: " + isAvailable);
        System.out.println("ISBN: "+ ISBN);
        System.out.println("====================");
    }



}
