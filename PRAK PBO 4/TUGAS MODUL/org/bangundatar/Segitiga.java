package org.bangundatar;
import org.Poligon.Poligon;
public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas=alas;
        this.tinggi=tinggi;
        this.jumlahSisi=jumlahSisi;
    }

    public double hitungLuas(){
        return (0.5*alas)*tinggi;
    }
    public void Info(){
        System.out.println("Bangun Segitiga berisi"+this.getJumlahSisi());
    }
}
