package d11loops;

import java.util.Scanner;

public class ForLoops04
{
    public static void main(String[] args)
    {
        /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
           Example 2:  Create the code that prints the following figure to the console.
                 X X X X X
                 X X X X X
                 X X X X X
      */

        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısı giriniz.");
        int row = input.nextInt();

        System.out.println("Sütun sayısını giriniz");
        int column = input.nextInt();

        for (int i = 1; i <= row ; i++)
        {
            for (int j = 1; j <=column ; j++)
            {
                System.out.print("x ");
            }
            System.out.println();

        }










//       Scanner input = new Scanner(System.in);
//       System.out.println("Satir sayisini giriniz");
//       int row = input.nextInt();

//       System.out.println("Sütun sayisini giriniz");
//       int column =input.nextInt();


//       for (int i = 1; i <=row  ; i++)
//       {
//           for (int j = 1; j <=column ; j++)
//           {
//               System.out.print("* ");

//           }
//           System.out.println();// üstteki print yanyana yazdirir. Bu pointer'i bir alta aldik
//       }

        /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
          Homework: Draw the following figure using for-loop.

        	*
        	* *
        	* * *
        	* * * *

        */










    }
}
