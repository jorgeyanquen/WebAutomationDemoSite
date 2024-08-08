package com.screemplay.practicauno.Steps;

import com.screemplay.practicauno.pages.AcordeonWebAutomationDemoSitePage;
import net.thucydides.core.annotations.Step;

public class AcordeonWebAutomationDemoSiteStep {

    AcordeonWebAutomationDemoSitePage acordeonWebAutomationDemoSitePage;

    @Step
    public void validacionventana(){
        acordeonWebAutomationDemoSitePage.botonwindows();
        acordeonWebAutomationDemoSitePage.opcion2();
        acordeonWebAutomationDemoSitePage.opcion3();
    }

    @Step
    public void validacion(){
        acordeonWebAutomationDemoSitePage.validacion1();
        acordeonWebAutomationDemoSitePage.validacion2();
        acordeonWebAutomationDemoSitePage.validacion3();
    }
}
