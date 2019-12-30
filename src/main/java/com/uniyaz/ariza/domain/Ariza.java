package com.uniyaz.ariza.domain;
import com.uniyaz.ariza.common.BaseDomain;
import com.uniyaz.ariza.domain.enumPackage.EnumArizaDurum;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="ARIZA")
public class Ariza extends BaseDomain {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(length = 100)
    private String musteriIsim;

    @Column(length = 100)
    private String ariza;

    @Column(length = 100)
    private String arizaAciklama;

    @Temporal(TemporalType.TIMESTAMP)
    private Date kayitTarih;


    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private EnumArizaDurum enumArizaDurum;

    @Override
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
