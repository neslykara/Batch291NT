package d15arraylist_methodcreation;

import java.util.ArrayList;

public class HW_3
{
    public static void main(String[] args) {
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
        int minDiff = nums.get(1) - nums.get(0);
      // int sayi1=0;
      // int sayi2=0;


        //------------ODEV: Bu soru tek for'la veya for each'le cozulebilir miydi?
        //------------for each

        for (int w1: nums)
        {
            for (int w2:nums)
            {
                if(w1!=w2)
                {
                 int diff = Math.abs(w1 - w2);
                    if (diff<minDiff)
                    {
                        minDiff=diff;
                        if (nums.get(w1)-nums.get(w2)==minDiff)
                        System.out.println(nums.get(w1)+" ve "+nums.get(w2));
                    }
                }
            }

        }
        System.out.println(minDiff);
       // System.out.println(sayi1+" ve "+sayi2);


    }
}
