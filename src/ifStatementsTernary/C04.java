package ifStatementsTernary;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
   /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen vize ve final notunuzu giriniz");
        double not1= scan.nextDouble(), not2= scan.nextDouble();
        double ortalama =(not1+not2)/2;
        if(ortalama>=50){
            System.out.println("Tebrikler dersi basari ile gectiniz. Ortalamaniz : " + ortalama);
        }if(ortalama <50) {
            System.out.println("Malesef dersten kaldiniz.Ortalamaniz : "+ ortalama);
        }

    }
}
