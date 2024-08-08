package com.screemplay.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class DateWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a")
    public WebElementFacade btnwidget;

    @FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[3]/a")
    public WebElementFacade btndatepicker;

    @FindBy(xpath = "/html/body/section/div[1]/div/div/form/div[2]/div[2]")
    public WebElementFacade btndate1;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")
    public WebElementFacade btndateatras;


    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")
    public WebElementFacade btnfecha1;

    @FindBy(xpath = "//*[@id=\"datepicker2\"]")
    public WebElementFacade btndate2;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/table/tbody/tr[2]/td[5]/a")
    public WebElementFacade btnfecha2;

    @FindBy(xpath = "/html/body/section/div[1]/div/div/form/div[1]/div[2]/label")
    public WebElementFacade txtvalidacion;

    public void botonwindows() {
        //Ingreso al menu
        btnwidget.click();
        btndatepicker.click();
    }

    public void seleccionfecha1(){
        btndate1.click();
        btndateatras.click();
        btnfecha1.click();

    }
    public void prueba(){
        Actions move = new Actions(getDriver());

        move.dragAndDropBy(btndate1, 200,100).perform();
    }

    public void seleccionfecha2(){
        btndate2.click();
        btnfecha2.click();

    }

    public void validacionfecha(){
        String strMensaje = txtvalidacion.getText();
        assertThat(strMensaje, containsString("DatePicker Enabled"));
    }
}
