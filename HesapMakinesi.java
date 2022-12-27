import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen islem yapmak icin birinci sayiyi giriniz : ");
        double birinciSayi= scan.nextDouble();
        System.out.println("lutfen islem yapmak icin ikinci sayiyi giriniz : ");
        double ikinciSayi= scan.nextDouble();
        System.out.println("lutfen islem yapmak icin '+,-,/,*' islemlerinden istediginiz islem sembolunu giriniz : ");
        char islem=scan.next().charAt(0);



        switch (islem){
            case '+':
                System.out.println("toplama isleminin sonucu : "+ (birinciSayi+ikinciSayi));
                break;
            case '-':
                System.out.println("cikarma isleminin sonucu : "+ (birinciSayi-ikinciSayi));
                break;
            case '/':
                System.out.println("bolme isleminin sonucu : "+ (birinciSayi/ikinciSayi));
                break;
            case '*':
                System.out.println("carpma isleminin sonucu : "+ ( birinciSayi*ikinciSayi));
                break;
            default:
                System.out.println("yanlis bir islem turu sectiniz ! lutfen dogru bir islem turu seciniz");

        }


    }
}
