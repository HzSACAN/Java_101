package KosulluIfadelerPratik;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input= new Scanner(System.in);
        System.out.print("Artık yıl olup olmadığını öğrenmek istediğiniz yılı giriniz: ");
        yil=input.nextInt();

        if (yil%4==0){
            if (yil%100==0){
                if (yil%400==0){
                    System.out.println("Girdiğiniz yıl artık yıldır");
                }
                else {
                    System.out.println("Girdiğiniz yıl artık yıl değildir");
                }

            }
            else {
                System.out.println("Girdiğiniz yıl artık yıldır.");
            }

        }
        else {
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }
    }
}
