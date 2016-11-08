package com.service;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Address;
import com.bean.Bank;
import com.bean.PersonalVO;
import com.dao.PersonalDAO;

@Service("personalService")
@Transactional
public class PersonalServiceImpl implements PersonalService {
	
	private PersonalDAO personalDAO=null;
	
	
	public void setPersonalDAO(PersonalDAO personalDAO) {
		this.personalDAO = personalDAO;
	}


	@Override
	public void insertPersonalDetail(PersonalVO personalVO, Address addressVO, Bank bankVO) throws Exception {
		personalDAO.insertPersonalDetail(personalVO, addressVO, bankVO);

	}
	
		
}

	
	

