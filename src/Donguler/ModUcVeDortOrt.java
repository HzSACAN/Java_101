package Donguler;
import java.util.Scanner;
public class ModUcVeDortOrt {
    public static void main(String[] args) {
        int  a=0,b=0, girdi;
        double dordun_kati=0, ucun_kati=0, uc_ve_dordun_ort;
        System.out.print("Bir sayı giriniz: ");
        Scanner input= new Scanner(System.in);
        girdi=input.nextInt();

        for (int i=0; i<=girdi; i++){

            if (i%3==0){
                ++a;
                ucun_kati+=i;
            } else if (i%4==0) {
                ++b;
                dordun_kati+=i;
            }else {
                continue;
            }
        }
        uc_ve_dordun_ort= ((ucun_kati+dordun_kati)/(a+b-1));
        System.out.println(girdi+" Sayısına kadar 3'ün ve 4'ün katı olan sayıların ortalaması: "+ uc_ve_dordun_ort);
    }
}
