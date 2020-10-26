package com.contracts.database.calculations.pensionContribution;

import com.contracts.database.calculations.ContributionsCalculation;
import com.contracts.database.contributions.ContributionsRatesEntity;
import com.contracts.database.contributions.ContributionsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 10/24/2020
 **/

public class PensionContribution implements ContributionsCalculation {
    @Autowired
    private final ContributionsRepository contributionsRepository;

    public PensionContribution(ContributionsRepository contributionsRepository) {
        this.contributionsRepository = contributionsRepository;
    }

    @Override
    public double calculateContribution() {
        Optional<ContributionsRatesEntity> contributionRate = contributionsRepository.findById(1L);
        if (!contributionRate.isPresent()) {
            return 0;
        }

        ContributionsRatesEntity contributionsRatesEntity = contributionRate.get();
        return 2600 * contributionsRatesEntity.getPensionContribution();
    }
}
