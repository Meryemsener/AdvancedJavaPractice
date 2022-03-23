package ifStatementsTernary;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        /*
         * TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin,
         * kullaniciya musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adedi girin");
        int urunAdedi=scanner.nextInt();

        System.out.println("Urunun liste fiyatini giriniz");
        double fiyat= scanner.nextDouble();


        System.out.println("Kartiniz varsa Y yoksa N yazin");
        char kart=scanner.next().charAt(0);
        double toplamFiyat;
        if(kart=='Y'){
            if(urunAdedi>10){
                fiyat*=0.80;
                toplamFiyat=fiyat*urunAdedi;
                System.out.println("%20 inidirm =" + toplamFiyat);
            }else {
                fiyat*=0.85;
                toplamFiyat=fiyat*urunAdedi;
                System.out.println("%15 inidirm =" + toplamFiyat);
            }

        }else if(kart=='N'){
            if(urunAdedi<10){
                fiyat*=0.85;
                toplamFiyat=fiyat*urunAdedi;
                System.out.println("%15 inidirm =" + toplamFiyat);
            }else {
                fiyat*=0.90;
                toplamFiyat=fiyat*urunAdedi;
                System.out.println("%10 inidirm =" + toplamFiyat);
            }



        }else System.out.println("hatali giris");



    }
}






