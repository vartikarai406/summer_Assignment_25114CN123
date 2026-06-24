import java.util.*;

class Book {
    int id;
    String name;
    boolean issued;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
        issued = false;
    }
}

public class LibraryManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        books.add(new Book(id, name));
        System.out.println("Book Added");
    }

    static void issueBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for(Book b : books) {
            if(b.id == id && !b.issued) {
                b.issued = true;
                System.out.println("Book Issued");
                return;
            }
        }
        System.out.println("Book not available");
    }

    static void showBooks() {
        for(Book b : books)
            System.out.println(b.id+" "+b.name+" Issued:"+b.issued);
    }

    public static void main(String args[]) {

        while(true) {
            System.out.println("\n1.Add Book\n2.Issue Book\n3.Show Books\n4.Exit");
            int ch = sc.nextInt();

            switch(ch) {
                case 1:addBook(); break;
                case 2:issueBook(); break;
                case 3:showBooks(); break;
                case 4:System.exit(0);
            }
        }
    }
}