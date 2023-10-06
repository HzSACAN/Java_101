import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut =2.14, elma =3.67, domates =1.11, muz=0.95, patlican=5.00, toplam_tutar ;
        int a,b,c,d,e;
        Scanner input= new Scanner(System.in);
        System.out.println("Armut kaç kilo ? : ");
        a= input.nextInt();
        System.out.println("Elma kaç kilo : ");
        b= input.nextInt();
        System.out.println("Domates kaç kilo : ");
        c= input.nextInt();
        System.out.println("Muz kaç kilo : ");
        d= input.nextInt();
        System.out.println("Patlıcan kaç kilo : ");
        e= input.nextInt();
        toplam_tutar= (a*armut)+(b*elma)+(c*domates)+(d*muz)+(e*patlican);
        System.out.println("Toplam tutar : "+toplam_tutar);


    }
}
