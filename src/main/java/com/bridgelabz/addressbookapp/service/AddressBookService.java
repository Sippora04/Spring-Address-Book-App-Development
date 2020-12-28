package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<AddressBookData> getAddressBookData() {
		// TODO Auto-generated method stub
		List<AddressBookData> addressBookDataList = new ArrayList<>();
		addressBookDataList.add(new AddressBookData(1, new AddressBookDTO("Sippora", "APJ Road")));
		return addressBookDataList;
	}

	@Override
	public AddressBookData getAddressBookDatById(int id) {
		// TODO Auto-generated method stub
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(id, new AddressBookDTO("Sippora", "APJ Road"));
		return addressBookData;
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(1, addressBookDTO);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(id, addressBookDTO);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookData(int id) {
		// TODO Auto-generated method stub
	}

}
