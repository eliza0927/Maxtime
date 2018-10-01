#language:es
#Author: ecruz@choucairtesting.com


@RegistroTiempoMaxtime

Característica: Reportar mis actividades en el sistema de Registro
  
 Como analista de pruebas
 Quiero realizar el reporte de mis actividades en MaxTime
 Para cumplir con la tarea que debo llevar a cabo diariamente

@RegistroTiempoLaboral
Esquema del escenario: 
    Dado que Elizabeth necesita registrar su tiempo laboal en el sistema de Registro
    Cuando ella realiza el registro del mismo de sus horas laborales
      |Usuario|Clave|
      |<Usuario>|<Clave>|
    Entonces ella verifica que su dia se encuentre cerrado

    Ejemplos: 
      |Usuario|Clave|
      |ecruz|Eliza3036|
