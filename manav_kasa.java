import java.util.Scanner;

public class manav_kasa {
    public static void main(String[] args) {
//        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
//
//Meyveler ve KG Fiyatları
//
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen almak istediginiz urun ismi giriniz");
        String urun=scan.next();
        System.out.println("lutfen kac kg almak istediginizi giriniz");
        double kg= scan.nextDouble();
        double tutar=0;
        while (true){
            System.out.println("lutfen almak istediginiz urun ismi giriniz");
            urun=scan.next();
            if (urun.equalsIgnoreCase("q")){
                break;
            }
            System.out.println("lutfen kac kg almak istediginizi giriniz");
          kg= scan.nextDouble();
        if (urun.equalsIgnoreCase("armut")){
            double armutFiyat=2.14;
            System.out.println("toplamda "+kg+ " kg urun aldiniz. ");
            double armutUCreti=kg*armutFiyat;
            tutar+=armutUCreti;
        } else if (urun.equalsIgnoreCase("elma")) {

            double elmaFiyat=3.67;
            System.out.println("toplamda "+kg+ " kg urun aldiniz. ");
            double elmaUCreti=kg*elmaFiyat;
            tutar+=elmaUCreti;
        } else if (urun.equalsIgnoreCase("domates")) {
            double domatesFiyat=1.11;
            System.out.println("toplamda "+kg+ " kg urun aldiniz. ");
            double domatesUCreti=kg*domatesFiyat;
            tutar+=domatesUCreti;
        } else if (urun.equalsIgnoreCase("muz")) {
            double muzFiyat=0.95;
            System.out.println("toplamda "+kg+ " kg urun aldiniz. ");
            double muzUCreti=kg*muzFiyat;
            tutar+=muzUCreti;
        } else if (urun.equalsIgnoreCase("patlican")) {
            double patlicanFiyat=5.00;
            System.out.println("toplamda "+kg+ " kg urun aldiniz. ");
            double patlicanUCreti=kg*patlicanFiyat;
            tutar+=patlicanUCreti;
            
        }}

        System.out.println("tutar = " + tutar);
    }
}
