package com.greatlearning.crm.service;

import java.util.List;

import com.greatlearning.crm.entity.Crm;

public interface CrmService {
	public List<Crm> findAll();

	public Crm findById(int theId);

	public void save(Crm theCrm);

	public void deleteById(int theId);

	

}
