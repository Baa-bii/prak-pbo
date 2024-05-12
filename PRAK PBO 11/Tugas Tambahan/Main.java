class Data<T> extends Ulat{
    T isi;
    T getIsi(){return this.isi;}

    void setIsi(T X) {
        this.isi = X;
    }
}
class Sembarang {
    <T> T pick (T[] a, int c){
        return a[c];
    }
}
class Ulat extends Kupu {
    void gerak(){
        System.out.println("Ulat merayap");
    }
}
class Kepompong extends Kupu{
    void gerak(){System.out.println("Kepompong diam");}
}
class Kupu {
    void gerak(){
    }
}
class KupuDewasa extends Kupu{
    void gerak(){System.out.println("Kupu Terbang");}
}

public class Main {
    public static void main(String[] args) {
        //------------------------------//
        Kupu K;
        Data < Kupu > anu;
        K = new Kupu();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Ulat());
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
        //-----------------------------//
    }
}
