@Regresion
Feature: You want to automate the processes on the Web Automation Demo Site page to have control of the functions
# Feature: Se quiere automatizar los procesos en la pagina  Web Automation Demo Site para tener control de las funciones
  @CasoExitosoRegistro
  Scenario: automate registration on the Web Automation Demo Site page
  # Scenario: automatizar registro en la pagina  Web Automation Demo Site
    Given Carlos wants to access the Web Automation Demo Site
   # Dado que Carlos quiere acceder a la Web Automation Demo Site
    When he registers on the page
    #Cuando el realiza el registro en la página
      | nombres | apellidos | direccion      | correo              | telefono   |seleccionar ciudad | contraseña | confirmar contraseña |
      | Juan    | Perez     | calle 22 2a-02 | juanperez@gmail.com | 3142324354 | Australia          |12345      | 12345                |
    Then he verifies that the screen with the text Double Click on Edit Icon to EDIT the Table Row loads
    # Entonces el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row


  @CasoExitosoAlertas
  Scenario: automate registration on the Web Automation Demo Site page
    Given Carlos wants to access the Web Automation Demo Site
    When he enters the alerts section
    Then he verifies that the screen with the text Hello hello world How are you today loads


  @CasoExitosoVentanas
  Scenario: automate registration on the Web Automation Demo Site page
    Given Carlos wants to access the Web Automation Demo Site
    When he enters the windows section
    Then he verifies that the screen with


  @CasoExitosoFrame
  Scenario: automate the frames on the Web Automation Demo Site page
    Given Carlos wants to access the Web Automation Demo Site
    When he enters the frames section
      | frame1      | frame2      |
      | holamundo1  | holamundo2   |
    Then he verifies that it allows typing in the text fields

  @CasoExitosoAcordeon
  Scenario: automate the accordion on the Web Automation Demo Site page
    Given Carlos wants to access the Web Automation Demo Site
    When you enter the accordion widget section
    Then check that the text is correct in each option

  @CasoExitosoAutoComplet
  Scenario: automate the autocomplete on the Web Automation Demo Site page
    Given Carlos wants to access the Web Automation Demo Site
    When you enter the autocomplete section
      | dato     |
      | 11111 |
    Then you check that the query was added correctly

  @CasoExitosoDatepicker
  Scenario: automate the datepicker on the Web Automation Demo Site page
    Given Carlos wants to access the Web Automation Demo Site
    When you enter the datepicker section
    Then check that the date was added correctly

  @CasoExitosoSlider
  Scenario: automate the slider on the Web Automation Demo Site page
    Given Carlos wants to access the Web Automation Demo Site
    When you enter the slider section
    Then check that the slider was moved correctly