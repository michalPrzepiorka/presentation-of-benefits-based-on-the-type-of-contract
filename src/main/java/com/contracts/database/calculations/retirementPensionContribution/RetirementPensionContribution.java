package com.contracts.database.calculations.retirementPensionContribution;

import com.contracts.database.calculations.ContributionsCalculation;
import com.contracts.database.contributions.ContributionsRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 10/24/2020
 **/

public class RetirementPensionContribution implements ContributionsCalculation {
    @Autowired
    private final ContributionsRepository contributionsRepository;

    public RetirementPensionContribution(ContributionsRepository contributionsRepository) {
        this.contributionsRepository = contributionsRepository;
    }

    @Override
    public double calculateContribution() {
        return 0;
    }
}
