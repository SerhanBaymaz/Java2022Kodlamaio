package week2.oop1.reCapDemo_Classes;

public class ReCapDemo_Classes {
    public static void main(String[] args) {

        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        double toplam = hesapMakinesi.topla(5, 6);
        double fark = hesapMakinesi.cikar(5, 6);
        double carpim = hesapMakinesi.carp(5, 6);
        double bolum = hesapMakinesi.bol(5, 6);

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpım: " + carpim);
        System.out.println("Bölüm: " + bolum);

    }



}
