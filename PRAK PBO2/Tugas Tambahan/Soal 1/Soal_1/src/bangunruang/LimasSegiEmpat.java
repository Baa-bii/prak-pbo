package bangunruang;
import  bangundatar.SegitigaSamaSisi;
public class LimasSegiEmpat {
    private SegitigaSamaSisi sisi;
    private double tinggi;

    public LimasSegiEmpat(SegitigaSamaSisi sisi, double tinggi){
        this.sisi=sisi;
        this.tinggi=tinggi;
    }

    public void setSisi(SegitigaSamaSisi sisi) {
        this.sisi = sisi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public SegitigaSamaSisi getSisi() {
        return sisi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getLuasPermukaan(){
        double luasSisi= sisi.getLuas();
        double luasAlas= sisi.getSisi();
        return (luasSisi*4)+(luasAlas*luasAlas);
    }
    public double getVolume(){
        double Alas= sisi.getSisi();
        double luasAlas= Alas*Alas;
        return luasAlas*((double) 1 /3)*tinggi;
    }
}
