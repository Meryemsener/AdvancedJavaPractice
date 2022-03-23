package ifStatementsTernary;

import java.util.Scanner;

public class C013 {
    public static void main(String[] args) {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
        Bu bir dik üçgendir
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("birinci kenarı giriniz: ");
        int a=scan.nextInt();
        System.out.println("ikinci kenarı giriniz: ");
        int b= scan.nextInt();
        System.out.println("üçüncü kenarı giriniz: ");
        int c=scan.nextInt();
        if((a*a)+(b*b)==c*c){
            System.out.println("girdiginiz kenarlar bir dik ucgene aittir");
        }else if((b * b) + (c * c) == a * a){
            System.out.println("girdiginiz kenarlar bir dik ucgene aittir");

        }else if((a * a) + (c * c) == b * b){
            System.out.println("girdiginiz kenarlar bir dik ucgene aittir");

        }else{
            System.out.println("Bu bir dik ucgen degildi");
        }

    }
}
