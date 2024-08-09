package org.scaler.splitwisesept23morning.controllers;

import org.scaler.splitwisesept23morning.dtos.ResponseStatus;
import org.scaler.splitwisesept23morning.dtos.SettleUpGroupRequestDTO;
import org.scaler.splitwisesept23morning.dtos.SettleUpGroupResponseDTO;
import org.scaler.splitwisesept23morning.models.Transaction;
import org.scaler.splitwisesept23morning.services.SettleUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SettleUpController {
    @Autowired
    private SettleUpService settleUpService;
    public SettleUpGroupResponseDTO settleUpGroup(SettleUpGroupRequestDTO request){
        SettleUpGroupResponseDTO response = new SettleUpGroupResponseDTO();
        try {
            List<Transaction> transactionList = settleUpService.settleUpGroup(request.getGroupId());
            response.setTransactions(transactionList);
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setMessage("Transactions successfully generated");
        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage(ex.getMessage());
        }
        return response;
    }
}
