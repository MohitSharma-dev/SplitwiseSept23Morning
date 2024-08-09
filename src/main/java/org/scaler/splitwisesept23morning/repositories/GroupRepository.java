package org.scaler.splitwisesept23morning.repositories;

import org.scaler.splitwisesept23morning.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}
