package newCourseDay11.hw11;

import java.util.Arrays;

public class Library {
    private Book[] books;
    int size;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    /*public int getSize() {
        return size;
    }*/

    public void displayBooksByAuthor(String author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println("Search results -> here are books of searched author: " + books[i]);
                System.out.println("----------");
            }
        }
    }

    public void displayBooksByCover(Cover cover) {
        for (int i = 0; i < size; i++) {
            if (books[i].getCover().equals(cover)) {
                System.out.println("Search results -> here are books of searched cover: " + books[i]);
                System.out.println("----------");
            }
        }
    }

    public void displayBooksByGenre(Genre genre) {
        for (int i = 0; i < size; i++) {
            if (books[i].getGenre().equals(genre)) {
                System.out.println("Search results -> here are books of searched genre: " + books[i]);
                System.out.println("----------");
            }
        }
    }

    public void displayBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public int binarySearch(String author) {
        int index = -1;
        int min = 0;
        int max = size - 1;
        boolean find = false;
        while (!find) {
            if (max - min <= 1) {
                find = true;
                if (books[max].getAuthor().equalsIgnoreCase(author)) {
                    index = max;
                } else if (books[min].getAuthor().equalsIgnoreCase(author)) {
                    index = min;
                } else index = -1;
            } else {
                index = (max + min) / 2;
                if (books[index].getAuthor().equalsIgnoreCase(author)) {
                    find = true;
                } else {
                    if (books[index].getAuthor().compareToIgnoreCase(author) > 0) {
                        max = index;
                    } else min = index;
                }
            }
        }
        return index;
    }

    public void insertionSortAuthor() {
        for (int i = 1; i < books.length; i++) {
            Book temp = books[i];
            int index = i - 1;
            while (index >= 0 && books[index].getAuthor().compareToIgnoreCase(temp.getAuthor()) > 0) {
                books[index + 1] = books[index];
                index--;
            }
            books[index + 1] = temp;
        }
    }

    public void insertionSortTitle() {
        for (int i = 1; i < books.length; i++) {
            Book temp = books[i];
            int index = i - 1;
            while (index >= 0 && books[index].getTitle().compareToIgnoreCase(temp.getTitle()) > 0) {
                books[index + 1] = books[index];
                index--;
            }
            books[index + 1] = temp;
        }
    }

    public void insertionSortYear() {
        for (int i = 1; i < books.length; i++) {
            Book temp = books[i];
            int index = i - 1;
            while (index >= 0 && books[index].getYear() > temp.getYear()) {
                books[index + 1] = books[index];
                index--;
            }
            books[index + 1] = temp;
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                ", size=" + size +
                '}';
    }
}
