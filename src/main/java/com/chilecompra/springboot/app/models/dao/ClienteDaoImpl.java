/*package com.chilecompra.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chilecompra.springboot.app.models.entity.Cliente;

@Repository("clienteDaoJPA") //marca la clase en el ambito de persistencia y acceso a datos
public class ClienteDaoImpl implements IClienteDao {
	
	@PersistenceContext //para inyectarlo
	private EntityManager em; //objeto que hace consultas a la clase entity no a la tablas

	@SuppressWarnings("unchecked")
	//@Transactional(readOnly = true) //tiene que ser de spring framework
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Cliente").getResultList();
	}
	
	@Override
	//@Transactional
	public void save(Cliente cliente) {
		if (cliente.getId() != null && cliente.getId() > 0) {
			em.merge(cliente); //modifica los datos, los actualiza
		} else {
			em.persist(cliente); //lo crea y lo atacha al contexto de persistencia
		}
	}

	
	@Override
	//@Transactional(readOnly = true)
	public Cliente findOne(Long id) {
		return em.find(Cliente.class, id);
	}
	
	@Override
	//@Transactional
	public void delete(Long id) {
		em.remove(findOne(id));
	}


}*/
