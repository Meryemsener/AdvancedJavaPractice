package methodCreation;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
        String metin;
        char karakter;
        int sayac = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("metin giriniz = ");
        metin = scan.nextLine();
        for (int i = 0; i < metin.length(); i++) {
            karakter = metin.charAt(i);
            if (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u') {
                sayac++;
                System.out.println(sayac + "adet sesli harf vardir");
            }else{
                System.out.println("hatali giris");

            }

            }

        }
    }


