package com.screemplay.practicauno.Steps;

import com.screemplay.practicauno.pages.VentanasWebAutomationDemoSitePage;
import net.thucydides.core.annotations.Step;


public class VentanasWebAutomationDemoSiteStep {

    VentanasWebAutomationDemoSitePage ventanasWebAutomationDemoSitePage;

    @Step
    public void ventanas() throws InterruptedException {
        ventanasWebAutomationDemoSitePage.botonwindows();
        ventanasWebAutomationDemoSitePage.ventanauno();
        ventanasWebAutomationDemoSitePage.ventanados();
        ventanasWebAutomationDemoSitePage.ventanatres();
    }

    @Step
    public void validaciones (){
        ventanasWebAutomationDemoSitePage.validacionventanauno();
        ventanasWebAutomationDemoSitePage.validacionventanados();
        ventanasWebAutomationDemoSitePage.validacionventanatres();
    }
}
