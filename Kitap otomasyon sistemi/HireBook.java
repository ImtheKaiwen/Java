public class HireBook {
    private final Book book;
    private final String Name;
    private final String surname;

    HireBook(Book book, String Name, String Surname){
        this.book = book;
        this.Name = Name;
        this.surname = Surname;
    }

    public Book getBook() {
        return book;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return surname;
    }
}
