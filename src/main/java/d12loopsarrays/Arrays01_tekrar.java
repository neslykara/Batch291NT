package d12loopsarrays;

import java.util.Arrays;

public class Arrays01_tekrar
{
    public static void main(String[] args)
    {
        String[] stdNames1 = new String[3];
    //    String stdNames2[] = new String[4]; // Bu şekilde de array oluşturulabilir ama üst satir tercih ediliyor.

        System.out.println(Arrays.toString(stdNames1)); // [null, null, null]

        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes));

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));

//------arastirma
        boolean[] bool=new boolean[3];
        System.out.println(Arrays.toString(bool));

        String[] names = new String[3];
        System.out.println(Arrays.toString(names));

        names[0] = "Ali Can";
        names[2] = "Veli Can";
        names[1] = "Ayse Hanim";

        names[0] = "ali can";

        System.out.println(Arrays.toString(names));

        String[] cities = new String[5];
        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";

        System.out.println(Arrays.toString(cities));

        int totalChar = 0;

        for (int i = 0; i < cities.length ; i++)
        {
            totalChar = totalChar + cities[i].length();

        }
        System.out.println("totalChar = " + totalChar);


        int sum =0;

        for (String w : cities )
        {
            sum = sum + w.length();

        }
        System.out.println("sum = " + sum);










    }
}
