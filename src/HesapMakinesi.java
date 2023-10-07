import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, islem;
        System.out.print("İlk sayıyı giriniz : ");
        Scanner input= new Scanner(System.in);
        sayi1= input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        sayi2= input.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n1-Toplama\n2-Çıkarma\n"
        +"3-Çarpma\n4-Bölme");
        islem= input.nextInt();
        switch (islem){
            case 1:
                System.out.println("Toplam: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Kalan: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpım: "+(sayi1*sayi2));
                break;
            case 4:
                if (sayi2!=0){
                    System.out.println("Bölüm: "+(sayi1/sayi2));
                }else {
                    System.out.println("Herhangi bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Yanlış bir işlem girdiniz");
        }
    }
}
