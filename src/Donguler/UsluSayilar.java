package Donguler;
import java.util.Scanner;
public class UsluSayilar {
    public static void main(String[] args) {
        int n, k, sonuc=1;

        System.out.print("Üssünü almak istediğiniz sayıyı giriniz: ");
        Scanner input= new Scanner(System.in);
        n = input.nextInt();

        System.out.print("Bu sayının kaçıncı kuvvetini bulmak istiyorsunuz: ");
        k = input.nextInt();

        for (int i=1; i<=k; i++){
            sonuc *= n;
        }
        System.out.print("Cevap: "+ sonuc);
    }
}
