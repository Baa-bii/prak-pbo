class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari=jariJari;
    }
    public double hitKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }

}
public class asersi2 {
    public static void main(String[] args) {
        double jariJari=0;
        assert (jariJari<0):"Jari-jari tidak boleh 0!!";
        Lingkaran L1 = new Lingkaran(jariJari);
        double kelilingLingkaran= L1.hitKeliling();
        System.out.println("Keliling Lingkaran="+kelilingLingkaran);
    }
}

//Pertanyaan: secara konsep ada yang kurang tepat pada program asersi2 di atas?
//Jawab: sudah tepat