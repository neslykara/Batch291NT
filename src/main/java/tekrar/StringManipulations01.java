package tekrar;

import java.util.Locale;

public class StringManipulations01
{
    public static void main(String[] args)
    {
        String s = "Java is easy";

        //Ornek 1: “s” String’inde kullanilan karakter sayisini bulunuz.
        //Example 1: Find the number of characters used in String “s”.
        int sLength = s.length();
        System.out.println("sLength = " + sLength);

        //Ornek 2: “s” String’inde ilk ve son index’teki karakterleri aliniz.
        //Example 2: Get the characters in the first and last index of String “s”.
        char sFirstChar = s.charAt(0);
        char sLastChar = s.charAt(s.length()-1);
        System.out.println("sFirstChar = " + sFirstChar);
        System.out.println("sLastChar = " + sLastChar);

        //Ornek 3: “s” String’indeki ilk 4 karakteri aliniz.
        //Example 3: Get the first 4 characters of the string “s”.
        String first4Char = s.substring(0,4);
        System.out.println("first4Char = " + first4Char);


        //Ornek 4: "s" String'indeki "is" kelimesini aliniz.
        //Example 4: Get the word "is" in String "s".
        String sub4 = s.substring(5,7);
        System.out.println("sub4 = " + sub4);

        //Ornek 5: "s" String'indeki “easy" kelimesini aliniz.
        //Example 5: Get the word "easy" in String "s".
        String sub5 = s.substring(8,12);
        System.out.println("sub5 = " + sub5);

        //Ornek 6: “s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
        //Example 6: Check if the word easy exists in the String "s".
        boolean sub6 = s.contains("easy");
        System.out.println("sub6 = " + sub6);

        //Ornek 7: “s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        //Example 7: Check if the string "s" starts with a certain letter.
        boolean firstCharControl = s.toLowerCase().startsWith("j");
        System.out.println("firstCharControl = " + firstCharControl);

        //startsWith() methodu bir Strig’in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.




    }
}
