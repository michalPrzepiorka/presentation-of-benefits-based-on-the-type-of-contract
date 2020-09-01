package com.contracts;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Y510p
 * @project types-of-contracts-employment
 * @date 9/1/2020
 **/

@Component
@FxmlView("main-scene.fxml")
public class FxController {

    private ContractService contractService;

    @Autowired
    public FxController(ContractService contractService) {
        this.contractService = contractService;
    }

    @FXML
    private Label contractLabel;

    public void loadContractEmployment(ActionEvent actionEvent) {
        this.contractLabel.setText(contractService.getContractService());
    }
}
