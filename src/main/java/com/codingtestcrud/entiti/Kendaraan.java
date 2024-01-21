package com.codingtestcrud.entiti;

public class Kendaraan {
    private Long id;
    private String noRegistrasi;
    private String namaPemilik;
    private String merek;
    private Integer tahun;
    private Integer kapasitasSilinder;
    private String warna;
    private String alamat;
    private String bahanBakar;

    public Kendaraan(){

    }
    
    public Kendaraan(Long id, String noRegistrasi, String namaPemilik, String alamat, String merek, Integer tahun,
            Integer kapasitasSilinder, String warna, String bahanBakar) {
        this.id = id;
        this.noRegistrasi = noRegistrasi;
        this.namaPemilik = namaPemilik;
        this.alamat = alamat;
        this.merek = merek;
        this.tahun = tahun;
        this.kapasitasSilinder = kapasitasSilinder;
        this.warna = warna;
        this.bahanBakar = bahanBakar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long long1) {
        this.id = long1;
    }

    public String getNoRegistrasi() {
        return noRegistrasi;
    }

    public void setNoRegistrasi(String noRegistrasi) {
        this.noRegistrasi = noRegistrasi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    public Integer getKapasitasSilinder() {
        return kapasitasSilinder;
    }

    public void setKapasitasSilinder(Integer kapasitasSilinder) {
        this.kapasitasSilinder = kapasitasSilinder;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

   
    

}
