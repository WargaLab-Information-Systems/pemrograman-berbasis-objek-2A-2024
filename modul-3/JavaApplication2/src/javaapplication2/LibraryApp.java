package JavaApplication2;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.print("Masukkan jumlah buku yang ingin di-input: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data buku ke-" + (i + 1) + ":");
           
            System.out.print("Judul Buku: ");
            String title = scanner.nextLine();
            System.out.print("Penulis Buku: ");
            String author = scanner.nextLine();
            System.out.print("Publisher Buku: ");
            String publisher = scanner.nextLine();
            System.out.print("Kategori (SU/D/R/A): ");
            char category = scanner.nextLine().charAt(0);
            System.out.print("Stok Buku: ");
            int stock = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(title, author, publisher, category, stock, year);
            library.addBook(book);
        }

        System.out.println();
        library.displayBooks();

        scanner.close();
    }
}
