/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100318;

/**
 *
 * @author Andreas Pc
 */
public class Data_mhs {
 protected String nama;
 protected String nrp;
  protected int angkatan;

    public Data_mhs(String nama, String nrp, int angkatan) {
        this.nama = nama;
        this.nrp = nrp;
        this.angkatan = angkatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public String toString() {
        return "Data_mhs{" + "nama=" + nama + ", nrp=" + nrp + ", angkatan=" + angkatan + '}';
    }
    
}
