package com.toys.toytroc.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;


public interface IToysRepository extends JpaRepository<ToyEntity, UUID> {


    List<ToyEntity> findByStatus(ToyStatusEnum toyStatus);
}
