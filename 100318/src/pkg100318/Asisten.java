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
public class Asisten extends Data_mhs {
    private String kelas;
    private String NIk;
    
    public Asisten(String kelas, String NIk, String nama, String nrp, int angkatan) {
        super(nama, nrp, angkatan);
        this.kelas = kelas;
        this.NIk = NIk;
    }

   

 

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNIk() {
        return NIk;
    }

    public void setNIk(String NIk) {
        this.NIk = NIk;
    }

    @Override
    public String toString() {
        return "Asisten{" + "kelas=" + kelas + ", NIk=" + NIk + '}';
    }
            
    
}
