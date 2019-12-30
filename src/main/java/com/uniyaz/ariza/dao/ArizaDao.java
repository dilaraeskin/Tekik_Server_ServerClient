package com.uniyaz.ariza.dao;


import com.uniyaz.ariza.domain.Ariza;
import com.uniyaz.ariza.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class ArizaDao {

    public Ariza saveAriza(Ariza ariza){

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try (Session session = sessionFactory.openSession();) {
            session.getTransaction().begin();

            ariza= (Ariza) session.merge(ariza);

            session.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return ariza;
    }

    public List<Ariza> findAllAriza() {
        List<Ariza> arizaList = null;

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try (Session session = sessionFactory.openSession();) {
            Query query = session.createQuery("Select ariza From Ariza ariza");

            arizaList = query.list();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return arizaList;
    }

    public Ariza findAllByMusteriAdi(String musteriAdi) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession();) {
            String hql = "Select ariza From Ariza ariza Where ariza.musteriIsim = :musteriIsim";
            Query query = session.createQuery(hql);
            query.setParameter("musteriAdi", musteriAdi);
            return  (Ariza) query.uniqueResult();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
