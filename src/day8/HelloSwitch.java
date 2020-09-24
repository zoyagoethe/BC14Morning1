package day8;

public class HelloSwitch {
    public static void main(String[] args) {
        int schoolNote = 2;
        System.out.println(bonus(schoolNote));
    }

    private static String bonus(int note) {
        String output = "";
        switch (note) {
            case 5:
                output = "bycicle";
                break;
            case 4:
                output = "GoPro7";
                break;
            case 3:
                output = "nothing";
                break;
            case 2:
                output = "atata";
                break;
            case 1:
                output = "!!!!!!!!!!";
                break;
            default:
                output = "false note - try again";
                break;
        }
        return output;
    }
}
