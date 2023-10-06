import java.util.Scanner;
public class VucutKitleIndeks {
    public static void main(String[] args) {
        double kg, m, vucud_kitle_indeks;
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        m = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        kg = input.nextDouble();
        vucud_kitle_indeks= kg/(m*m);
        System.out.println("Vücut Kitle İndeksiniz : "+vucud_kitle_indeks);
    }
}
