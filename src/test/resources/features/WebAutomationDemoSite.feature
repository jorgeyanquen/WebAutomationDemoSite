@Regresion
Feature: You want to automate the processes on the Web Automation Demo Site page to have control of the functions
# Feature: Se quiere automatizar los procesos en la pagina  Web Automation Demo Site para tener control de las funciones
  @CasoExitoso
  Scenario: automate registration on the Web Automation Demo Site page
  # Scenario: automatizar registro en la pagina  Web Automation Demo Site
    Given Carlos wants to access the Web Automation Demo Site
   # Dado que Carlos quiere acceder a la Web Automation Demo Site
    When he registers on the page
    #Cuando el realiza el registro en la página
    Then he verifies that the screen with the text Double Click on Edit Icon to EDIT the Table Row loads
    # Entonces el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row