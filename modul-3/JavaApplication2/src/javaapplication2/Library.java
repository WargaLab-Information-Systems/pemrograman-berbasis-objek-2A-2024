package JavaApplication2;

import java.util.ArrayList;

class Library extends LibraryApp {
    
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Daftar Buku:");
        for (Book book : books) {
            System.out.println("Judul Buku: " + book.getTitle());
            System.out.println("Penulis Buku: " + book.getAuthor());
            System.out.println("Publisher Buku: " + book.getPublisher());
            System.out.println("Kategori Buku: " + book.getCategory());
            System.out.println("Stok Buku: " + book.getStock());
            System.out.println("Tahun Terbit: " + book.getYear());
            System.out.println();
        }
    }
}
