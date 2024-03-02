package Org;

public class Mahasiswa extends Orang{
    private String nim, jurusan;
    WaliMahasiswa wali;


    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public WaliMahasiswa getWali() {
        return wali;
    }

    public Mahasiswa(String n, String j, WaliMahasiswa w){
        nim=n;
        jurusan=j;
        wali=w;
    }

    public void cetak(){

        System.out.print(getNama()+","+nim+","+getNik()+","+jurusan+","+wali+","+ wali.getNomorHP()+","+ wali.getAlamat());
    }
}
