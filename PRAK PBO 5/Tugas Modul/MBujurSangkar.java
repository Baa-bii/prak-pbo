import java.util.Scanner;
public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        BujungSangkar bs = new BujungSangkar();
        System.out.println("Masukkan sisi bujur sangkar: ");
        double sisi= scan.nextDouble();
        System.out.println("Luas Bujur Sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}