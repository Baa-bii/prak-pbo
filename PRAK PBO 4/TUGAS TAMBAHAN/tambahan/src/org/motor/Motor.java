package org.motor;
import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    private int cc;

    public Motor(String nama ,int cc){
        this.cc=cc;
        this.nama=nama;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
    }
    public void hitungHorsePower(){
        System.out.println("Motor A diperkirakan memiliki tenaga antara "+(cc/15)+" sampai "+(cc/17)+" HP");
    }

    @Override
    public void klakson() {
        System.out.println(this.getNama()+" Berbunyi, Womp Womp!");
    }
}
