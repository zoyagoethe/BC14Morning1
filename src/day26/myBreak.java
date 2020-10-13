package day26;

public class myBreak {
    public static void main(String[] args) {
        boolean permission = true;
        boolean nonPermission = false;
        //quarantine(permission);// ничего не выводит
        quarantine(nonPermission);
    }

    public static void quarantine (boolean quarant){
        quarantineZone:
        {
            if (quarant) {
                break quarantineZone;
            }
            System.out.println("Мы в карантине!");
        }
    }
}
