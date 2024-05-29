import java.util.*;


public class LambdaNim {
    public static void main(String[] args) {
        Map<String, String> mahasiswa= new HashMap<String, String>();

        mahasiswa.put("12345", "Adi");
        mahasiswa.put("67890", "Bambang");

        Set<String> key = mahasiswa.keySet();

        mahasiswa.forEach((s, s2) -> System.out.println(s+' '+s2));
    }
}
