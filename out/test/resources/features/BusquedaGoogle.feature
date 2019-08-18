Feature: Buscar palabra en google
  Como usuario web
  Quiero buscar palabras

  Scenario: Buscar palabra de pruebaz
    Given que un usuario web está en la página de inicio de google
    When él busca la palabra de pruebaz
    Then validar que se cargue la palabra correcta pruebas
    And validar la cantidad de resultados sea mayor que seis