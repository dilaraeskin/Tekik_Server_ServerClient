package com.uniyaz.ariza.service.dto;

import com.uniyaz.ariza.domain.enumPackage.EnumArizaDurum;

import java.util.Date;

public class ArizaDto {

    private Long id;
    private String musteriIsim;
    private String ariza;
    private String arizaAciklama;
    private Date kayitTarih;
    private EnumArizaDurum enumArizaDurum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMusteriIsim() {
        return musteriIsim;
    }

    public void setMusteriIsim(String musteriIsim) {
        this.musteriIsim = musteriIsim;
    }

    public String getAriza() {
        return ariza;
    }

    public void setAriza(String ariza) {
        this.ariza = ariza;
    }

    public String getArizaAciklama() {
        return arizaAciklama;
    }

    public void setArizaAciklama(String arizaAciklama) {
        this.arizaAciklama = arizaAciklama;
    }

    public Date getKayitTarih() {
        return kayitTarih;
    }

    public void setKayitTarih(Date kayitTarih) {
        this.kayitTarih = kayitTarih;
    }

    public EnumArizaDurum getEnumArizaDurum() {
        return enumArizaDurum;
    }

    public void setEnumArizaDurum(EnumArizaDurum enumArizaDurum) {
        this.enumArizaDurum = enumArizaDurum;
    }
}
