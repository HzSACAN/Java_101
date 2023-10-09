package KosulluIfadelerPratik;
import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int yas, tip, mesafe;
        double normal_tutar, indirim;

        Scanner input= new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi(KM) giriniz: ");
        mesafe= input.nextInt();

        System.out.println("Bilet sahibinin yaşı: ");
        yas=input.nextInt();

        System.out.println("Yolculuk tipini giriniz: \n Tip 1 sadece gidiş \n Tip 2 Gidiş dönüş(%20 indirimli)");
        tip=input.nextInt();

        normal_tutar= (mesafe*0.10);
        if (0<yas && yas<12){
            if (tip==1){
                if (0<mesafe){
                    indirim=(normal_tutar*0.5);
                    System.out.println("Normal tutar: "+normal_tutar);
                    System.out.println("Yaş indirimi: "+(indirim));
                    System.out.println("Toplam tutar: "+(normal_tutar-indirim));
                }else {
                    System.out.println("Hatalı bilgi girdiniz.");
                }

            } else if (tip==2) {
                if (0<mesafe){
                    indirim=(normal_tutar*0.5);
                    System.out.println("Normal tutar: "+normal_tutar);
                    System.out.println("Yaş indirimi: "+(indirim));
                    System.out.println("Gidiş dönüş bilet indirimi: " + ((normal_tutar-indirim) * 0.20));
                    System.out.println("Toplam tutar: " + (((normal_tutar-indirim)-((normal_tutar-indirim) * 0.20))*2));
                }else {
                    System.out.println("Hatalı bilgi girdiniz.");
                }
            }
            else {
                System.out.println("Hatalı bilgi girdiniz.");
            }
        }
        else if (12<=yas && yas<=24) {
            if (tip==1){
                if (0<mesafe){
                    indirim=(normal_tutar*0.1);
                    System.out.println("Normal tutar: "+normal_tutar);
                    System.out.println("Yaş indirimi: "+(indirim));
                    System.out.println("Toplam tutar: "+(normal_tutar-indirim));
                }else {
                    System.out.println("Hatalı bilgi girdiniz.");
                }

            } else if (tip==2) {
                if (0 < mesafe) {
                    indirim = (normal_tutar * 0.1);
                    System.out.println("Normal tutar: " + normal_tutar);
                    System.out.println("Yaş indirimi: " + (indirim));
                    System.out.println("Gidiş dönüş bilet indirimi: " + ((normal_tutar-indirim) * 0.20));
                    System.out.println("Toplam tutar: " + (((normal_tutar-indirim)-((normal_tutar-indirim) * 0.20))*2));
                } else {
                    System.out.println("Hatalı bilgi girdiniz.");
                }
            }
            else {
                System.out.println("Hatalı bilgi girdiniz.");
            }
        }
        else if (65<yas) {
            if (tip==1){
                if (0<mesafe){
                    indirim=(normal_tutar*0.3);
                    System.out.println("Normal tutar: "+normal_tutar);
                    System.out.println("Yaş indirimi: "+(indirim));
                    System.out.println("Toplam tutar: "+(normal_tutar-indirim));
                }else {
                    System.out.println("Hatalı bilgi girdiniz.");
                }

            } else if (tip==2) {
                if (0 < mesafe) {
                    indirim = (normal_tutar * 0.3);
                    System.out.println("Normal tutar: " + normal_tutar);
                    System.out.println("Yaş indirimi: " + (indirim));
                    System.out.println("Gidiş dönüş bilet indirimi: " + ((normal_tutar-indirim) * 0.20));
                    System.out.println("Toplam tutar: " + (((normal_tutar-indirim)-((normal_tutar-indirim) * 0.20))*2));
                } else {
                    System.out.println("Hatalı bilgi girdiniz.");
                }
            }
            else {
                System.out.println("Hatalı bilgi girdiniz.");
            }
        }
        else {

            System.out.println("Hatalı bilgi girdiniz.");
        }
    }
}
