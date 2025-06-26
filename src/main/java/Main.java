public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("Clean Code", "Robert C. Martin");

        library.addBook(b1);
        library.addBook(b2);

        User user = new User("Lokesh", 101);
        System.out.println(user);

        library.displayBooks();

        library.issueBook("Clean Code");
        library.displayBooks();

        library.returnBook("Clean Code");
        library.displayBooks();
    }
}
