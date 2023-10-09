package KosulluIfadelerPratik;
import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int ay, gun;
        Scanner input= new Scanner(System.in);

        System.out.println("Kaçıncı ayda doğdunuz: ");
        ay= input.nextInt();

        System.out.println("Doğduğunuz günü girin: ");
        gun= input.nextInt();

        // switch case kullanmamam istendi
        if (ay==1){
            if (0<gun && gun<=21){
                System.out.println("Oğlak burcusunuz");
            } else if (22<=gun && gun<=31){
                System.out.println("Kova burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==2){
            if (0<gun && gun<=19){
                System.out.println("Kova burcusunuz");
            } else if (20<=gun && gun<=29){
                System.out.println("Balık burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==3){
            if (0<gun && gun<=20){
                System.out.println("Balık burcusunuz");
            } else if (21<=gun && gun<=31){
                System.out.println("Koç burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==4){
            if (0<gun && gun<=20){
                System.out.println("Koç burcusunuz");
            } else if (21<=gun && gun<=31){
                System.out.println("Boğa burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==5){
            if (0<gun && gun<=21){
                System.out.println("Boğa burcusunuz");
            } else if (22<=gun && gun<=31){
                System.out.println("İkizler burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==6){
            if (0<gun && gun<=22){
                System.out.println("İkizler burcusunuz");
            } else if (23<=gun && gun<=31){
                System.out.println("Yengeç burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==7){
            if (0<gun && gun<=22){
                System.out.println("Yengeç burcusunuz");
            } else if (23<=gun && gun<=31){
                System.out.println("Aslan burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==8){
            if (0<gun && gun<=22){
                System.out.println("Aslan burcusunuz");
            } else if (23<=gun && gun<=31){
                System.out.println("Başak burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==9){
            if (0<gun && gun<=22){
                System.out.println("Başak burcusunuz");
            } else if (23<=gun && gun<=31){
                System.out.println("Terazi burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==10){
            if (0<gun && gun<=22){
                System.out.println("Terazi burcusunuz");
            } else if (23<=gun && gun<=31){
                System.out.println("Akrep burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==11){
            if (0<gun && gun<=21){
                System.out.println("Akrep burcusunuz");
            } else if (22<=gun && gun<=31){
                System.out.println("Yay burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else if (ay==12){
            if (0<gun && gun<=21){
                System.out.println("Yay burcusunuz");
            } else if (22<=gun && gun<=31){
                System.out.println("Oğlak burcusunuz");
            }else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        }
        else {
            System.out.println("Geçersiz bir ay girdiniz");
        }
    }
}
