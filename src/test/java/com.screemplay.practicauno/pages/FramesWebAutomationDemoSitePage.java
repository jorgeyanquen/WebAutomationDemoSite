package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class FramesWebAutomationDemoSitePage extends PageObject {


    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")
    public WebElementFacade btnswitch;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a")
    public WebElementFacade btnframes;

    @FindBy(xpath = "/html/body/section/div/div/div/input")
    public WebElementFacade txtcampo1;

    @FindBy(xpath = "/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")
    public WebElementFacade btndos;

    @FindBy(xpath = "/html/body/section/div/div/div/input")
    public WebElementFacade txtcampo2;

    @FindBy(xpath = "/html/body/section/div/h5")
    public WebElementFacade lblHomePpal1;

    public void botonwindows() {
        //Ingreso al menu
        btnswitch.click();
        btnframes.click();
    }

    public void campotexto1(String datoPrueba) {
        txtcampo1.click();
        txtcampo1.clear();
        txtcampo1.sendKeys(datoPrueba);
    }

    public void boton() {
        btndos.click();
    }

    public void campotexto2(String datoPrueba) {
        txtcampo2.click();
        txtcampo2.clear();
        txtcampo2.sendKeys(datoPrueba);
    }

    public void validacionventanauno(){
        String strMensaje = lblHomePpal1.getText();
        assertThat(strMensaje, containsString("iFrame Demo"));
    }
}
