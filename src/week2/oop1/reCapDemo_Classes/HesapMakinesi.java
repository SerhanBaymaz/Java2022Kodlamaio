package week2.oop1.reCapDemo_Classes;

public class HesapMakinesi {
   public double topla(double sayi1, double sayi2) {
       return sayi1 + sayi2;
   }
    public double cikar(double sayi1, double sayi2) {
         return sayi1 - sayi2;
    }
    public double carp(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }
    public double bol(double sayi1, double sayi2) {
        if (sayi2 == 0) {
            System.out.println("Bir sayı sıfıra bölünemez!");
            return 0;
        }else {
            return sayi1 / sayi2;
        }
    }

}
