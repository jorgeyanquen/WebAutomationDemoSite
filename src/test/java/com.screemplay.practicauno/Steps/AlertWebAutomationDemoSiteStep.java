package com.screemplay.practicauno.Steps;

import com.screemplay.practicauno.pages.AlertWebAutomationDemoSitePage;
import net.thucydides.core.annotations.Step;

public class AlertWebAutomationDemoSiteStep {

    AlertWebAutomationDemoSitePage alertWebAutomationDemoSitePage;

    @Step
    public void Alertas(){

        alertWebAutomationDemoSitePage.botonswitch();

    }

}
