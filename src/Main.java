public class Main {
    public static void main(String[] args) {
        try {
            Anggota a1 = new Anggota("Farrel");
            Buku b1 = new Buku("Mein Kampf");
            Buku b2 = new Buku("Lord of The Rings");
            Buku b3 = new Buku("The Mockingjay");
            Buku b4 = new Buku("Game of Thrones");

            a1.pinjamBuku(b1);
            a1.pinjamBuku(b2);
            a1.pinjamBuku(b3);
            a1.pinjamBuku(b4);
        }
        catch (MaksimumBukuTerpinjamException mb){
            System.out.println(mb.getMessage());
        }
        catch (BukuTidaktersediaException bt){
            System.out.println(bt.getMessage());
        }
    }
}
