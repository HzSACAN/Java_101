package KosulluIfadelerPratik;
import java.util.Scanner;
import java.util.SortedMap;

public class SinifGecme {
    public static void main(String[] args) {
        // a= ortalamaya katılan not sayısı
        int mat, mat1, fizik, fizik1, turkce, turkce1, kimya, kimya1, muzik, muzik1, a=0;
        double gecme_notu;

        Scanner input= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat= input.nextInt();
        if (0<=mat && mat<=100){
            mat1=mat;
            ++a;
        }else {
            mat1=0;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik= input.nextInt();
        if (0<=fizik && fizik<=100){
            fizik1=fizik;
            ++a;
        }else {
            fizik1=0;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce= input.nextInt();
        if (0<=turkce && turkce<=100){
            turkce1=turkce;
            ++a;
        }else {
            turkce1=0;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya= input.nextInt();
        if (0<=kimya && kimya<=100){
            kimya1=kimya;
            ++a;
        }else {
            kimya1=0;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik= input.nextInt();
        if (0<=muzik && muzik<=100){
            muzik1=muzik;
            ++a;
        }else {
            muzik1=0;
        }

        gecme_notu=(mat1+fizik1+turkce1+kimya1+muzik1)/a;

        if (gecme_notu<55){
            System.out.println("Sınıfta kaldınız");
        }else {
            System.out.println("Tebrikler geçtiniz");
        }
        System.out.println("Ortalamanız: "+gecme_notu);

    }
}
