package com.screemplay.practicauno.definitions;

import com.screemplay.practicauno.Steps.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class WebAutomationDemoSiteValidationDefinitions {

    @Steps
    RegistroWebAutomationDemoSiteStep loginWebAutomationDemoSiteStep;

    @Steps
    AlertWebAutomationDemoSiteStep alertWebAutomationDemoSiteStep;

    @Steps
    VentanasWebAutomationDemoSiteStep ventanasWebAutomationDemoSiteStep;

    @Steps
    FrameWebAutomationDemoSiteStep frameWebAutomationDemoSiteStep;

    @Steps
    AcordeonWebAutomationDemoSiteStep acordeonWebAutomationDemoSiteStep;

    @Steps
    AutocompletWebAutomationDemoSiteStep autocompletWebAutomationDemoSiteStep;

    @Steps
    DateWebAutomationDemoSiteStep dateWebAutomationDemoSiteStep;

    @Steps
    SliderWebAutomationDemoSiteStep sliderWebAutomationDemoSiteStep;


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

    @When("he enters the alerts section")
    public void he_enters_the_alerts_section() throws InterruptedException {
        alertWebAutomationDemoSiteStep.Alertas();

    }

    @When("he enters the windows section")
    public void he_enters_the_windows_section() throws InterruptedException {
        ventanasWebAutomationDemoSiteStep.ventanas();
    }
    @When("he enters the frames section")
    public void he_enters_the_frames_section(DataTable dtDatosForm) {

        List<List<String>> cells = dtDatosForm.cells();
        for(int i=1; i<cells.size(); i++){
            frameWebAutomationDemoSiteStep.frame(cells, i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){

            }
        }

    }

    @When("you enter the accordion widget section")
    public void you_enter_the_accordion_widget_section() {
        acordeonWebAutomationDemoSiteStep.validacionventana();
    }

    @When("you enter the autocomplete section")
    public void you_enter_the_autocomplete_section(DataTable dtDatosForm) {

        List<List<String>> cells = dtDatosForm.cells();
        for(int i=1; i<cells.size(); i++){
            autocompletWebAutomationDemoSiteStep.autocomplet(cells, i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){

            }
        }

    }

    @When("you enter the datepicker section")
    public void you_enter_the_datepicker_section() throws InterruptedException {
        dateWebAutomationDemoSiteStep.date();
    }

    @When("you enter the slider section")
    public void you_enter_the_slider_section() {
    sliderWebAutomationDemoSiteStep.slider();
    }

    @Then("he verifies that the screen with the text Double Click on Edit Icon to EDIT the Table Row loads")
    public void he_verifies_that_the_screen_with_the_text_double_click_on_edit_icon_to_edit_the_table_row_loads() {

    }

    @Then("he verifies that the screen with the text Hello hello world How are you today loads")
    public void he_verifies_that_the_screen_with_the_text_hello_hello_world_how_are_you_today_loads() {
        alertWebAutomationDemoSiteStep.validar();
    }

    @Then("he verifies that the screen with")
    public void he_verifies_that_the_screen_with() {
        ventanasWebAutomationDemoSiteStep.validaciones();
    }

    @Then("he verifies that it allows typing in the text fields")
    public void he_verifies_that_it_allows_typing_in_the_text_fields() {
      //  frameWebAutomationDemoSiteStep.validacionventana();
    }

    @Then("check that the text is correct in each option")
    public void check_that_the_text_is_correct_in_each_option() {
            acordeonWebAutomationDemoSiteStep.validacion();
    }
    @Then("you check that the query was added correctly")
    public void you_check_that_the_query_was_added_correctly() {

    }

    @Then("check that the date was added correctly")
    public void check_that_the_date_was_added_correctly() throws InterruptedException {
        dateWebAutomationDemoSiteStep.validacionfechatxt();
    }

    @Then("check that the slider was moved correctly")
    public void check_that_the_slider_was_moved_correctly() {

    }

}
