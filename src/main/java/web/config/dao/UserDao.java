//package web.config.dao;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//import web.model.User;
//
//import java.util.List;
//
//@Component
//public class UserDao {
//
//    private final SessionFactory sessionFactory;
//
//    public UserDao(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Transactional(readOnly = true)
//    public List<User> usersList(){
//        Session session = sessionFactory.getCurrentSession();
//        return session.createQuery("select user from User user", User.class).getResultList();
//    }
//}
