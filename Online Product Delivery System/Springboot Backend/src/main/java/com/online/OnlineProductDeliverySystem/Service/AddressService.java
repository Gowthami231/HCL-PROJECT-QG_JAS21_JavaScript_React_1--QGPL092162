package com.online.OnlineProductDeliverySystem.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.OnlineProductDeliverySystem.Entity.Address;
import com.online.OnlineProductDeliverySystem.Repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepo;
	
	public Address addAddress(Address address) {
		return addressRepo.save(address);
	}
	
	public Address updateAddress(Address address) {
		return addressRepo.save(address);
	}
	public void removeAddress(Integer id) {
		addressRepo.deleteById(id);
	}
	public List<Address> viewAllAddress(){
		return addressRepo.findAll();
	}
	@Transactional
	public Address viewAddress(Integer id) {
		Optional<Address> address =  addressRepo.findById(id);
		return address.get();
	}
}