package com.screemplay.practicauno.Steps;

import com.screemplay.practicauno.pages.DateWebAutomationDemoSitePage;
import net.thucydides.core.annotations.Step;

public class DateWebAutomationDemoSiteStep {

    DateWebAutomationDemoSitePage dateWebAutomationDemoSitePage;
@Step
    public void date () throws InterruptedException {
        dateWebAutomationDemoSitePage.botonwindows();
        dateWebAutomationDemoSitePage.seleccionfecha1();
        dateWebAutomationDemoSitePage.seleccionfecha2();
        Thread.sleep(3000);
    }

    @Step
    public void validacionfechatxt() throws InterruptedException {
    dateWebAutomationDemoSitePage.validacionfecha();
        Thread.sleep(3000);
    }

}
