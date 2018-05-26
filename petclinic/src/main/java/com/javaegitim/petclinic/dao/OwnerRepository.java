package com.javaegitim.petclinic.dao;

import java.util.List;

import com.javaegitim.petclinic.model.Owner;

public interface OwnerRepository {
	List<Owner> findAll();
	Owner findById(Long id);
	List<Owner> findByLastName(String lastName);
	void create(Owner owner);
	Owner update(Owner owner);
	void delete(Long id);
}
