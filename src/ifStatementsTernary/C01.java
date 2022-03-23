package ifStatementsTernary;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

     Scanner scan=new Scanner(System.in);//kullanicidan veri almak icin kullanilir
        System.out.println("toplama icin 1'i secin\n cikarma icin 2'yi secin\n bolme icin 3'u secin \n carpma icin 4'u secin\n");

        int islem=scan.nextInt();
        System.out.println("Lutfen iki tam sayi giriniz :");//kullaniciya bildirimde bulunuldu


        double num1=scan.nextDouble();//imlecin burdayken ctrl d yaparsan bu satiri bir alta kopyalar
        double num2= scan.nextDouble();//imlecin data tipinin uzerindeyken alta basili tut ve asagi dogru cek ayni anda tum yerlerin adini degirstirebilirsin

        if(islem==1) {
            System.out.println("Toplama isleminin sonucu :" + num1+" + "+num2+" = " +(num1+num2) );

        }
        else if(islem==2){
            System.out.println("Cikarma isleminin sonucu :" + num1+" - "+num2+" = " +(num1-num2) );
        }

        else if(islem==3){
            System.out.println("Carpma isleminin sonucu :" + num1+" * "+num2+" = " +(num1*num2) );
        }

        else if(islem==4){
            System.out.println("Bolme isleminin sonucu :" + num1+" / "+num2+" = " +(num1/num2) );
        }  else System.out.println("Hatali secim yaptiniz, tekrar deneyiniz");
        //else den sonra-tek satir oldugu icin- suslu parantez yapmasan da calisir
       //ama suslu parantez kullanilmasi tavsiye edilir


    }
}
