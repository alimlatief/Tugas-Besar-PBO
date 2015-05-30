package tugas.besar.pbo;

import java.io.*;

public class IdentitasRuangKelas implements Serializable{
    private String namaRuang;
    private String lokasiRuang;
    private String programStudi;
    
        public void setNamaRuang(String namaRuang) {
            this.namaRuang = namaRuang;
        }
        public String getNamaRuang() {
            return namaRuang;
        }
        public void setLokasiRuang(String lokasiRuang) {
            this.lokasiRuang = lokasiRuang;
        }
        public String getLokasiRuang() {
            return lokasiRuang;
        }
        public void setProgramStudi(String programStudi) {
            this.programStudi = programStudi;
        }
        public String getProgramStudi() {
            return programStudi;
        }
}

