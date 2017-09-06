package com.ing.orangechannels.repository;

import java.util.ArrayList;
import java.util.List;

import com.ing.orangechannels.model.Address;
import com.ing.orangechannels.model.AddressDetailsVO;
import com.ing.orangechannels.model.AddressRequestVO;

public class AddressRepositoryStub implements AddressRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ing.orangechannels.repository.addressRepository#findAllAddresses()
	 */
	@Override
	public List<Address> findAllAddresses() {

		List<Address> addresses = new ArrayList<Address>();

		Address address = new Address();

		address.setId("5678");
		AddressRequestVO addressRequestVO = new AddressRequestVO();
		addressRequestVO.setProfile(56781);
		AddressDetailsVO addressDetails = new AddressDetailsVO();

		addressDetails.setFirstLine("B7-High Class Residency");
		addressDetails.setOccupationl("Service");
		addressDetails.setCity("Pune");
		addressDetails.setState("MS");
		addressDetails.setCountry("India");
		addressDetails.setPostCode("440011");

		addressRequestVO.setAddressDetails(addressDetails);
		address.setAddressRequestVO(addressRequestVO);

		addresses.add(address);

		return addresses;
	}

	@Override
	public Address findAddress(String addressId) {
		Address address = new Address();

		address.setId("56782");
		AddressRequestVO addressRequestVO = new AddressRequestVO();
		addressRequestVO.setProfile(56781);
		AddressDetailsVO addressDetails = new AddressDetailsVO();

		addressDetails.setFirstLine("Cognizant Technology Solutions");
		addressDetails.setOccupationl("Service");
		addressDetails.setCity("Pune");
		addressDetails.setState("MS");
		addressDetails.setCountry("India");
		addressDetails.setPostCode("440011");

		addressRequestVO.setAddressDetails(addressDetails);
		address.setAddressRequestVO(addressRequestVO);


		return address;
	}
}
