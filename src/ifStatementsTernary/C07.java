package ifStatementsTernary;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        /* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		   hatali giris seklinde code create ediniz
		 */
        System.out.println("Lutfen bir harf giriniz");
        Scanner scan = new Scanner(System.in);

        char harf = scan.nextLine().charAt(0);
        if (harf >= 'A' && harf <= 'Z') {
            System.out.println("Girdiginiz karakter buyuk harftir");
        } else if (harf >= 'a' && harf <= 'z') {
            System.out.println("girdiginiz karakter kucuk harftir");
        } else {
            System.out.println("lutfen gecerli bir karakter giriniz");
        }
    }
}
