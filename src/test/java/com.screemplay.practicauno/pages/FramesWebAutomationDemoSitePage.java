package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class FramesWebAutomationDemoSitePage extends PageObject {


    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")
    public WebElementFacade btnswitch;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a")
    public WebElementFacade btnframes;

    public void botonwindows() {
        //Ingreso al menu
        btnswitch.click();
        btnframes.click();
}
    }
