package d14multidimensionalarrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList02_tekrar
{
    public static void main(String[] args)
    {
        //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin.
        //Example 1: Create an Integer ArrayList and change the odd ones to 11


        ArrayList<Integer> list =new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list); //[23, 24, 12, 9, 3]

        for (Integer w : list)
        {
            if (w %2 != 0)
            {list.set(list.indexOf(w),11 );}
        }
        System.out.println(list);

    }
}
