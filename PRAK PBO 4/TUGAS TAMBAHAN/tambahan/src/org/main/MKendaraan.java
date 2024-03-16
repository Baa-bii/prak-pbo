package org.main;
import org.kendaraan.*;
import org.mobil.Mobil;
import org.motor.Motor;
import org.truk.Truk;

public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan1= new Kendaraan("Kendaraan Nathan");
        Mobil mobil = new Mobil("Bugatti Chiron", 2);
        Motor motor= new Motor("Ducati Panigale V4 R", 998);
        Truk truk = new Truk("Mercedez-Benz Actros", 20);

        motor.hitungHorsePower();

        mobil.cetakInfo();
        motor.cetakInfo();
        truk.cetakInfo();

        mobil.klakson();
        motor.klakson();
        truk.klakson();

    }
}
