import javax.xml.transform.Source;
import java.security.spec.ECField;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Book book1 = new Book("java","kaiwen","code");
        Book book2 = new Book("c","kaiwen","code");
        Book book3 = new Book("python","kaiwen","code");
        Book[] books = {book1,book2,book3};
        for(Book book: books){
            library.add_book(book);
        }
        Menu menu = new Menu();
        boolean run = true;
        while (run){
            menu.mainMenu();
            try{
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        library.DisplayBooks();
                        break;
                    case 2:
                        library.DisplayHiredBooks();
                        break;
                    case 3:
                        String Name;
                        String Author;
                        String category;
                        int id;
                        try{
                            System.out.println("Enter Book Name: "); Name = scanner.next();
                            scanner.nextLine();
                            System.out.println("Enter book Author: "); Author = scanner.next();
                            scanner.nextLine();
                            System.out.println("Enter Book Category: "); category = scanner.next();
                            Book book = new Book(Author,Name,category);
                            library.add_book(book);
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        library.DisplayBooks();
                        System.out.println("Enter Book id:");
                        try{
                            int ID = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter your name:");
                            String NAME = scanner.next();
                            System.out.println("Enter your surname:");
                            String SURNAME = scanner.next();
                            if(library.hire(library.getBookById(ID),NAME,SURNAME)){
                                System.out.println("Successfully complated");
                            }
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        library.DisplayBooks();
                        System.out.println("Enter Book id:");
                        try{
                            int ID = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter your name :"); String NAME = scanner.next();
                            scanner.nextLine();
                            System.out.println("Enter your surname :"); String SURNAME = scanner.next();
                            if (library.back(library.getBookById(ID),NAME,SURNAME)){
                                System.out.println("Succesfully back");
                            }
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 6:
                        run = false;
                        break;

                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
