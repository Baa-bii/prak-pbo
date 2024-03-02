package Org;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1;
        WaliMahasiswa w1;

        w1=new WaliMahasiswa("0812345678", "Jl.Prof Soedarto");

        m1= new Mahasiswa("171171112","Informatika", w1);
        m1.setNama("Arya");
        m1.setNik("33551122447");


        m1.cetak();

    }
}
