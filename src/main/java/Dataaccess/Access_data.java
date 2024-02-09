package Dataaccess;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Data.Patient_Data;

public class Access_data {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ServletHMS");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void Insert(Patient_Data Access) {
		et.begin();
		em.persist(Access);
		et.commit();
	}

	public Patient_Data logincrdentieal(long uname)

	{
		Patient_Data a = em.find(Patient_Data.class, uname);
		if (a != null) {
			return a;
		} else {
			return null;
		}

	}

}
