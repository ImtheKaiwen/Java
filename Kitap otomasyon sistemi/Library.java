import java.util.LinkedList;

public class Library implements BookFunctions{
    private LinkedList<Book> books = new LinkedList<>();
    private LinkedList<HireBook> hiredbooks = new LinkedList<>();

    public void add_book(Book book){
        books.add(book);
    }
    public void add_hired(HireBook book){
        hiredbooks.add(book);
    }

    public void DisplayBooks(){
        for(Book book:books){
            System.out.println("id : "+book.getId()+"\nName : "+book.getName()+"\nauthor : "+book.getAuthor()+"\nIs hired : "+book.getIs_hired()+"\n----------");
        }
    }

    public void DisplayHiredBooks(){
        for(HireBook hire:hiredbooks){
            System.out.println("id : "+hire.getBook().getId()+"\nName : "+hire.getBook().getName()+"\nauthor : "+hire.getBook().getAuthor()+"\nIs hired : "+hire.getBook().getIs_hired()+"\nHired by : "+hire.getName()+" "+hire.getSurname()+"\n----------");
        }
    }

    @Override
    public boolean hire(Book book, String Name, String surname) {
        if(book == null) return false;
        if(books.contains(book) && !book.getIs_hired()){
            HireBook hire = new HireBook(book,Name,surname);
            hiredbooks.add(hire);
            book.setIs_hired(true);
            return true;
        }
        if (book.getIs_hired()){
            System.out.println("Book is already hired !");
        }
        else{
            System.out.println("Book is not exist !");
        }
        return false;
    }

    @Override
    public boolean back(Book book, String Name, String surname) {
        for(HireBook hire : hiredbooks){
            if(hire.getBook().equals(book) && hire.getSurname().equals(surname) && hire.getName().equals(Name)){
                hiredbooks.remove(hire);
                book.setIs_hired(false);
                return true;
            }
        }
        System.out.println("Book is not hired");
        return false;
    }
    public Book getBookById(int id){
        for(Book book:books){
            if(book.getId() == id) return book;
        }
        return null;
    }
}
