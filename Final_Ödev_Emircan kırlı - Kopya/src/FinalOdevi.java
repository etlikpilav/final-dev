import java.time.LocalDateTime;


public class FinalOdevi {
    public static void main(String args[]) {


        System.out.println("***Mühendis Bilgisi***\n");

        Muhendis muh = new Muhendis("emir","kemal",2001,"Bilgisayar",
                "JAVA",2020,40000,39,10.2f);

        muh.Bilgi();
        muh.Zam(39);
        muh.Zam(10.2f);


        System.out.println("\n***Doktor Bilgisi***\n");

        Doktor dok = new Doktor("emir kral", "tarık", 2001,
                "Egitim Arastirma", "CERRAH", 30, 2020,
                31940,39,10.5f);

        dok.Bilgi();
        dok.Zam(39);
        dok.Zam(10.2f);

        System.out.println("\n***Öğretmen Bilgisi***\n");

        Ogretmen ogr = new Ogretmen("tarık","batu bey",2001,"İNGİLİZCE",
                2020,46,9674,56,20.0f);

        ogr.Bilgi();
        ogr.Zam(39);
        ogr.Zam(10.2f);

    }
}


