package org.example;

import bean.Laptop;
import bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Student.class);
        cfg=cfg.addAnnotatedClass(Laptop.class);
        SessionFactory factory= cfg.buildSessionFactory();
        Session ses= factory.openSession();
        Transaction tx=ses.beginTransaction();
        Student s1=new Student();
        s1.setsName("SHUBHAM");
        s1.setMarks(79);

        Laptop l1=new Laptop();
        l1.setlName("LENOVO");
        l1.setStud_ref(s1);

        ses.save(s1);
        ses.save(l1);
        tx.commit();


    }
}