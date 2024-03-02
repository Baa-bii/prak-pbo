package bangundatar;

public class MSegitiga {
    public static void main(String[] args) {
        SegitigaSamaSisi s1;

        s1=new SegitigaSamaSisi();
        s1.setSisi(3);
        s1.setTinggi(5);

        System.out.println("luas=" + s1.getLuas());

    }
}
