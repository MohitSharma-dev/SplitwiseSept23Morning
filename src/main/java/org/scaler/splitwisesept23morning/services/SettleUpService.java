package org.scaler.splitwisesept23morning.services;

import org.scaler.splitwisesept23morning.models.Expense;
import org.scaler.splitwisesept23morning.models.Group;
import org.scaler.splitwisesept23morning.models.Transaction;
import org.scaler.splitwisesept23morning.repositories.GroupRepository;
import org.scaler.splitwisesept23morning.strategies.GeneralSettleUpStrategy;
import org.scaler.splitwisesept23morning.strategies.SettleUpStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SettleUpService {
    private GroupRepository groupRepository;
    private SettleUpStrategy settleUpStrategy;

    @Autowired
    SettleUpService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
        this.settleUpStrategy = new GeneralSettleUpStrategy();
    }

    public List<Transaction> settleUpGroup(Long groupId) {
        // 1. Get the group
        Optional<Group> groupOptional = groupRepository.findById(groupId);
        if(groupOptional.isEmpty()){
            throw new RuntimeException("Group not found");
        }
        Group group = groupOptional.get();
        List<Expense> expenses = group.getExpenses();
         // 2. Get all of the expense corresponding to the group
        // 3. call the algo and pass expenses to get the transactions
        return settleUpStrategy.settleUp(expenses);
    }
}
