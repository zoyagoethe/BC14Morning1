package newCourseDay2.hw02;

/*
Create a book class with the required fields.
For example, the title, year, author.
Create a few instance of the book: "War and Peace", "Pride and Prejudice", "Inferno" (Dante), "Effective Java", ect.
*/
public class Book {
    String title;
    String author;
    String language;
    int year;

    public Book(){

    }

    public Book(String bookTitle, String bookAuthor, String bookLanguage, int yearFirst){
        title = bookTitle;
        author = bookAuthor;
        language = bookLanguage;
        year = yearFirst;
        displayInfo();
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Language: " + language);
        System.out.println("Year of first publication: " + year);
        System.out.println();
    }
}
class BookInfo{
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        Book b5 = new Book();

        b1.title = "War and Peace";
        b1.author = "Leo Tolstoy";
        b1.language = "Russian and French";
        b1.year = 1865;
        b1.displayInfo();

        b2.title = "Pride and Prejudice";
        b2.author = "Jane Austen";
        b2.language = "English";
        b2.year = 1813;
        b2.displayInfo();

        b3.title = "Inferno";
        b3.author = "Dante Alighieri";
        b3.language = "Italian";
        b3.year = 1472;
        b3.displayInfo();

        b4.title = "Effective Java";
        b4.author = "Joshua Bloch";
        b4.language = "English";
        b4.year = 2001;
        b4.displayInfo();

        b5.title = "The yellow arrow";
        b5.author = "Victor Pelevin";
        b5.language = "Russian";
        b5.year = 1993;
        b5.displayInfo();

    }
}