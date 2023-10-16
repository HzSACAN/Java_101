package Donguler;
import java.util.Scanner;
public class TekSayiToplam {
    public static void main(String[] args) {
        int sayi, toplam=0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bir sayı Giriniz: ");
            sayi= input.nextInt();
            // 4 ün katı olan sayılar aynı zamanda çift olmak zorunda çünkü 4 içinde 2 çarpanını bulunduruyor.
            if (sayi%4==0){
                toplam+= sayi;
            }
        }while (sayi%2==0);
        System.out.print("Girdiğiniz sayılardan 4'ün katı olanların toplamı: "+ toplam);
    }
}
