package com.screemplay.practicauno.Steps;

import com.screemplay.practicauno.pages.LoginWebAutomationDemoSitePage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class LoginWebAutomationDemoSiteStep {


    LoginWebAutomationDemoSitePage loginWebAutomationDemoSitePage;

    @Step
    public void WebAutomationDemoSite(){
        loginWebAutomationDemoSitePage.open();

    }

    @Step
    public void WebAutomationDemoSiteIngreso(List<List<String>> data, int id){
        loginWebAutomationDemoSitePage.ingresarnombres(data.get(id).get(0).trim());
        loginWebAutomationDemoSitePage.ingresarapellidos(data.get(id).get(1).trim());
        loginWebAutomationDemoSitePage.ingresardireccion(data.get(id).get(2).trim());
        loginWebAutomationDemoSitePage.ingresaremail(data.get(id).get(3).trim());
        loginWebAutomationDemoSitePage.ingresartelefono(data.get(id).get(4).trim());
        loginWebAutomationDemoSitePage.selectgender();
        loginWebAutomationDemoSitePage.setSelecthobbies();
        loginWebAutomationDemoSitePage.Selectlenguajes();
        loginWebAutomationDemoSitePage.txtskills();
        loginWebAutomationDemoSitePage.selectcontry();
        loginWebAutomationDemoSitePage.ingresarcountry(data.get(id).get(5).trim());
        loginWebAutomationDemoSitePage.ingresarfecha();
        loginWebAutomationDemoSitePage.ingresarclave(data.get(id).get(6).trim());
        loginWebAutomationDemoSitePage.ingresarclave(data.get(id).get(7).trim());
        loginWebAutomationDemoSitePage.boton();
    }
}
