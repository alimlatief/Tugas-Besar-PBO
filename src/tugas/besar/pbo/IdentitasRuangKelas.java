/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar.pbo;

import java.io.Serializable;

/**
 *
 * @author Alim
 */
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

