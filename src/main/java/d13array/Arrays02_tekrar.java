package d13array;

import java.util.Arrays;

public class Arrays02_tekrar
{
    public static void main(String[] args)
    {
        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.
        //Example 1: Create an Array of type int called ages and place 6 elements in it,
        // display the sum of the smallest and the largest of these elements

        int[] ages = {20, 23, 19, 44, 15, 32};
        System.out.println(Arrays.toString(ages));

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        System.out.println(ages[0] + ages[ages.length-1]);


        int minimum = ages[0];
        int maxsimum = ages[0];

        for (int w : ages)
        {
            minimum = Math.min(minimum, w);
            System.out.println("minimum = " + minimum);
            maxsimum = Math.max(maxsimum, w);
            System.out.println("maxsimum = " + maxsimum);
            System.out.println("toplam: "+ (minimum+maxsimum));
        }
        System.out.println("min+max :" + (minimum+maxsimum));



    }
}
