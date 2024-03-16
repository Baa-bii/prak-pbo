package org.kendaraan;

public class Kendaraan {
    protected String nama;
    protected int kecepatan;

    public Kendaraan (String nama){
        this.nama=nama;
    }

    public Kendaraan() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void cetakInfo(){
        System.out.println("Nama Kendaraan: "+this.getNama()+" Kecepatan Kendaraan: "+this.getKecepatan()+" Jenis Kendaraan: "+this.getClass());
    }

    public void gas(int cepat,int durasi){
        kecepatan=cepat;
        durasi=durasi;
    }
    public void berhenti(){
        kecepatan=0;
    }

    public void klakson(){
        System.out.println(this.getNama()+"Berbunyi");
    }
}
