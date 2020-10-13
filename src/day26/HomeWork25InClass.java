package day26;

/*codePointCount(int beginIndex, int endIndex) -
Returns the number of Unicode code points in the specified text range of this String.


toCharArray()*/
public class HomeWork25InClass {
    public static void main(String[] args) {
        // codePointCount(int beginIndex, int endIndex)
        // toCharArray()
        String test = "Vaaasilij";
        System.out.println(test.codePointCount(2, 5));
        printCharArray(magicCharArray());
    }

    private static char[] magicCharArray() {
        String housemaster = "Vasilij";
        char[] myNewArray = housemaster.toCharArray();
        return myNewArray;
    }

    public static void printCharArray(char[] arr) {
        for (char element : arr) {
            System.out.print(element + " ");
        }
    }
}
