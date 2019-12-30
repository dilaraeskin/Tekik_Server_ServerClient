package com.uniyaz.ariza.dao;


import com.uniyaz.ariza.domain.Kullanici;
import com.uniyaz.ariza.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class KullaniciDao {


    public List<Kullanici> findAllKullanici() {
        List<Kullanici> kullaniciList = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            String hql = "Select kullanici From Kullanici kullanici";
            Query query = session.createQuery(hql);
            kullaniciList = query.list();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return kullaniciList;
    }
}
