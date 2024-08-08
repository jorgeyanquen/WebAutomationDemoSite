package com.screemplay.practicauno.Steps;

import com.screemplay.practicauno.pages.AutocompletWebAutomationDemoSitePage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class AutocompletWebAutomationDemoSiteStep {

   AutocompletWebAutomationDemoSitePage autocompletWebAutomationDemoSitePage;

    @Step
    public void autocomplet(List<List<String>> data, int id){
    autocompletWebAutomationDemoSitePage.botonwindows();
  //  autocompletWebAutomationDemoSitePage.campotexto(data.get(id).get(0).trim());
    }
}
