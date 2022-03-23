package ifStatementsTernary;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        /* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	    INFO :
		BMI = kilo(kg) /((boy/100)*(boy/100)) (cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

        Scanner scan = new Scanner(System.in);
        System.out.println(" boyunuzu metre turunden giriniz :");
        double boy = scan.nextDouble();
        System.out.println("kilonuzu kg giriniz");
        double kilo = scan.nextDouble();

        double bmi = kilo / ((boy/100) * (boy/100));

        if (bmi <= 20) {
            System.out.println("oldukca zayifsiniz");

        } else if (20 < bmi & bmi <= 25) {
            System.out.println("Normal sinirlardasiniz");


        } else if (25 < bmi & bmi <= 30) {
            System.out.println("Sisman kategorisindesiniz");
        } else if (30 < bmi ){
            System.out.println("Obez grubundasiniz");
        }
    }
}