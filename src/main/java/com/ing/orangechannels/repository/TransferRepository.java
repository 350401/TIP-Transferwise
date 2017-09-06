package com.ing.orangechannels.repository;

import java.util.List;

import com.ing.orangechannels.model.Transfer;

public interface TransferRepository {

	List<Transfer> findAllTansfers();

	Transfer findTransfer(String transferId);

}