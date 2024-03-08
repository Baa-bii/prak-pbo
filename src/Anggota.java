public class Anggota {
    private String nama;
    private Buku[] bukupinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama){
        this.nama= nama;
        bukupinjaman= new Buku[3];
        jumlahBukuPinjaman=0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukupinjaman() {
        return bukupinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidaktersediaException{
        if(jumlahBukuPinjaman>=bukupinjaman.length){
            throw new MaksimumBukuTerpinjamException();
        }
        if(!buku.isTersedia()) {
            throw new BukuTidaktersediaException();
        }
        buku.setTersedia(false);
        System.out.println("Selamat Membaca");
        bukupinjaman[jumlahBukuPinjaman]=buku;
        jumlahBukuPinjaman++;
    }
}
