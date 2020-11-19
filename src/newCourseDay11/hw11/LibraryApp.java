package newCourseDay11.hw11;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("War and peace", "Leo Tolctoj", "French and Russian",
                Genre.NOVEL, 1965, Cover.HARDCOVER);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "English",
                Genre.NOVEL, 1813, Cover.PAPERBACK);
        Book book3 = new Book("Inferno", "Dante Alighieri", "Italian",
                Genre.EPIC_POETRY, 1472, Cover.EBOOK);
        Book book4 = new Book("Effective Java", "Joshua Bloch", "English",
                Genre.TEXTBOOK, 2001, Cover.POCKETBOOK);
        Book book5 = new Book("The yellow arrow", "Victor Pelevin", "Russian",
                Genre.NOVEL, 1993, Cover.HARDCOVER);
        Book book6 = new Book("Per aspera ad astra", "Unknown author", "Latin",
                Genre.SCIFI, 1212, Cover.EBOOK);
        Book book7 = new Book("Generation P", "Victor Pelevin", "German",
                Genre.NOVEL, 1999, Cover.HARDCOVER);
        Library stock = new Library(10);
        stock.addBook(book1);
        stock.addBook(book2);
        stock.addBook(book3);
        stock.addBook(book4);
        stock.addBook(book5);
        stock.addBook(book6);
        stock.addBook(book7);
        //System.out.println(stock);
        //stock.deleteBook(book1);
        //System.out.println(stock);
        //stock.displayBooks();
        //System.out.println(book1);

        stock.displayBooksByAuthor("Victor Pelevin");
        System.out.println("**********");
        stock.displayBooksByCover(Cover.HARDCOVER);
        System.out.println("**********");
        stock.displayBooksByGenre(Genre.NOVEL);

        //stock.insertionSortAuthor();
        //stock.insertionSortTitle();
        //stock.insertionSortYear();
        //System.out.println(stock.binarySearch("Victor Pelevin"));

    }
}
