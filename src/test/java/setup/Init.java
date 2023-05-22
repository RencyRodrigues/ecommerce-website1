package setup;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;

public class Init extends PageObject{

	
private  static EnvironmentVariables envVars;	
private EnvironmentVariables env;
	public String appurl() {
		System.out.println("URL is opened from Init class"+ EnvironmentSpecificConfiguration.from(env).
			getProperty("appUrl"));
		return EnvironmentSpecificConfiguration.from(env).getProperty("appUrl");
		
	}
}
