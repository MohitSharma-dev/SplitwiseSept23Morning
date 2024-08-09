package org.scaler.splitwisesept23morning.dtos;

import lombok.Getter;
import lombok.Setter;
import org.scaler.splitwisesept23morning.models.Transaction;

import java.util.List;

@Getter
@Setter
public class SettleUpGroupResponseDTO {
    private List<Transaction> transactions;
    private ResponseStatus responseStatus;
    private String message;
}


// from : to : amount