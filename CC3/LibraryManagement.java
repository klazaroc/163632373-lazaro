package CC3;
import java.util.*;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Library library = new Library();

        
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));

        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Display all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Search for a book by title");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;
                case 2:
                    System.out.print("\nEnter the title to borrow: ");
                    String borrowTitle = input.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 3:
                    System.out.print("\nEnter the title to return: ");
                    String returnTitle = input.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.print("\nEnter the title to search: ");
                    String searchTitle = input.nextLine();
                    library.searchBookByTitle(searchTitle);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        input.close();
    }
}


class Book {
    private String title;
    private String author;
    private boolean isAvailable = true;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Borrowed"));
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title + " by " + author);
        } else {
            System.out.println("This book is currently unavailable.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned: " + title + " by " + author);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}


class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void displayAllBooks() {
        System.out.println("\n--- All Books ---");
        for (Book book : books) {
            book.displayBookDetails();
            System.out.println();
        }
    }

    public void searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayBookDetails();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook(); 
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook(); 
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}
