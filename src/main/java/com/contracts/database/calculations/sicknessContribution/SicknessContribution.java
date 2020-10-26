package com.contracts.database.calculations.sicknessContribution;

import com.contracts.database.calculations.ContributionsCalculation;
import com.contracts.database.contributions.ContributionsRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 10/24/2020
 **/

public class SicknessContribution implements ContributionsCalculation {
    @Autowired
    private final ContributionsRepository contributionsRepository;

    public SicknessContribution(ContributionsRepository contributionsRepository) {
        this.contributionsRepository = contributionsRepository;
    }

    @Override
    public double calculateContribution() {
        return 0;
    }
}
