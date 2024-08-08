package com.screemplay.practicauno.Steps;

import com.screemplay.practicauno.pages.FramesWebAutomationDemoSitePage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class FrameWebAutomationDemoSiteStep {

    FramesWebAutomationDemoSitePage framesWebAutomationDemoSitePage;

@Step
    public void frame(List<List<String>> data, int id) {
        framesWebAutomationDemoSitePage.botonwindows();
     //   framesWebAutomationDemoSitePage.campotexto1(data.get(id).get(0).trim());
        framesWebAutomationDemoSitePage.boton();
  //  framesWebAutomationDemoSitePage.campotexto2(data.get(id).get(1).trim());
    }

    @Step
    public void validacionventana(){
    framesWebAutomationDemoSitePage.validacionventanauno();
    }
}
