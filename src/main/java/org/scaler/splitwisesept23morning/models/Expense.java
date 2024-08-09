package org.scaler.splitwisesept23morning.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel{
    private String description;
    private int totalAmount;
    @OneToMany(mappedBy = "expense")
    private List<UserExpense> userExpenses;
    @ManyToOne
    private Group group;
    @ManyToOne
    private User createdBy;
    @Enumerated(EnumType.STRING)
    private ExpenseType expenseType;
}
