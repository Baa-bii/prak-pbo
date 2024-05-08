public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jari){
        this.jejari=jari;
    }

    @Override
    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
}
