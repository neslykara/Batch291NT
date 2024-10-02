package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame_tekrar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rastgele = random.nextInt(101);

        int denemeSayisi = 0;

        int tahminiDeger;

        boolean tahminDogruMu = false;

        //-------------

        System.out.println("0-100 arasinda bir sayiyi tahmin etmeye çalisin");

        do
        {
            System.out.println("Tahmininizi yapiniz ");
            tahminiDeger=scanner.nextInt();

            denemeSayisi++;

            if (tahminiDeger<rastgele)
            {
                System.out.println("Sayi daha büyük");
            } else if (tahminiDeger>rastgele) {
                System.out.println("Sayi daha kücük");

            }else {
                tahminDogruMu=true;
                System.out.println("Tebrikler dogru tahmin");
                System.out.println("denemeSayisi = " + denemeSayisi);
            }


        }while (!tahminDogruMu);

        scanner.close();
        //










    }
}
