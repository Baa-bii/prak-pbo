package org.truk;
import org.kendaraan.Kendaraan;
public class Truk extends Kendaraan {
    private int kapasitasMuatan,beratMuatan;

    public Truk(String nama ,int kapasitasMuatan){
        this.beratMuatan=beratMuatan;
        this.nama=nama;
    }

    public void setBeratMuatan(int beratMuatan) {
        this.beratMuatan = beratMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getBeratMuatan() {
        return beratMuatan;
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
    }

    @Override
    public void klakson() {
        System.out.println(this.getNama()+" Berbunyi, Honk Honk!");
    }
    public void muatBarang(int berat){
        berat=berat+beratMuatan;
        if (berat>kapasitasMuatan){
            System.out.println("Maaf muatan terlalu banyak");
        }
    }
}
