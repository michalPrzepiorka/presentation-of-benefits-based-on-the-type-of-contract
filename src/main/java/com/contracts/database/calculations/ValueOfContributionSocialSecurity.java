package com.contracts.database.calculations;

import com.contracts.database.contributions.ContributionsRatesEntity;
import com.contracts.database.contributions.ContributionsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 10/21/2020
 **/

public class ValueOfContributionSocialSecurity implements ContributionsCalculation {

    @Autowired
    private final ContributionsRepository contributionsRepository;

    public ValueOfContributionSocialSecurity(ContributionsRepository contributionsRepository) {
        this.contributionsRepository = contributionsRepository;
    }

    @Override
    public double calculateContribution() {
        Optional<ContributionsRatesEntity> contributionRate = contributionsRepository.findById(1L);
        if (!contributionRate.isPresent()) {
            return 0;
        }

        ContributionsRatesEntity contributionsRatesEntity = contributionRate.get();
        return 0;
    }
}
