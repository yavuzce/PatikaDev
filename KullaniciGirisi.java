import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
//        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp
//        sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
//        yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
//        aynı olmaması gerektiğini kontrol edip , şifreler aynı ise
//        ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
//        sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("kullanici adiniz : ");
        String name=scan.next();
        System.out.println("sifreniz : ");
        String password=scan.next();

        if (name.equals("patika") && password.equals("1234java")){
            System.out.println("sifreniz dogrudur");
        }else{
            System.out.println("sifreniz yanlistir! sifrenizi sifirlamak ister misiniz? \n evet ise 'E' hayir ise 'H' yaziniz");}
        name=scan.next();
            if (name.equalsIgnoreCase("E")){
                System.out.println("lutfen yeni sifrenizi giriniz : ");
                password=scan.next();
                if (password.equals("1234java")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else System.out.println("Şifre oluşturuldu");
            }else System.out.println("iyi gunler!");
        }



}
