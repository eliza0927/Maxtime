package co.com.ChoucairTesting.RegTiempo.Maxtime.userinterface;



import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.choucairtesting.com:18000/MaxTimeCHC/Login.aspx")
public class RegTiempoMaxtimePage extends PageObject {
	

	
	public static final Target USUARIO=Target.the("Usuario Logeuo")
			.located(By.name("Logon$v0$MainLayoutEdit$xaf_l30$xaf_dviUserName_Edit"));
	
	public static final Target CLAVE=Target.the("Clave de usuario")
			.located(By.id("Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I"));
	
	
	public static final Target BOTON_INICIO=Target.the("Iniciar sección Maxtime")
			.located(By.partialLinkText("Conectarse"));

	
	public static final Target DIA_CERRAR=Target.the("Dia a cerrar")
			.located(By.xpath("//*[@id='Vertical_v1_LE_v2_DXMainTable']/tbody/tr[2]/td[3]"));
	
	public static final Target NUEVO_REPORTE=Target.the("Registro de tiempo")
			.located(By.partialLinkText("Nuevo"));
	
	public static final Target PROYECTO=Target.the("Proyecto para registrar tiempo")
			.located(By.id("Vertical_v6_MainLayoutEdit_xaf_l128_xaf_dviProyecto_Edit_Find_BImg"));

	
	
	/*public static final Target TIPO_PROYECTO=Target.the("Tipo proyecto")
			.located(By.xpath("//*[@id='//*[@id='Dialog_v7_LE_v8_DXMainTable']/tbody/tr[4]/td[7]']"));
*/
	/*public static final Target PROYECTO_REGTIEMPO=Target.the("Proyecto a cerrar ")
			.located(By.xpath("//*[@id='Dialog_v2_LE_v3_DXMainTable']/tbody/tr/)"));*/
	

	

}
