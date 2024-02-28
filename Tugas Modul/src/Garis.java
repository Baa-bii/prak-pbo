public class Garis {
    private Titik titikAwal, titikAkhir;

    public Garis (Titik titikAwal, Titik titikAkhir){
        this.titikAwal=titikAwal;
        this.titikAkhir=titikAkhir;
    }

    public void setTitikAwal(Titik awal){
        titikAwal=awal;
    }

    public void setTitikAkhir(Titik akhir){
        titikAkhir=akhir;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public double getPanjang(){
        return Math.sqrt((Math.pow(titikAwal.getAbsis(), 2)-Math.pow(titikAwal.getOrdinat(), 2))+(Math.pow(titikAwal.getAbsis(), 2)- Math.pow(titikAkhir.getOrdinat(), 2)));
    }

    public double getGradien(){
        return ((titikAkhir.getOrdinat()- titikAwal.getOrdinat())/ titikAkhir.getAbsis()- titikAwal.getAbsis());
    }

    public void getRefleksiY(Garis p){

    }
}