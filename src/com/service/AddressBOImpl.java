package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Address;
import com.bean.PersonalVO;
import com.dao.AddressDAO;

public class AddressBOImpl implements AddressBO {
	@Autowired
	private AddressDAO addressDAO=null;

	@Override
	public void insertAddress(PersonalVO pb, Address address) throws Exception {
		addressDAO.insertAddreess(pb, address);
	}
	
}
