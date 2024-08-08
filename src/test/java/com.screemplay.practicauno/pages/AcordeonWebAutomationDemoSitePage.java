package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AcordeonWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a")
    public WebElementFacade btnwidget;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[1]/a")
    public WebElementFacade btnAcordeon;

    public void botonwindows() {
        //Ingreso al menu
        btnwidget.click();
        btnAcordeon.click();
    }
}
