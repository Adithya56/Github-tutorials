package ProductsController;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            // Load Hibernate configuration from hibernate.cfg.xml
            Configuration configuration = new Configuration().configure();

            // Build the session factory
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            System.err.println("Error creating Hibernate session factory: " + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

    public static void closeSession(Session session) {
        if (session != null) {
            session.close();
        }
    }

    public static void closeSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
