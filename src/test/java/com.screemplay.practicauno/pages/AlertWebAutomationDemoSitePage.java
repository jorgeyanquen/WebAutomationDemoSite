package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AlertWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")
    public WebElementFacade btnswitch;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")
    public WebElementFacade btnAlert;

    @FindBy(xpath = "//*[@id=\"OKTab\"]/button")
    public WebElementFacade btnAlert1;


    public void botonswitch(){
       //Ingreso al menu
        btnswitch.click();
        btnAlert.click();
//Automatizacion primera alerta
        btnAlert1.click();
        getDriver().switchTo().alert().accept();
    }
}
