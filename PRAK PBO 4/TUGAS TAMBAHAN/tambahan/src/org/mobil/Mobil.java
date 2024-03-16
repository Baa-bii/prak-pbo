package org.mobil;
import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan{
    private int jumlahPintu;

    public Mobil(String nama, int jumlahPintu){
        this.jumlahPintu=jumlahPintu;
        this.nama=nama;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
    }
    public void bukaPintu(int nomorPintu){
        System.out.println("Pintu "+nomorPintu+" terbuka");
    }

    @Override
    public void klakson() {
        System.out.println(this.getNama()+" Berbunyi, Vroom Vroom!");
    }
}
