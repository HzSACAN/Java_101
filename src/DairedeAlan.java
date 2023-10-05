import java.util.Scanner;
public class DairedeAlan {
    public static void main(String[] args) {
        int r, a;
        double alan, cevre, pi= 3.14;
        System.out.println("Çevresini hesaplamaak istediğiniz Dairenin yarı çapını "+
                "Alanını hesaplamaak istediğiniz Dairenin yarı çapı ve varsa iç açısını giriniz ");
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı çapı:");
        r = input.nextInt();
        System.out.println("Varsa Dairenin iç açısı (0 ile 360 aralığında):");
        a = input.nextInt();
        cevre=(2*pi*r);
        alan=(pi*(r*r)*a)/360;
        System.out.println("Dairenizin çevresi :"+ cevre);
        System.out.println("Dairenizin alanı: "+ alan);

    }
}
