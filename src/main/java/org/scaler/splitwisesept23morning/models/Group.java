package org.scaler.splitwisesept23morning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity(name = "user_groups")
public class Group extends BaseModel{
    private String name;
    @ManyToMany
    private List<User> members;
    @ManyToOne
    private User admin;
    @OneToMany(mappedBy = "group")
    private List<Expense> expenses;
}
