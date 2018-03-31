package praktek2;

public class helm {
    int harga_helm;
    int jumlah_helm;   

    public helm() {
        harga_helm=200000;
        jumlah_helm=10;
    }

    public helm(int harga_helm, int jumlah_helm) {
        this.harga_helm = harga_helm;
        this.jumlah_helm = jumlah_helm;
    }
    
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
    
     void cetaktotal(){
        System.out.println("Totalnya adalah: "+hitungtotal());
     }
}