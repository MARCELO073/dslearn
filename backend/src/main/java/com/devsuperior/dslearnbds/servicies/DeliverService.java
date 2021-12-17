package com.devsuperior.dslearnbds.servicies;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.repositories.DeliverRepository;

@Service
public class DeliverService implements Serializable {
	private static final long serialVersionUID = 1L;


	@Autowired
	private DeliverRepository repository;
	
	@Transactional
	public void saveRevision(Long id, DeliverRevisionDTO dto) {
		
		Deliver deliver = repository.getOne(id);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrentCount(dto.getCorrectCount());
		repository.save(deliver);
	}
}
