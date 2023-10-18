package Donguler;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r, factor1=1, factor2=1, factor3=1, combination;

        System.out.print("Kombinsayonunu hesaplamak istediğiniz kümenin eleman sayısı: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.print("Kaç elemanlı kombinsayonunu hesaplamak istiyorsunuz: ");
        r = input.nextInt();

        for (int i=1; i<=n; i++){
            factor1 *= i;
        }
        for (int k=1; k<=r; k++){
            factor2 *= k;
        }
        for (int l=1; l<=(n-r); l++){
            factor3 *= l;
        }
        combination= factor1/(factor2*factor3);
        System.out.println("C("+n+","+r+")= "+combination);
    }
}
