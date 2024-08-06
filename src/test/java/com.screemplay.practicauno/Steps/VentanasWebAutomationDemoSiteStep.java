package com.screemplay.practicauno.Steps;

import com.screemplay.practicauno.pages.VentanasWebAutomationDemoSitePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class VentanasWebAutomationDemoSiteStep {

    VentanasWebAutomationDemoSitePage ventanasWebAutomationDemoSitePage;

    @Step
    public void ventanas() throws InterruptedException {
        ventanasWebAutomationDemoSitePage.botonwindows();
        ventanasWebAutomationDemoSitePage.ventanauno();
    }

    @Step
    public void validaciones (){
        ventanasWebAutomationDemoSitePage.validacionventanauno();
    }
}
