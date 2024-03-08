public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja(){
        keranjang= new String[5];
        count=0;
    }

    public void addItem(String item){
        keranjang[count]=item;
        count++;
        assert(count > keranjang.length):"Keranjang sudah penuh";
    }
    public void printItems(){
        for (int i=0; i< keranjang.length;i++){
            System.out.println(keranjang[i]);
        }
    }
}
