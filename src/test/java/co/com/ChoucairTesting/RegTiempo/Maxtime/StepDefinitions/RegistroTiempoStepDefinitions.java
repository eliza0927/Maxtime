package co.com.ChoucairTesting.RegTiempo.Maxtime.StepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.ChoucairTesting.RegTiempo.Maxtime.model.RegTiemposMaxtime;
import co.com.ChoucairTesting.RegTiempo.Maxtime.tasks.Abrir;
import co.com.ChoucairTesting.RegTiempo.Maxtime.tasks.Realizar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;


public class RegistroTiempoStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver SuNavegador;
	private Actor Elizabeth =Actor.named("Elizabeth");
	
	@Before
	public void ConfiguracionInicial()
	{
		Elizabeth.can(BrowseTheWeb.with(SuNavegador));
	}

	
	
	@Dado("^que Elizabeth necesita registrar su tiempo laboal en el sistema de Registro$")
	public void queElizabethNecesitaRegistrarSuTiempoLaboalEnElSistemaDeRegistro() throws Exception {
	
		Elizabeth.wasAbleTo(Abrir.PaginaAdministracionTiempo());
		
	}

	@Cuando("^ella realiza el registro del mismo de sus horas laborales$")
	public void ellaRealizaElRegistroDelMismoDeSusHorasLaborales(List<RegTiemposMaxtime>Datos) throws Exception {
	    Elizabeth.attemptsTo(Realizar.RegistroTiempoMaxtimeConLosSgte(Datos));
	}

	@Entonces("^ella verifica que su dia se encuentre cerrado$")
	public void ellaVerificaQueSuDiaSeEncuentreCerrado() throws Exception {
	   
	}	
	
	

}
