package org.scaler.splitwisesept23morning.strategies;

import org.scaler.splitwisesept23morning.models.Expense;
import org.scaler.splitwisesept23morning.models.Transaction;
import org.scaler.splitwisesept23morning.models.User;

import java.util.HashMap;
import java.util.List;

public interface SettleUpStrategy {
    List<Transaction> settleUp(List<Expense> expenses);

    static HashMap<User, Integer> findNetAmount(List<Expense>){
        return null;
    }
}
