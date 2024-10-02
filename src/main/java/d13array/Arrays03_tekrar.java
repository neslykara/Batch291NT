package d13array;

import java.util.Arrays;

public class Arrays03_tekrar
{
    public static void main(String[] args) {
        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //Example 1: Create an int array and write the elements less than 5.
        //      [12, 3, -3, 5, 23] ==> 3, -3

        int[] numbers = {12, 3, -3, 5, 23};

        for (int w: numbers)
        {
            if (w<5)
            {
                System.out.println(w);
            }

        }

        //--------------------------

        String[] harf ={"A", "T", "K", "E", "B"};
        Arrays.sort(harf);
        int result = Arrays.binarySearch(harf,"B");
        System.out.println(result);









    }

}
