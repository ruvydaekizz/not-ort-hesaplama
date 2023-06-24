import java.util.Scanner;  //2.adım--  kullanıcıdan veri almak için Scanner sınıfnı dahil etme

public class Hesap {

    public static void main(String[] args) {

        double mat ,fizik,kimya,turkce,tarih,muzik;  //1.adım-- değişkenleri tanımlama

        Scanner inp = new Scanner(System.in);  //3.adım --Scanner sınıfını tanımlama

        //4.adım-- Kullanıcıdan değerleri/verileri alma

        System.out.print("Matematik notunuz:");
        mat =  inp.nextDouble();


        System.out.print("Fizik notunuz:");
        fizik= inp.nextDouble();


        System.out.print("Kimya notunuz:");
        kimya= inp.nextDouble();


        System.out.print("Türkçe notunuz:");
        turkce= inp.nextDouble();

        System.out.print("Tarih notunuz:");
        tarih= inp.nextDouble();

        System.out.print("Müzik notunuz:");
        muzik= inp.nextDouble();

        /*
        5.adım---  Bu kısımda kontrol etmek için ekrana yazdırma

        System.out.println(mat);
        System.out.println(fizik);
        System.out.println(kimya);
        System.out.println(turkce);
        System.out.println(tarih);
        System.out.println(muzik);
        */

        //6.adım -- tüm derslerin notlarını hesaplayıp ortalamalarını alma

        double ortalama= (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ders ortalamanız: " + ortalama);


        //7.adım -- sonuç kısmında Sınıfta kalıp kalmama durumunu kontrol eetme

        String sonuc= (ortalama>=60)? "Sınıfı Geçti" : "Sınıfta Kaldı" ;
        System.out.println("Sonuç: " + sonuc);


    }
}
