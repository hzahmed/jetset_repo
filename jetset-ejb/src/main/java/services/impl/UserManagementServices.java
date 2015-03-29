package services.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import services.interfaces.UserManagementServicesLocal;
import services.interfaces.UserManagementServicesRemote;
import domain.User;

/**
 * Session Bean implementation class UserManagementServices
 */
@Stateless
@LocalBean
public class UserManagementServices implements UserManagementServicesRemote,
		UserManagementServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserManagementServices() {
		// TODO Auto-generated constructor stub
	}

}
