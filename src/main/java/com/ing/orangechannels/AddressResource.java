package com.ing.orangechannels;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ing.orangechannels.model.Address;
import com.ing.orangechannels.model.User;
import com.ing.orangechannels.repository.AddressRepository;
import com.ing.orangechannels.repository.AddressRepositoryStub;

@Path("addresses") // http://localhost:8080/tip-rest/webapi/addresses
public class AddressResource {

	private AddressRepository addressRepository = new AddressRepositoryStub();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Address> getAllAddresses() {
		return addressRepository.findAllAddresses();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{addressId}") // http://localhost:8080/tip-rest/webapi/addresses/5678
	public Address getAddress(@PathParam("addressID") String addressId) {

		return addressRepository.findAddress(addressId);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{addressId}/user") // http://localhost:8080/tip-rest/webapi/transfers/1234/user
	public User getAddressUser(@PathParam("addressID") String addressId) {
		return addressRepository.findAddress(addressId).getUser();
	}

}
