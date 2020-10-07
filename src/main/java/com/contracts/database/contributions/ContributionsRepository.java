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

    @Modifying
    @Transactional
    @Query(
            nativeQuery = true,
            value = "insert into contributions (id, " +
                    "health_contribution," +
                    "health_insurance_contribution," +
                    "pension_contribution," +
                    "retirement_pension_contribution," +
                    "sickness_contribution," +
                    "health_insurance_contribution," +
                    "tax_deductible_cost," +
                    "income_tax," +
                    "tax_free_allowance," +
                    "health_contribution) values (1, 1, 1, 1, 1, 1, 1, 1, 1 ,1, 1)"
    )
    void addFinalValuesOfContributions(Long id, float health_contribution, float health_insurance_contribution);
}
