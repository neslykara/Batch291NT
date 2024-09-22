package tekrar;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun
        vi) En az 1 sembol icermeli*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen parolanızı giriniz");
        String pwd = input.nextLine();

        boolean lengthControl = pwd.length() > 7;
        //boolean spaceControl = pwd.replaceAll("[^ ]", "").length() == 0;
        boolean spaceControl = !pwd.contains(" ");
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]" , "").length()>0;
        boolean digitControl = pwd.replaceAll("[^0-9]", "").length()>0;
        boolean sembolControl = pwd.replaceAll("[^\\p{Punct}]" , "").length()>0;

        /*System.out.println("lengthControl = " + lengthControl);
        System.out.println("spaceControl = " + spaceControl);
        System.out.println("upperCaseControl = " + upperCaseControl);
        System.out.println("lowerCaseControl = " + lowerCaseControl);
        System.out.println("digitControl = " + digitControl);
        System.out.println("sembolControl = " + sembolControl);*/

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl && sembolControl;

        if (isValid)
        {
            System.out.println("Sifre gecerlidir");
        }
        else
        {
            System.out.println("Sifre gecersizdir");
        }




    }
}
