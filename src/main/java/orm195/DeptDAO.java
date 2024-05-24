package orm195;

import java.util.List;



import org.springframework.stereotype.Service;



import orm195.Dept;



import jakarta.persistence.EntityManager;

import jakarta.persistence.PersistenceContext;



@Service

public class DeptDAO {



	@PersistenceContext

	private EntityManager em;



	public void persist(Dept dpt) {

		em.persist(dpt);

	}



	public List<Dept> findAll() {

		return em.createQuery("SELECT d FROM Dept d").getResultList();

	}



}
