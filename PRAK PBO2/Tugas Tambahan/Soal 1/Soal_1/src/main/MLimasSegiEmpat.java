package main;
import bangundatar.SegitigaSamaSisi;
import bangunruang.LimasSegiEmpat;
public class MLimasSegiEmpat {
    public static void main(String[] args) {
        LimasSegiEmpat l1;
        SegitigaSamaSisi s1;
        s1=new SegitigaSamaSisi();
        s1.setSisi(4);
        l1= new LimasSegiEmpat(s1, 5);

        System.out.println("Luas Permukaan="+l1.getLuasPermukaan());
        System.out.println("Volume="+l1.getVolume());

    }
}
