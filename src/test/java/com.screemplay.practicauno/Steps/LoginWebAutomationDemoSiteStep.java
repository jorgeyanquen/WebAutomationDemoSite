package com.screemplay.practicauno.Steps;

import com.screemplay.practicauno.pages.LoginWebAutomationDemoSitePage;
import net.thucydides.core.annotations.Step;

public class LoginWebAutomationDemoSiteStep {


    LoginWebAutomationDemoSitePage loginWebAutomationDemoSitePage;

    @Step
    public void WebAutomationDemoSite(){
        loginWebAutomationDemoSitePage.open();
    }
}
