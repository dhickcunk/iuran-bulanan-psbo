/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package white.curry.iuranbulanan.model;

/**
 *
 * @author Dicky Gusthia Suhada
 */
public class Warga {
    private String noKtp;
    private String nama;
    private char jenisKelamin;
    private String alamat;
    private int jmlAnggotaKeluarga;
    private Pembayaran pembayaran;

    public Warga() {
    }

    public Warga(String noKtp, String nama, char jenisKelamin, String alamat, int jmlAnggotaKeluarga, Pembayaran pembayaran) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.jmlAnggotaKeluarga = jmlAnggotaKeluarga;
        this.pembayaran = pembayaran;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJmlAnggotaKeluarga() {
        return jmlAnggotaKeluarga;
    }

    public void setJmlAnggotaKeluarga(int jmlAnggotaKeluarga) {
        this.jmlAnggotaKeluarga = jmlAnggotaKeluarga;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }
    
    
}
