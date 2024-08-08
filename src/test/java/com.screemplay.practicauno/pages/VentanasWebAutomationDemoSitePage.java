package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;

public class VentanasWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")
    public WebElementFacade btnswitch;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a")
    public WebElementFacade btnAlert;

    @FindBy(xpath = "//*[@id=\"Tabbed\"]/a/button")
    public WebElementFacade btnventana1;

    @FindBy(xpath = "/html/body/div/main/section[1]/div/div/div/p[1]")
    public WebElementFacade lblHomePpal1;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")
    public WebElementFacade btnventana2;

    @FindBy(xpath = "//*[@id=\"Seperate\"]/button")
    public WebElementFacade btnventana2acceso;


    @FindBy(xpath = "/html/body/div/main/div[1]/div/h2")
    public WebElementFacade lblHomePpal2;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")
    public WebElementFacade btnventana3;

    @FindBy(xpath = "//*[@id=\"Multiple\"]/button")
    public WebElementFacade btnventana3acceso;


    public void botonwindows() {
        //Ingreso al menu
        btnswitch.click();
        btnAlert.click();
    }
    public void ventanauno() throws InterruptedException {
        btnventana1.click();
        Thread.sleep(2000);
    }

    public void validacionventanauno (){

        assertEquals("Frames & windows", getDriver().getTitle());
       // String strMensaje = lblHomePpal1.getText();
       // assertThat(strMensaje, containsString("What you do with that power is entirely up to you."));
    }

    public void ventanados() throws InterruptedException {
        btnventana2.click();
        Thread.sleep(3000);
        btnventana2acceso.click();
        Thread.sleep(3000);

    }

    public void validacionventanados(){

        assertEquals("Frames & windows", getDriver().getTitle());
    }

    public void ventanatres() throws InterruptedException {
        btnventana3.click();
        Thread.sleep(3000);
        btnventana3acceso.click();
        Thread.sleep(3000);

    }

    public void validacionventanatres(){
        assertEquals("Frames & windows", getDriver().getTitle());
    }
}
