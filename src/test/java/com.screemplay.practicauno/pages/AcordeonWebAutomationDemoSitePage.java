package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class AcordeonWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a")
    public WebElementFacade btnwidget;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[1]/a")
    public WebElementFacade btnAcordeon;

    @FindBy(xpath = "//*[@id=\"Functionality\"]/div/div/div/div[1]/div[1]/h4/a/b")
    public WebElementFacade btnopcion1;

    @FindBy(xpath = "//*[@id=\"collapse1\"]/div")
    public WebElementFacade valopcion1;

    public void botonwindows() {
        //Ingreso al menu
        btnwidget.click();
        btnAcordeon.click();
    }

    public void opcion1(){
        btnopcion1.click();
        btnopcion1.click();
    }

    public void validacion1(){
        String strMensaje = valopcion1.getText();
        assertThat(strMensaje, containsString("This Automation Testing API is very simple to read and understand. Every method in this is self explanatory. If a layman looks into this code/script can understand what is happening. You can read the automation script like manual test case."));
    }
}
