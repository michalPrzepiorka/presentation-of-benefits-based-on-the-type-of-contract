package com.contracts.database.contributions;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 9/12/2020
 **/

@Entity(name = "contributions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ContributionsRatesEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotNull
    private float pensionContribution;

    @Column
    @NotNull
    private float retirementPensionContribution;

    @Column
    @NotNull
    private float sicknessContribution;

    @Column
    @NotNull
    private float healthInsuranceContribution;

    @Column
    @NotNull
    @ElementCollection
    private List<Integer> taxDeductibleCost;

    @Column
    @NotNull
    @ElementCollection
    private List<Float> incomeTax;

    @Column
    @NotNull
    private float taxFreeAllowance;//43,76zł

    @Column
    @NotNull
    private float healthContribution;//7,75%

    public ContributionsRatesEntity(float pensionContribution, float retirementPensionContribution, float sicknessContribution, float healthInsuranceContribution, List<Integer> taxDeductibleCost, List<Float> incomeTax, float taxFreeAllowance, float healthContribution) {
        this.pensionContribution = pensionContribution;
        this.retirementPensionContribution = retirementPensionContribution;
        this.sicknessContribution = sicknessContribution;
        this.healthInsuranceContribution = healthInsuranceContribution;
        this.taxDeductibleCost = taxDeductibleCost;
        this.incomeTax = incomeTax;
        this.taxFreeAllowance = taxFreeAllowance;
        this.healthContribution = healthContribution;
    }
}
