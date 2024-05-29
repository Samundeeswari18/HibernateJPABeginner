package com.Samundeeswari.Velusamy.controller;

import com.Samundeeswari.Velusamy.HQLServices.HQLServices;
import com.Samundeeswari.Velusamy.model.UserDBServices;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserController {




public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

//       UserDBServices.addUser(factory,session);
//
//        UserDBServices.findUser(factory,session,3);
//
//        UserDBServices.updateUser(session,3);
        HQLServices obj = new HQLServices();

//        obj.getmaxSalaryGroupBy();
    obj.namedQueryExample(session);
//        HQLServices.findUserHql(factory, session);
//        UserDBServices.deleteUser(session,4);
//        HQLServices.getRecordById(factory,session);
//    HQLServices.getRecords(session);
//    HQLServices.getMaxSalary(session);
        factory.close();
        session.close();
    }
}

