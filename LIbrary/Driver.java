import java.util.Scanner;

public class Driver {
    static Scanner s = new Scanner(System.in);
    static Library library = new Library();

    
    static int iISBN;

     public static void main (String args[]){
        
        menu();
        //newLib.myLibrary.add(null);
        


    }
    static void menu(){
        System.out.println("Welcome to Library");
        System.out.println(" 1. Borrow books \n 2. Return Books \n 3. Remove Books \n 4. Add Books \n 5. Display Books ");
        System.out.print(": ");
        int choice = s.nextInt();
        s.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter ISBN: ");
                int iISBN = s.nextInt();
                borrowBook(iISBN);
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                newAddBook();
                break;
            case 5:
                listOfBooks();
                break;
        
            default:
                break;
        }
    
    
    
    }

    static void newAddBook(){
        String iAuthor,title;
        boolean iIsAvailable;
        
        
        System.out.print("Author: ");
        iAuthor = s.nextLine();
        System.out.print("Title: ");
        title = s.nextLine();
        //
        System.out.print("ISBN: ");
        iISBN = s.nextInt();
        s.nextLine();

        //
        iIsAvailable = true;
        
        Book b1 = new Book(iAuthor, title,iIsAvailable,iISBN);
        library.myLibrary.add(b1);

        library.myLibrary.get(0).bookDetail();
        

        
    }
    static int borrowBook(int ISBN){
        
        if(iISBN != 1){
           System.out.println("ISBN is not found!"); 
        }else{
            System.out.println("error");
        }
        return ISBN;

    }
    static void listOfBooks (){
        for(int i=0; i <= library.myLibrary.size(); i++){
            library.myLibrary.get(i);
        }
    }
    
}
