package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DateWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a")
    public WebElementFacade btnwidget;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[3]/a")
    public WebElementFacade btndatepicker;

    public void botonwindows() {
        //Ingreso al menu
        btnwidget.click();
        btndatepicker.click();
    }
}
