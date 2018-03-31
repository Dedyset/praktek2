package praktek2;

public class helm {
    int harga_helm;
    int jumlah_helm;   
    
    void cetakInfo(){
        System.out.println("=============================");
        System.out.println("harga_helm      :"+harga_helm);
        System.out.println("jumlah_helm     :"+jumlah_helm);
        System.out.println("=============================");
        }
    
    int hitungtotal(){
        int total;
        total=harga_helm*jumlah_helm;
        return total;
    }
}