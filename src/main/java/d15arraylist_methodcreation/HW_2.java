package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Arrays;

public class HW_2
{
    public static void main(String[] args)
    {
        //Ornek 1: Bir tane Integer List olusturunuz.Bu List’te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.
        //      [12, 23, 10, 19] ==> 12 ve 10
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums);
        nums.sort(null);
        System.out.println(nums);


        //------------ODEV: Bu soru tek for'la veya for each'le cozulebilir miydi?
        //------------for


        ArrayList<Integer> diff = new ArrayList<>();

        for (int i = 1; i < nums.size(); i++)
        {
            diff.add(nums.get(i)- nums.get(i-1));
            diff.sort(null);
            if((nums.get(i)- nums.get(i-1))==diff.get(0))
            {
                System.out.println(nums.get(i)+" ve "+nums.get(i-1));
            }
        }
    }
}
