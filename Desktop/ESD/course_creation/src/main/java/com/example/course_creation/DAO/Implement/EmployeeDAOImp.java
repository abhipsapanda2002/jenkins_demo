package com.example.course_creation.DAO.Implement;

import com.example.course_creation.DAO.EmployeeDAO;
import com.example.course_creation.Entity.employee;
import com.example.course_creation.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EmployeeDAOImp implements EmployeeDAO {
    employee emp=new employee();
    @Override
    public boolean addEmployee(employee emp) {
        try(Session session= HibernateSessionUtil.getSession()) {
            Transaction transaction=session.beginTransaction();
            session.persist(emp);
            transaction.commit();
            return true;
        }
        catch (HibernateException exception){
            System.out.println("Hibernate Exception");
            System.out.println(exception.getLocalizedMessage());
            return false;
        }
    }
    @Override
    public boolean verifyEmployee(employee emp) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            Query q = session.createQuery("from employee where department=:dept and email=:eid and password =:passwd");
            q.setParameter("dept", "Admin");
            q.setParameter("eid", emp.getEmployeeId());
            q.setParameter("passwd",emp.getPassword());
            if(q.getResultList().isEmpty()) {
                System.out.println(" Employee not login here");
                return false;
            }
            transaction.commit();
            return true;
        }
        catch (HibernateException exception) {
            System.out.println("Hibernate Exception");
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }

}
