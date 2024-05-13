import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        /*
        for (baslatma ; kosul ; arttırma veya azaltma islemleri) {
        Döngü kosulumuz dogru oldugu sürece burası calısacaktır

        }



        Yani burada; belirtilen koşula gelene kadar döngü calışmaya devam eder.

         */






        //1. Örnek ;
        // i degiskeni 0 degerindedir. i 5 ten kücüktür, i+1 ekleyerek 5 ten kücük olana kadar bu islemi tekrarla . döngüyü sürdür demek.


        int i;

        for (i =0 ; i < 5 ; i++) {

            System.out.println("i = " + i );
        }


        // 2. Örnek ; for loop unun farklı yazılısları olabiliyor. Asagıdaki örnekte degisken for döngüsünün icinde tanımlanıyor. Ve bu degisken sadece bu döngüde kullanılabiliyor.


        for ( int b = 0 ; b < 5 ; b++) {

            System.out.println(" b =" + b);
        }

        //3. Örnek  a deiskenimizin değeri 10 , sıfıra esit ve sıfırdan büyük 10 olana kadar döngüyü devam ettir.

        for ( int a = 10 ; a >= 0 ; a--) {

            System.out.println("  a = " + a);
        }

        //4. Örnek. Farklı yazım bicimi

        int x = 0 ;
        for ( ; x < 5 ; x++) {

            System.out.println("Yazdırmak isteidigimiz metini for loop döngü ile istedigimiz kadar yazdırabiliriz..");
        }


        //5. Örnek  - 2 degisken ile uygulama

        int c = 0;
        int j = 10;

        for ( ; c < 10 && j > 0; c++,j--) {

            System.out.println("C = " + c );
            System.out.println("j = " + j );


        }

        //6. Örnek

        for ( int y = 2 ; y < 100 ;  y *= 2) {

            System.out.println("y = " + y );


        }


        ///7. Örnek - Kullanıcan bir input alarak faktöriyelini alalım :)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz..:");

        int faktoriyel = 1 ;

        int sayi = scanner.nextInt();

        for ( int m = 1 ;  m <= sayi; m++) {

            faktoriyel *= m ;
            System.out.println("Faktöriyel = " + faktoriyel + " m = " + m);


        }

        System.out.println("Faktoriyel = " + faktoriyel);







    }
}
