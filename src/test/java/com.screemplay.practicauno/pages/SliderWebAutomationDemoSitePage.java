package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SliderWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a")
    public WebElementFacade btnwidget;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[4]/a")
    public WebElementFacade btnslider;

    public void botonwindows() {
        //Ingreso al menu
        btnwidget.click();
        btnslider.click();
    }
}
