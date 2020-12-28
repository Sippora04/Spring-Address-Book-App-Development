package com.bridgelabz.addressbookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;

@RestController
@RequestMapping(value = "/addressbook")
public class AddressBookController {

	@Autowired
	private IAddressBookService addressBookService;

	@GetMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		List<AddressBookData> addressbookDataList = null;
		addressbookDataList = addressBookService.getAddressBookData();
		ResponseDTO responseDTO = new ResponseDTO("Get Call Successfull", addressbookDataList);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("id") int id) {
		AddressBookData addressbookData = null;
		addressbookData = addressBookService.getAddressBookDatById(id);
		ResponseDTO responseDTO = new ResponseDTO("Get Call for ID Successfull", addressbookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressbookData = null;
		addressbookData = addressBookService.createAddressBookData(addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Created AddressBook Data Successfully", addressbookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("id") int id,
			@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressbookData = null;
		addressbookData = addressBookService.updateAddressBookData(id, addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated AddressBook Data Successfully", addressbookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("id") int id) {
		ResponseDTO responseDTO = new ResponseDTO("Deleted AddressBook Data Successfully", "Deleted id : " + id);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}