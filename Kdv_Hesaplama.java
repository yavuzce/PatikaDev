import java.util.Scanner;

public class Kdv_Hesaplama {
    public static void main(String[] args) {
        //zın.
        //
        //(Not : KDV tutarını 18% olarak alın)
        //
        //KDV'siz Fiyat = 10;
        //
        //KDV'li Fiyat = 11.8;
        //
        //KDV tutarı = 1.8;
        //
        //Ödev
        //Eğer girilen tutar 0
        // ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tutarini giriniz : ");
        double tutar=scan.nextDouble();
        double kdv=0.18;
        double kdvTutari=tutar*kdv;
        double kdvliTutar=tutar+kdvTutari;
        System.out.println("kdv siz tutar : "+ tutar);
        System.out.println("kdv tutari : "+kdvTutari);
        System.out.println("kdv orani : "+kdv);
        System.out.println("kdv li tutar : "+kdvliTutar);




    }
}
