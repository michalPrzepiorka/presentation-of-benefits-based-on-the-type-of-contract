package com.contracts.api.controlers;

import com.contracts.database.contributions.ContributionsRatesEntity;
import com.contracts.database.contributions.ContributionsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 10/25/2020
 **/

@RequestMapping("benefits")
@RestController
public class EndpointController {
    private final ContributionsRepository contributionsRepository;

    public EndpointController(ContributionsRepository contributionsRepository) {
        this.contributionsRepository = contributionsRepository;
    }

    @GetMapping(value = "contributions-rates")
    public Optional<ContributionsRatesEntity> findAllContributionRates(){
        return contributionsRepository.findById(1L);
    }
}
