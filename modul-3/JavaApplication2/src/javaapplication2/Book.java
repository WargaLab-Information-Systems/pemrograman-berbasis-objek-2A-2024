package JavaApplication2;

class Book extends LibraryApp {
    
    private String title;
    private String author;
    private String publisher;
    private char category;
    private int stock;
    private int year;

    public Book(String title, String author, String publisher, char category, int stock, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.stock = stock;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
