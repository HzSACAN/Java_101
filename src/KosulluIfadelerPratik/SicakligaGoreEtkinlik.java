package KosulluIfadelerPratik;
import java.util.Scanner;
public class SicakligaGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        System.out.println("Sıcaklık değerini giriniz: ");
        Scanner input= new Scanner(System.in);
        sicaklik= input.nextInt();
        if (sicaklik<5){
            System.out.println("Size uygun etkinlik \"kayak\"");
        } else if (5 <= sicaklik && sicaklik<15) {
            System.out.println("Size uygun etkinlik \"sinema\"");
        } else if (15 <= sicaklik && 25>=sicaklik) {
            System.out.println("Size uygun etkinlik \"piknik\"");
        }else {
            System.out.println("Size uygun etkinlik \"yüzme\"");
        }
    }
}
