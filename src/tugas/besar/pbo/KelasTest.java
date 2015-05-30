package tugas.besar.pbo;

import java.io.Serializable;

public class KelasTest implements Serializable{
    public static void main(String[] args){
        
        KelasProses manggil = new KelasProses();
        
        manggil.LoadUser();
        manggil.IdentitasRuangKelas();
        manggil.InputanUser();
        manggil.SaveUser();
        
        
        //bisa konek ke lenovo
    }
}
