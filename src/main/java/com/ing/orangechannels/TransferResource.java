package com.ing.orangechannels;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ing.orangechannels.model.Transfer;
import com.ing.orangechannels.model.User;
import com.ing.orangechannels.repository.TransferRepository;
import com.ing.orangechannels.repository.TransferRepositoryStub;

@Path("transfers") // http://localhost:8080/tip-rest/webapi/transfers
public class TransferResource {

	private TransferRepository transferRepository = new TransferRepositoryStub();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Transfer> getAllTransfers() {
		return transferRepository.findAllTansfers();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{transferId}") // http://localhost:8080/tip-rest/webapi/transfers/1234
	public Transfer getTransfer(@PathParam("transferID") String transferId) {

		return transferRepository.findTransfer(transferId);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{transferId}/user") // http://localhost:8080/tip-rest/webapi/transfers/1234/user
	public User getTransferUser(@PathParam("transferID") String transferId) {
		return transferRepository.findTransfer(transferId).getUser();
	}
}
