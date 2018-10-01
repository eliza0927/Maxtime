package co.com.ChoucairTesting.RegTiempo.Maxtime.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

import co.com.ChoucairTesting.RegTiempo.Maxtime.model.RegTiemposMaxtime;
import co.com.ChoucairTesting.RegTiempo.Maxtime.userinterface.RegTiempoMaxtimePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;




public class Realizar implements Task {


private List<RegTiemposMaxtime> Datos;
	
	//constructor 
	public Realizar(List<RegTiemposMaxtime> Datos)
	{
		this.Datos=Datos;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(Enter.theValue(Datos.get(0).getUsuario()).into(RegTiempoMaxtimePage.USUARIO));
		actor.attemptsTo(Enter.theValue(Datos.get(0).getClave()).into(RegTiempoMaxtimePage.CLAVE));
		actor.attemptsTo(Click.on(RegTiempoMaxtimePage.BOTON_INICIO));
	
		try {
			Thread.sleep(5000);
			actor.attemptsTo(Click.on(RegTiempoMaxtimePage.DIA_CERRAR));
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		actor.attemptsTo(Click.on(RegTiempoMaxtimePage.NUEVO_REPORTE));
		actor.attemptsTo(Click.on(RegTiempoMaxtimePage.PROYECTO));
		
		try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
		
	Serenity.getWebdriverManager().getWebdriver().switchTo().frame(0);
	actor.attemptsTo(Click.on(By.xpath("//*[@id='Dialog_v7_LE_v8_DXMainTable']/tbody/tr[4]/td[7]")));
	
	//Serenity.getWebdriverManager.switchTo().frame(driver.findElement(By.className("my-iframe-class")));
		/*System.out.println("hOLA" +Serenity.getWebdriverManager().getWebdriver()
				.findElement(By.xpath("//*[@id='Dialog_v7_LE_v8_DXMainTable']/tbody/tr[4]/td[7]")).getText());
	*/
	//actor.attemptsTo(Click.on(RegTiempoMaxtimePage.TIPO_PROYECTO));
		//div[@class='panel-body']/p
		//Dialog_v7_LE_v8			
		//*[@id='Vertical_v1_LE_v2_DXMainTable']/tbody/tr[2]/td[3]	
		
		
		
	}
	
	
	public static Realizar RegistroTiempoMaxtimeConLosSgte(List<RegTiemposMaxtime> datos) {
	
		return instrumented(Realizar.class,datos);
	}

}
