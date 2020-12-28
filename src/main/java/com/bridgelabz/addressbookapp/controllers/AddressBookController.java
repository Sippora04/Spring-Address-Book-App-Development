package com.bridgelabz.addressbookapp.controllers;

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

@RestController
@RequestMapping(value = "/addressbook")
public class AddressBookController {

	@GetMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getAddressBookContactData() {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(1, new AddressBookDTO("Sippora", "APJ Road"));
		ResponseDTO responseDTO = new ResponseDTO("Get Call Successfull", addressbookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("id") int id) {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(1, new AddressBookDTO("Surbhi", "APJ Road"));
		ResponseDTO responseDTO = new ResponseDTO("Get Call for ID Successfull", addressbookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(1, addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Data Successfully", addressbookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(1, addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Data Successfully", addressbookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("id") int id) {
		ResponseDTO responseDTO = new ResponseDTO("Deleted Employee Payroll Data Successfully", "Deleted id : " + id);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}