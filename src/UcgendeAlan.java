import java.util.Scanner;

public class UcgendeAlan {

    public static void main(String[] args) {
        int kenar1, kenar2, kenar3, cevre;
        double alan, u;
        System.out.println("Alanını  bulmak istediğiniz üçgenin kenar uzunluklarını giriniz");
        Scanner input= new Scanner(System.in);

        System.out.println("ilk kenarı giriniz: ");
        kenar1= input.nextInt();

        System.out.println("ikinci kenarı giriniz");
        kenar2= input.nextInt();

        System.out.println("üçğncü kenarı giriniz");
        kenar3= input.nextInt();
        cevre= (kenar1+kenar2+kenar3);
        u= (cevre/2);
        alan=(Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3)));
        System.out.println("üçgeninizin alanı: "+alan);
    }
}
