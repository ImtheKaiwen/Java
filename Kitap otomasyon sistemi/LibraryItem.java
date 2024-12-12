public abstract class LibraryItem {
    protected int id;
    protected String Author;
    protected String Name;
    protected String Category;

    public LibraryItem(int id, String author, String name, String category){
        this.id = id;
        this.Author = author;
        this.Name = name;
        this.Category = category;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return Author;
    }

    public String getCategory() {
        return Category;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
