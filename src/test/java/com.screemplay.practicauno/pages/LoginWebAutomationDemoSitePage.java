package com.screemplay.practicauno.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class LoginWebAutomationDemoSitePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")
       public WebElementFacade txtnombres;

       @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")
      public WebElementFacade txtapellidos;

    @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")
    public WebElementFacade txtdireccion;

    @FindBy(xpath = "//*[@id=\"eid\"]/input")
    public WebElementFacade txtemail;

    @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
    public WebElementFacade txttelefono;

    @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")
    public WebElementFacade selectgender;

    @FindBy(id = "checkbox1")
    public WebElementFacade selecthobbies;

    @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[35]/a")
    public WebElementFacade selectlenguajes;

    @FindBy(id = "msdd")
    public WebElementFacade txtlenguaje;

    @FindBy(xpath = "//*[@id=\"section\"]/div/div")
    public WebElementFacade selectpage;

    @FindBy(xpath = "//*[@id=\"Skills\"]")
    public WebElementFacade txtskills;

    @FindBy(xpath = "//*[@id=\"Skills\"]/option[11]")
    public WebElementFacade selectskills;

    @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")
    public WebElementFacade selectcountry;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    public WebElementFacade txtcountry;

    @FindBy(id = "yearbox")
    public WebElementFacade txtaño;

    @FindBy(xpath = "//*[@id=\"yearbox\"]/option[78]")
    public WebElementFacade seleccionaño;

    @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")
    public WebElementFacade txtmes;

    @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[9]")
    public WebElementFacade selectmes;

    @FindBy(id = "daybox")
    public WebElementFacade txtdia;

    @FindBy(xpath = "//*[@id=\"daybox\"]/option[4]")
    public WebElementFacade selectdia;

    @FindBy(id = "firstpassword")
    public WebElementFacade txtpassword1;

    @FindBy(id = "secondpassword")
    public WebElementFacade txtpassword2;

    @FindBy(id = "submitbtn")
    public WebElementFacade btnsubmit;

      public void ingresarnombres(String datoPrueba){
        txtnombres.click();
        txtnombres.clear();
        txtnombres.sendKeys(datoPrueba);
      }

     public void ingresarapellidos(String datoPrueba){
      txtapellidos.click();
      txtapellidos.clear();
      txtapellidos.sendKeys(datoPrueba);
    }
    public void ingresardireccion(String datoPrueba){
        txtdireccion.click();
        txtdireccion.clear();
        txtdireccion.sendKeys(datoPrueba);
    }

    public void ingresaremail(String datoPrueba){
        txtemail.click();
        txtemail.clear();
        txtemail.sendKeys(datoPrueba);
    }

    public void ingresartelefono(String datoPrueba){
        txttelefono.click();
        txttelefono.clear();
        txttelefono.sendKeys(datoPrueba);
    }

    public void selectgender(){
          selectgender.click();
    }

    public void setSelecthobbies(){
        selecthobbies.click();
    }

    public void Selectlenguajes(){
     //
        txtlenguaje.click();
        selectlenguajes.click();
        selectpage.click();

      }
      public void txtskills(){
        txtskills.click();
          selectskills.click();
      }

      public void selectcontry(){
          selectcountry.click();
      }

    public void ingresarcountry(String datoPrueba){
        txtcountry.click();
        txtcountry.clear();
        txtcountry.sendKeys(datoPrueba);
    }

    public void ingresarfecha(){
        txtaño.click();
        seleccionaño.click();
        txtmes.click();
        selectmes.click();
        txtdia.click();
        selectdia.click();
    }

    public void ingresarclave(String datoPrueba){
        txtpassword1.click();
        txtpassword1.clear();
        txtpassword1.sendKeys(datoPrueba);

        txtpassword2.click();
        txtpassword2.clear();
        txtpassword2.sendKeys(datoPrueba);
    }

    public void boton(){
          btnsubmit.click();
    }
}

