package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class VentanasWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")
    public WebElementFacade btnswitch;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a")
    public WebElementFacade btnAlert;

    @FindBy(xpath = "//*[@id=\"Tabbed\"]/a/button")
    public WebElementFacade btnventana1;

    @FindBy(xpath = "/html/body/div/main/div[1]/div/h2")
    public WebElementFacade lblHomePpal1;



    public void botonwindows() {
        //Ingreso al menu
        btnswitch.click();
        btnAlert.click();
    }
    public void ventanauno() throws InterruptedException {
        btnventana1.click();
        Thread.sleep(5000);
    }

    public void validacionventanauno (){
        String strMensaje = lblHomePpal1.getText();
        assertThat(strMensaje, containsString("Getting Started"));
    }
}
