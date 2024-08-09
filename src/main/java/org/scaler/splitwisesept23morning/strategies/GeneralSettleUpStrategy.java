package org.scaler.splitwisesept23morning.strategies;

import org.scaler.splitwisesept23morning.models.Expense;
import org.scaler.splitwisesept23morning.models.Transaction;

import java.util.List;

public class GeneralSettleUpStrategy implements SettleUpStrategy {
    @Override
    public List<Transaction> settleUp(List<Expense> expenses) {
        return List.of();
    }
}
