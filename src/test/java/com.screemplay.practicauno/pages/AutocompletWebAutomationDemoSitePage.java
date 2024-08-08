package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AutocompletWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a")
    public WebElementFacade btnwidget;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[2]/a")
    public WebElementFacade btnAutocomplet;

    @FindBy(xpath = "/html/body/section/div[1]/div[2]/div[1]/div")
    public WebElementFacade txtAutocomplet;


    public void botonwindows() {
        //Ingreso al menu
        btnwidget.click();
        btnAutocomplet.click();
    }

    public void campotexto(String dataPrueba){
        txtAutocomplet.click();
        txtAutocomplet.clear();
        txtAutocomplet.sendKeys(dataPrueba);
        txtAutocomplet.click();
    }
}
