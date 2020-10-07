package day08;

public class HelloMyFirstCalender {
    public static void main(String[] args) {
        String myVeryLovelyMonth = "Maj";
        System.out.println("input: " + myVeryLovelyMonth + " output: " + getMeMonthNumber(myVeryLovelyMonth));
    }

    private static int getMeMonthNumber(String month) {
        month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
        int result = 0;
        switch (month) {
            case "Januar":
                result = 1;
                break;
            case "Februar":
                result = 2;
                break;
            case "März":
                result = 3;
                break;
            case "April":
                result = 4;
                break;
            case "Maj":
                result = 5;
                break;
            case "Juni":
                result = 6;
                break;
            case "Juli":
                result = 7;
                break;
            case "August":
                result = 8;
                break;
            case "September":
                result = 9;
                break;
            case "Oktober":
                result = 10;
                break;
            case "November":
                result = 11;
            case "Dezember":
                result = 12;
                break;
            default:
                result = -1;
                break;


        }
        return result;
    }
}

