import java.util.Scanner;

public class PatikaDev {

    public static void main(String[] args) {
//Java ile Matematik, Fizik, Kimya, Türkçe,
// Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan
// alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Matematik notunuzu giriniz : ");
        double mat=scan.nextDouble();
        System.out.println("lutfen Fizik notunuzu giriniz : ");
        double fiz=scan.nextDouble();
        System.out.println("lutfen Kimya notunuzu giriniz : ");
        double kim=scan.nextDouble();
        System.out.println("lutfen Turkce notunuzu giriniz : ");
        double tur=scan.nextDouble();
        System.out.println("lutfen Tarih notunuzu giriniz : ");
        double tar=scan.nextDouble();
        System.out.println("lutfen Muzik notunuzu giriniz : ");
        double muz=scan.nextDouble();

        double toplam=(mat+fiz+kim+tar+tur+muz)/6;


        double sonuc=toplam;
        System.out.println("sonuc : " + sonuc);

    }

}
