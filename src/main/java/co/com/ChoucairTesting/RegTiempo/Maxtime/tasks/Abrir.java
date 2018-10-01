package co.com.ChoucairTesting.RegTiempo.Maxtime.tasks;

import co.com.ChoucairTesting.RegTiempo.Maxtime.userinterface.RegTiempoMaxtimePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task {

	private RegTiempoMaxtimePage regTiempoMaxtimePage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(regTiempoMaxtimePage));
			
	}
	
	public static Abrir PaginaAdministracionTiempo() {
		return Tasks.instrumented(Abrir.class);
	}

	

}
