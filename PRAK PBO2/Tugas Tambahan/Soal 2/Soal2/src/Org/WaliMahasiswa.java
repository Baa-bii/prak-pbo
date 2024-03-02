package Org;

public class WaliMahasiswa extends Orang{
    private String nomorHP, alamat;

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public String getAlamat() {
        return alamat;
    }

    public WaliMahasiswa (String noHp, String al){
        nomorHP=noHp;
        alamat=al;
    }
}
