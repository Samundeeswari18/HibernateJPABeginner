package com.Samundeeswari.Velusamy.controller;

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
//
        UserDBServices.deleteUser(session,4);

        factory.close();
        session.close();
    }
}

