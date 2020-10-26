package com.contracts.database.contributions;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 9/17/2020
 **/

public interface ContributionsRepository extends JpaRepository<ContributionsRatesEntity, Long> {
//    @Query(value = "select * from CONTRIBUTIONS where ID = :id", nativeQuery = true)
//    List<ContributionsRatesEntity> findAllById(Long id);
//    ContributionsRatesEntity findById(Long id);
}
