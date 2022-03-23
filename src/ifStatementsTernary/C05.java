package ifStatementsTernary;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {


    /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi ve kilonuzu giriniz");
        int yas = scan.nextInt();
        double kilo = scan.nextDouble();

        if (yas > 0 && yas < 18) {
            System.out.println("Yasiniz 18'den kucuk oldugu icin kan bagisi yapamazsiniz");

        } else if (yas >= 18) {
            if (kilo > 0 & kilo < 50) {
                System.out.println("Yasiniz kan vermeye uygun ama kilonuz uygun degildir, sizin kana ihtiyaciniz var gibi");
            } else if (kilo >= 50) {
                System.out.println("yasiniz ve kilonuz kan vermeye uygundur");
            } else {
                System.out.println("kilonuzu hatali girdiniz");
            }
        } else {
            System.out.println("hatali veri girdiniz");
        }
    }
}
    /*
            TASK :
            Kullanicidan  yasini ve kilosunu alaliniz
            18 yasindan kucuk ise kan bagisi yapamaz
            18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
            18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

    Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
        System.out.print("yasınızı giriniz : ");
                int yas = scan.nextInt();
                System.out.print("kilonuzu  giriniz : ");
                int kilo = scan.nextInt();
                if (yas > 0 && yas < 18) {//yas ve sartı kontrolu yapıldı
        System.out.println("yası 18'den kucuk olanlar kan bagısı yapamaz");
        } else if (yas >= 18) {
        if (kilo > 0 && kilo < 50) {//kilo sartı ve kontrolu yapıldı
        System.out.println("yasınız kan bagısı icin uygun ancak kilonuz yetriz");
        } else if (kilo >= 50) {
        System.out.println("sartlarınız uygun kan bagısı yapabilirsiniz");
        } else System.out.println("kilonuzu hatalı girdiniz");//hatalı kilo girişi kontrolu yapıldı
        } else System.out.println("hatalı veri girdiniz");//hatalı yas girişi kontrolu yapıldı
*/