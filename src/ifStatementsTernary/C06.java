package ifStatementsTernary;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının
        // hangi bölgede olduğunu yazdıran bir kod yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("X ve Y degerleri giriniz: ");
        int x=scan.nextInt();
        int y=scan.nextInt();
        if(x>0 && y>0){
            System.out.println("Girdiginiz degerler 1. bolgeye aittir");
        }else if(x<0 && y>0){
            System.out.println("Girdiginiz degerler 2. bolgeye aittir");
        }else if(x<0 && y<0){
            System.out.println("Girdiginiz degerler 3. bolgeye aittir");
        }else if(x>0 && y<0){
            System.out.println("Girdiginiz degerler 4. bolgeye aittir");
        }else if(x!=0 && y==0){
            System.out.println("Girdiginiz degerler x ekseni uzerindedir.");
        }else if(x==0 && y!=0){
            System.out.println("Girdiginiz degerler y. ekseni uzerindedir");
        }else {
            System.out.println("girdiginiz degerler orijindedir");
        }

    }
}
