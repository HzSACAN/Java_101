package Donguler;
import java.util.Scanner;
public class KuvvetYazdirma {
    public static void main(String[] args) {
        int sayi;

        Scanner input= new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");

        sayi=input.nextInt();
        System.out.println("Girdiğiniz sayıya kadar olan 4'ün kuvvetleri:");
        for (int i=1; i<sayi; i*=4){
            System.out.println(i);
        }
        System.out.println("Girdiğiniz sayıya kadar olan 5'in kuvvetleri:");
        for (int k=1; k<sayi; k*=5){
            System.out.println(k);
        }
    }
}
