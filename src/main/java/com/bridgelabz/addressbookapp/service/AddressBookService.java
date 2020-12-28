package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
/*@Service annotation is a specialization of @Component annotation. 
 *Its used with classes that provide some business functionalities. 
 */
@Service
public class AddressBookService implements IAddressBookService {

	private List<AddressBookData> addressBookDataList = new ArrayList<>();

	@Override
	public List<AddressBookData> getAddressBookData() {
		// TODO Auto-generated method stub
		return addressBookDataList;
	}

	@Override
	public AddressBookData getAddressBookDatById(int id) {
		// TODO Auto-generated method stub
		return addressBookDataList.get(id - 1);
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData((addressBookDataList.size() + 1), addressBookDTO);
		addressBookDataList.add(addressBookData);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressBookData = this.getAddressBookDatById(id);
		addressBookData.setName(addressBookDTO.name);
		addressBookData.setAddress(addressBookDTO.address);
		addressBookDataList.set((id - 1), addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookData(int id) {
		// TODO Auto-generated method stub
		addressBookDataList.remove(id - 1);
	}
}
