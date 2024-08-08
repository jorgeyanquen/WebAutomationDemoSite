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

    @FindBy(xpath = "//*[@id=\"Functionality\"]/div/div/div/div[2]/div[1]/h4/a/b")
    public WebElementFacade btnopcion2;

    @FindBy(xpath = "//*[@id=\"collapse1\"]/div")
    public WebElementFacade valopcion1;

    @FindBy(xpath = "//*[@id=\"collapse2\"]/div")
    public WebElementFacade valopcion2;

    @FindBy(xpath = "//*[@id=\"Functionality\"]/div/div/div/div[3]/div[1]/h4")
    public WebElementFacade btnopcion3;

    @FindBy(xpath = "//*[@id=\"collapse3\"]/div")
    public WebElementFacade valopcion3;

    @FindBy(xpath = "//*[@id=\"Functionality\"]/div/div/div/div[4]/div[1]/h4")
    public WebElementFacade btnopcion4;

    @FindBy(xpath = "//*[@id=\"collapse4\"]/div")
    public WebElementFacade valopcion4;

    public void botonwindows() {
        //Ingreso al menu
        btnwidget.click();
        btnAcordeon.click();
    }

    public void opcion2(){
        btnopcion2.click();

    }
    public void opcion3(){
        btnopcion3.click();
    }

    public void opcion4(){
        btnopcion4.click();
    }

    public void validacion1(){
        String strMensaje = valopcion1.getText();
        assertThat(strMensaje, containsString("This Automation Testing API is very simple to read and understand. Every method in this is self explanatory. If a layman looks into this code/script can understand what is happening. You can read the automation script like manual test case."));
    }

    public void validacion2(){
        String strMensaje = valopcion2.getText();
        assertThat(strMensaje, containsString("In this Automation tool, each and every functionality will be achieved by Single line code. i.e. Selecting a Value from dropdown, Switching between windows and Drag and Drop functionality etc..."));
    }

    public void validacion3(){
        String strMensaje = valopcion3.getText();
        assertThat(strMensaje, containsString("As the name indicates, you can chain the methods without breaking the code i.e. you can write the code for each element continuously."));
    }

    public void validacion4(){
        String strMensaje = valopcion4.getText();
        assertThat(strMensaje, containsString("NTest your web application across the most popular browsers including Firefox,Chrome and Internet Explorer to validate the functionality. You can easily switch between the browsers without changing the code."));
    }
}
