public class Book extends LibraryItem{
    static int bookid = 0;
    private boolean is_hired = false;
    Book(String author, String name, String category ){
        super(bookid++,author,name,category);
    }

    public void setIs_hired(boolean is_hired) {
        this.is_hired = is_hired;
    }

    public boolean getIs_hired(){
        return is_hired;
    }
}
