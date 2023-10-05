import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km, km_ucreti=2.20, tutar;
        int min_ucret=20, acilis=10;
        System.out.println("Taksimetre açılışı 10 TL dir. KM başına 2.2o TL ücret alınır. " +
                "20TL altındaki ücretlendirme 20 TL ye sabitlenir. Gidilen KM'yi giriniz:");
        Scanner input = new Scanner(System.in);
        km = input.nextDouble();
        tutar= (acilis+(km * km_ucreti));
        if (tutar<=20){
            System.out.println("Taksimetre ücretiniz "+min_ucret+" TL dir");
        } else if (tutar>20) {
            System.out.println("Taksimetre ücretiniz "+tutar+" TL dir");
        }
    }
}