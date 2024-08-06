package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class AlertWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")
    public WebElementFacade btnswitch;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")
    public WebElementFacade btnAlert;

    @FindBy(xpath = "//*[@id=\"OKTab\"]/button")
    public WebElementFacade btnAlert1;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")
    public WebElementFacade btnopcion2;

    @FindBy(xpath = "//*[@id=\"CancelTab\"]/button")
    public WebElementFacade btnopciondosuno;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")
    public WebElementFacade btnopciontres;

    @FindBy(xpath = "//*[@id=\"Textbox\"]/button")
    public WebElementFacade btnopciontresuno;

    //label a verificar
    @FindBy(xpath = "//*[@id=\"demo1\"]")
    public WebElementFacade lblHomePpal;


    public void botonswitch() {
        //Ingreso al menu
        btnswitch.click();
        btnAlert.click();
    }

        public void Alertauno() throws InterruptedException {
            //Automatizacion primera alerta
            btnAlert1.click();

            getDriver().switchTo().alert().accept();


        }
public void Alertados() throws InterruptedException {
    //Automatizacion opcion alerta ok o cancelar
       btnopcion2.click();
       btnopciondosuno.click();
       getDriver().switchTo().alert().dismiss();

}
public void alertatres() throws InterruptedException {
    //Automatizacion opcion tres alerta con texto
    btnopciontres.click();
    btnopciontresuno.click();
    getDriver().switchTo().alert().sendKeys("Hola Mundo");
    getDriver().switchTo().alert().accept();
    Thread.sleep(6000);
}
        public void validacion (){
        String strMensaje = lblHomePpal.getText();
        assertThat(strMensaje, containsString("Hello Hola Mundo How are you today"));
    }
}
