package com.contracts.database.contributions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 9/17/2020
 **/

public interface ContributionsRepository extends JpaRepository<ContributionsRatesEntity, Long> {
    List<ContributionsRatesEntity> findAllById(Long id);
}
