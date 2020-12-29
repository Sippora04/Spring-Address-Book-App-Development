package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {
	private int id;
	private String name;
	private String address;
	private String phoneNumber;
	private String city;
	private String state;
	private String zip;

	public AddressBookData() {
	}

	public AddressBookData(int id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.name = addressBookDTO.name;
		this.address = addressBookDTO.address;
		this.phoneNumber = addressBookDTO.phoneNumber;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zip = addressBookDTO.zip;
	}
}
