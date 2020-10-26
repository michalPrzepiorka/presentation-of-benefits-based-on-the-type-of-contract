package com.contracts.database.calculations;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 10/20/2020
 **/

public interface ContributionsCalculation {
    double calculateContribution();
}
