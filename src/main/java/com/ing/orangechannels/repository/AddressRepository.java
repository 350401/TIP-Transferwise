package com.ing.orangechannels.repository;

import java.util.List;

import com.ing.orangechannels.model.Address;

public interface AddressRepository {

	List<Address> findAllAddresses();

	Address findAddress(String addressId);

}