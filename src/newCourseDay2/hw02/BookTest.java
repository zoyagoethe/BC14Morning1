package newCourseDay2.hw02;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("War and Peace", "Leo Tolstoy", "Russian and French", 1865);
        Book b2 = new Book("Pride and Prejudice", "Jane Austen", "English", 1813);
        Book b3 = new Book("Inferno", "Dante Alighieri", "Italian", 1472);
        Book b4 = new Book("Effective Java", "Joshua Bloch", "English", 2001);
        Book b5 = new Book("The yellow arrow", "Victor Pelevin", "Russian", 1993);
        Book[] arrB = new Book[]{b1, b2, b3, b4, b5};
        bubbleSort(arrB);
        printArr(arrB);

    }

    private static void printArr(Book[] arr) {
        for (Book book : arr) {
            book.displayInfo();
        }
    }

    private static void bubbleSort(Book[] arr) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].year > arr[i + 1].year) {
                    Book temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
}
