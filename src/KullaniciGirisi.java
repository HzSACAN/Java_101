import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String kullaniciAdi, sifre, yeniSifre;
        int secim;

        Scanner input= new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        kullaniciAdi= input.nextLine();

        System.out.print("Şifreniz: ");
        sifre= input.nextLine();
        if(kullaniciAdi.equals("patika") && sifre.equals("java123")){
            System.out.println("Başarıyla giriş yaptınız.");
        }else if (kullaniciAdi.equals("patika") && !sifre.equals("java123")){
            System.out.println("Şifrenizi sıfırlamak isterseniz 1'e istemez iseniz 2'ye tıklayın");
            secim= input.nextInt();
            switch (secim){
                case 1:
                    Scanner inp= new Scanner(System.in);
                    System.out.print("Yeni şifrenizi giriniz: ");
                    yeniSifre= inp.nextLine();

                    if (yeniSifre.equals("java123")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else {
                        System.out.println("Şifre oluşturuldu");
                    }
                    break;
                case 2:
                    System.out.println("Sisteme giriş yapılamadı");
                    break;
                default:
                    System.out.println("Giriş başarısız");
            }

        }else {
            System.out.println("Kullanıcı adı veya şifresi hatalı");
        }

    }
}
