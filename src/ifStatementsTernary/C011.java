package ifStatementsTernary;

import java.util.Scanner;

public class C011 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan bir tarihi; gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.
        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tarihi gun, ay ve yil seklinde giriniz");
        int gun = scan.nextInt();
        int ay = scan.nextInt();
        int yil = scan.nextInt();

        System.out.println("Lütfen günü giriniz: " + gun);
        if (gun > 0 && gun <= 31) {


        }
         if(ay>1 && ay<=12){

             System.out.println("Lütfen ayı giriniz: " + ay);
        }
        if(yil>0){

            System.out.println("Lütfen yılı giriniz: " + yil);

            System.out.println("Ay Yil Gun: " + ay +". "+ yil+" ." + gun);
            System.out.println("Yil Ay Gun: "+ yil + "."+ ay + "."+ gun);
            System.out.println("Gun Yil Ay: " + gun +". "+ yil+" ." + ay);
        }

    }
}
