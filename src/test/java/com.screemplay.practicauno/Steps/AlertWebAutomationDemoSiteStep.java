package com.screemplay.practicauno.Steps;

import com.screemplay.practicauno.pages.AlertWebAutomationDemoSitePage;
import net.thucydides.core.annotations.Step;

public class AlertWebAutomationDemoSiteStep {

    AlertWebAutomationDemoSitePage alertWebAutomationDemoSitePage;

    @Step
    public void Alertas() throws InterruptedException {

        alertWebAutomationDemoSitePage.botonswitch();
        alertWebAutomationDemoSitePage.Alertauno();
        alertWebAutomationDemoSitePage.Alertados();
        alertWebAutomationDemoSitePage.alertatres();
    }
    @Step
    public void validar(){
        alertWebAutomationDemoSitePage.validacion();
    }
}
