package com.contracts.service;

import com.contracts.database.contributions.ContributionsRatesEntity;
import com.contracts.database.contributions.ContributionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 10/7/2020
 **/

@Service
public class ContributionsService {

    @Autowired
    private final ContributionsRepository contributionsRepository;

    public ContributionsService(ContributionsRepository contributionsRepository) {
        this.contributionsRepository = contributionsRepository;
    }

    @PostConstruct
    public void loadData() {
        List<Integer> taxDeductibleCost = new ArrayList<>();
        taxDeductibleCost.add(250);
        taxDeductibleCost.add(300);
        List<Float> incomeTax = new ArrayList<>();
        incomeTax.add(17f);
        incomeTax.add(32f);

        ContributionsRatesEntity contributionsRatesEntity = new ContributionsRatesEntity();
        contributionsRatesEntity.setHealthContribution(7.75f);
        contributionsRatesEntity.setHealthInsuranceContribution(9f);
        contributionsRatesEntity.setPensionContribution(9.76f);
        contributionsRatesEntity.setRetirementPensionContribution(1.5f);
        contributionsRatesEntity.setSicknessContribution(2.45f);
        contributionsRatesEntity.setTaxDeductibleCost(taxDeductibleCost);
        contributionsRatesEntity.setIncomeTax(incomeTax);
        contributionsRatesEntity.setTaxFreeAllowance(43.76f);

        contributionsRepository.save(contributionsRatesEntity);
    }
}
