package org.Main;
import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segitiga = new Segitiga(12, 10, 3);
        persegi.printInfo();
        segitiga.Info();
        System.out.println(("Luas Persegi Panjang adalah "+persegi.hitungLuas()));
        System.out.println(("Luas Segitiga adalah "+segitiga.hitungLuas()));
    }
}
