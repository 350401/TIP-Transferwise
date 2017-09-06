package com.ing.orangechannels.repository;

import java.util.ArrayList;
import java.util.List;

import com.ing.orangechannels.model.Transfer;
import com.ing.orangechannels.model.TransferRequestDetails;
import com.ing.orangechannels.model.TransferRequestVO;
import com.ing.orangechannels.model.TransferResponseVO;
import com.ing.orangechannels.model.User;

public class TransferRepositoryStub implements TransferRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ing.orangechannels.repository.TransferRepository#findAllTansfers()
	 */
	@Override
	public List<Transfer> findAllTansfers() {

		List<Transfer> transfers = new ArrayList<Transfer>();

		Transfer transfer1 = new Transfer();

		TransferRequestVO transferRequestVO = new TransferRequestVO();

		transferRequestVO.setCustomerTransactionId("");
		transferRequestVO.setQuoteId(0001);
		transferRequestVO.setTargetAccount(0002);

		TransferRequestDetails transferRequestDetails = new TransferRequestDetails();

		transferRequestDetails.setReference("abc");
		transferRequestDetails.setSourceOfFunds("abc");
		transferRequestDetails.setSourceOfFundsOther("abc_other");

		transferRequestVO.setTransferDetails(transferRequestDetails);
		TransferResponseVO transferResponseVO = new TransferResponseVO();

		transfer1.setTransferRequestVO(transferRequestVO);
		transfer1.setTransferResponseVO(transferResponseVO);

		/** Transfer response VO details to come here */

		transfers.add(transfer1);

		return transfers;
	}

	@Override
	public Transfer findTransfer(String transferId) {

		Transfer transfer1 = new Transfer();

		transfer1.setId("1234");
		TransferRequestVO transferRequestVO = new TransferRequestVO();

		transferRequestVO.setCustomerTransactionId("");
		transferRequestVO.setQuoteId(0001);
		transferRequestVO.setTargetAccount(0002);

		TransferRequestDetails transferRequestDetails = new TransferRequestDetails();

		transferRequestDetails.setReference("Funds_for_Home");
		transferRequestDetails.setSourceOfFunds("Abhishek");
		transferRequestDetails.setSourceOfFundsOther("Abhishek_other");

		transferRequestVO.setTransferDetails(transferRequestDetails);
		TransferResponseVO transferResponseVO = new TransferResponseVO();

		transfer1.setTransferRequestVO(transferRequestVO);
		transfer1.setTransferResponseVO(transferResponseVO);

		User user = new User();
		
		user.setFirstName("Abhishek");
		user.setLastName("Junnarkar");
		
		
		transfer1.setUser(user);;
		
		return transfer1;
	}
}
