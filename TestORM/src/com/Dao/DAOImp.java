package com.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.models.LoanApplication;

@Component
public class DAOImp implements DAO {

	@PersistenceContext
	private EntityManager em;

	public void persist(LoanApplication la) {
		em.persist(la);
	}

	public void updaid(LoanApplication la) {
		LoanApplication laa = (LoanApplication) em.createQuery("select e from LoanApplication e where e.lnap_id=:id")
				.setParameter("id", la.getLnap_id()).getSingleResult();
		laa.setLnap_status(la.getLnap_status());
		laa.setLnap_conclusion_remarks(la.getLnap_conclusion_remarks());
		laa.setLnap_nom_requested(la.getLnap_nom_requested());
		laa.setLnap_processed_Date(la.getLnap_processed_Date().toString());
		laa.setLnap_processed_user(la.getLnap_processed_user());
		System.out.println(la.getLnap_processed_user());
	}

	@SuppressWarnings("unchecked")
	public List<LoanApplication> getAllLoanApplicants() {
		return em.createQuery("SELECT la FROM LoanApplication la").getResultList();
	}

}
