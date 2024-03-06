public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!");
        }
    }
}

//Pertanyaan1: Ketika esepsi terjadi, apakah baris 12 pada AngkaSial diatas dieksekusi?
//Pertanyaan2: Apakah baris 21 pada AngkaSial diatas dieksekusi?
//Jawab1: Angka 10 dieksekusi sehingga jawaban yang keluar "10 bukan angka sial"
//        Angka 12 dieksekusi sehingga jawaban yang keluar "12 bukan angka sial"
//        Angka 13 masuk ke eksepsi sehingga yang keluar "jangan memasukkan angka 13 karena angka sial !!!" dan
//          "hati-hati memasukkan angka"
//Jawab2: Baris 21 dieksekusi karena pada baris ke 19 terdapat angka 13 sehingga program eksepsi dijalankan dan
//mengeluarkan output yanga ada di AngkaSialException
