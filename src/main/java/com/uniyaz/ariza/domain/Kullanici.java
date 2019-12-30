package com.uniyaz.ariza.domain;

import com.uniyaz.ariza.domain.enumPackage.EnumKullaniciYetki;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name="KULLANICI")
public class Kullanici {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(length = 100)
    private String username;

    @Column(length = 100)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(length = 5)
    private EnumKullaniciYetki enumKullaniciYetki;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumKullaniciYetki getEnumKullaniciYetki() {
        return enumKullaniciYetki;
    }

    public void setEnumKullaniciYetki(EnumKullaniciYetki enumKullaniciYetki) {
        this.enumKullaniciYetki = enumKullaniciYetki;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kullanici kullanici = (Kullanici) o;
        return Objects.equals(id, kullanici.id) &&
                Objects.equals(username, kullanici.username) &&
                Objects.equals(password, kullanici.password) &&
                enumKullaniciYetki == kullanici.enumKullaniciYetki;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, enumKullaniciYetki);
    }
}
