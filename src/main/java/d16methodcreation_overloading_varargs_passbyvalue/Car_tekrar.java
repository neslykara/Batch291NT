package d16methodcreation_overloading_varargs_passbyvalue;

public class Car_tekrar
{
    //1-variable’lar olusturalim (pasif ozellikler)

    String brand = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;


    //2-method’lar olusturalim (aktif ozellikler)

    public void action()
    {
        System.out.println(brand + " hizli hareket eder.");
    }

    public  void stop()
    {
        System.out.println(brand + " guvenli bir sekilde durur");
    }


    //3-CarRunner yani main’li class’i olusturalim


    //6-Constructor nedir?
    /*
       Class'tan object olusturmamizi saglayan bolumdur.
       Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
       Bu constructor'lara "default constructor" denir.
       default constructor ===> Car ()
    */


    // 7- Constructor nasil olusturulur?
    /*
        Access Modifier + Class ismi + () + {}
        Kendiniz constructor'inizi olusturdugunuz zaman Java default constructor'i siler

        Method ile Constructor arasindaki fark nedir? Interview Sorusu
        a)Methodlarda return type olur, constructor'larda olmaz
        b)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
        c)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir.(constructorlar objeleri başlatmak ve class'in başlatılmasını sağlamak için kullanılır.)
        d)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar

        Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip object'ler olusturabiliriz
    */



    /*
        Java'da 2 tur constructor vardir

    a- Parametresiz (default)

        a) otomatik uretilen parametresiz constructor
        b) kullanici tarafindan tanimlanan parametresiz constructor

    b- Parametreli
    */

  /*  public Car_tekrar (String brand, String model, int year, boolean hybrid)
    {
        this.brand = brand; // Bu class'taki brand degerini kullanma, ben sana parametre olarak gönderecegim
        this.model = model;
        this.year = year;
        this.hybrid =hybrid;

    }
*/













}
