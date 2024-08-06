package com.screemplay.practicauno.definitions;

import com.screemplay.practicauno.Steps.RegistroWebAutomationDemoSiteStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class WebAutomationDemoSiteValidationDefinitions {

    @Steps
    RegistroWebAutomationDemoSiteStep loginWebAutomationDemoSiteStep;

    @Given("Carlos wants to access the Web Automation Demo Site")
    public void carlos_wants_to_access_the_web_automation_demo_site() {
    loginWebAutomationDemoSiteStep.WebAutomationDemoSite();

    }
    @When("he registers on the page")
    public void he_registers_on_the_page(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();
        for(int i=1; i<cells.size(); i++){
            loginWebAutomationDemoSiteStep.WebAutomationDemoSiteIngreso(cells, i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){

            }
        }
    }

    @Then("he verifies that the screen with the text Double Click on Edit Icon to EDIT the Table Row loads")
    public void he_verifies_that_the_screen_with_the_text_double_click_on_edit_icon_to_edit_the_table_row_loads() {

    }
}
