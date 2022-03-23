package switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        Scanner scan = new Scanner(System.in);
        System.out.println("pazartesi: 1\nSali: 2\nCarsamba: 3\nPersembe: 4\nCuma:5\nCumartesi:6\nPazar:7\n");

        int kacinciGun=scan.nextInt();
        System.out.println("kac gun sonrasini ogrenmek istiyorsunuz");
        int kacGunSonrasi=scan.nextInt();
;
        int hangiGun=(kacGunSonrasi+kacinciGun)%7;

        switch(hangiGun){
            case 1:
                System.out.println(kacGunSonrasi+"gun sonra gunlerden pazartesi");break;
            case 2:
                System.out.println(kacGunSonrasi+"gun sonra gunlerden sali");break;
            case 3:
                System.out.println(kacGunSonrasi+"gun sonrasi carsamba");break;
            case 4:
                System.out.println(kacGunSonrasi+"gun sonrasi persembe");break;
            case 5:
                System.out.println(kacGunSonrasi+"gun sonrasi cuma");break;
            case 6:
                System.out.println(kacGunSonrasi+"gun sonrasi cumartesi");break;
            case 7:
                System.out.println(kacGunSonrasi+"gun sonrasi cumartesi");break;
            default:
                System.out.println("hatali giris");
        }


    }
}

