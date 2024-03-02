package bangundatar;

public class SegitigaSamaSisi {
    private double sisi, tinggi;

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public double getLuas(){
        return (0.5*sisi)*tinggi;
    }

}
