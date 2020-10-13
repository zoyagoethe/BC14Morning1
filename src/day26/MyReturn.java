package day26;

public class MyReturn {
    public static void main(String[] args) {
        boolean permission = true;
        boolean nonPermission = false;
        quarantine(permission);// ничего не выводит
        quarantine(nonPermission);

    }
    public static void quarantine(boolean quarant){
        quarantineZone:// zona vidimosti, operacii s metkami
        {
            if (quarant){
                return;// vyxod iz programmy
            }
            System.out.println("Мы в карантине!");
        }
    }
}
