package com.pegadaian.domain;

import java.math.BigDecimal;
import java.util.Date;


public class Cekharga {
    
    private Date tanggal;
    private BigDecimal harga;

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
    
    
}
