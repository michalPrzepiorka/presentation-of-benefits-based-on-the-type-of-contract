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
    public void loadData(){
        List<Integer> taxDeductibleCost= new ArrayList<>();
        taxDeductibleCost.add(1);
        taxDeductibleCost.add(2);
        List<Float> incomeTax = new ArrayList<>();
        incomeTax.add(1f);
        incomeTax.add(2f);

        ContributionsRatesEntity contributionsRatesEntity = new ContributionsRatesEntity();
        contributionsRatesEntity.setHealthContribution(1);
        contributionsRatesEntity.setHealthInsuranceContribution(1);
        contributionsRatesEntity.setPensionContribution(1);
        contributionsRatesEntity.setRetirementPensionContribution(1);
        contributionsRatesEntity.setSicknessContribution(1);
        contributionsRatesEntity.setTaxDeductibleCost(taxDeductibleCost);
        contributionsRatesEntity.setIncomeTax(incomeTax);
        contributionsRatesEntity.setTaxFreeAllowance(1);
        contributionsRatesEntity.setHealthContribution(1);

        contributionsRepository.save(contributionsRatesEntity);
    }


}
