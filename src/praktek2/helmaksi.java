package praktek2;

public class helmaksi {
    public static void main(String[] args) {
        helm r1 = new helm();
        
        r1.harga_helm = 220000;
        r1.jumlah_helm = 5;
        
        r1.cetakInfo();
        System.out.println("total = "+r1.hitungtotal());
        r1.cetaktotal();
    }
 
}
