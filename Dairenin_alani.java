import java.util.Scanner;

public class Dairenin_alani {
    public static void main(String[] args) {

//        Dairenin Alanını ve Çevresini Hesaplayan Program
//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
//
//Alan Formülü : π * r * r;
//
//Çevre Formülü : 2 * π * r;
//
//Ödev
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//𝜋 sayısını = 3.14 alınız.
//
//Formül : (𝜋 * (r*r) * 𝛼) / 360



        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yari capi giriniz : ");
        double pi=3.14;
        double r=scan.nextDouble();
        double alan= pi*r*r;
        double cevre=2*pi*r;
        double a=scan.nextDouble();
        double daireDilimAlani=(pi*(r*r)*a)/360;
        System.out.println("daireDilimAlani = " + daireDilimAlani);

    }
}
