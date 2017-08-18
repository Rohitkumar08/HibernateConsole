package beans;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StoreData {

	public static void main(String args[])
	{
		
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
//		Seeker s1=new Seeker();
//		s1.setNoOfChild(1);
//		s1.setSpouseName("wdcjlhcnl");
//		
//		Employee emp= new Employee();
//		emp.setFirstName("Ritesh");
//		emp.setLastName("varma");
//		
//		emp.setSeeker(s1);
//		s1.setEmp(emp);
//		session.save(s1);
//		Transaction t1= session.beginTransaction();
//		t1.commit();

		String hql="from Employee";
	
		Query q= session.createQuery(hql);
		List<Employee> lst = q.list();
		for(Employee emp:lst){
			
			System.out.println(emp.getFirstName()+"_"+emp.getLastName());
		}
		
//		Employee emp = (Employee)q.uniqueResult();
//		
//		System.out.println(emp.getFirstName()+ "****"+ emp.getLastName());
//		
//		sf.close();
//		

		
//		Employee e1=new Employee();  
//		    e1.setId(117);  
//		    e1.setFirstName("piyush");  
//		    e1.setLastName("jaiswal");  
		    //object state is transient so GC can anytime collect it
		   
//		    
//		 Student std1= new Student();
//		 std1.setId(113);
//		 std1.setName("Sohit");
//	
//		s.save(e1);
//		 s.save(std1);
//		//emp state is persistent
//		 
//		 
//		Transaction t1 = s.beginTransaction();
//		t1.commit();
//		//object will be moved to the db
//		
//		s.evict(e1);
//		s.evict(std1);
		//object will be deleted from the persistant so GC can collect the obj
	System.out.println("successfully saved");  	
		
	
	}
	
}
