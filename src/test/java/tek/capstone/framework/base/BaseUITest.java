package tek.capstone.framework.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.capstone.framework.utilities.CommonUtility;

public class BaseUITest extends CommonUtility{

	
	@Before
	public void setupTest() {
		super.setupBrowser();
	}
	
	@After
	public void closeTests(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[]screenShot = takeScreenShotAsBytes();
			scenario.attach(screenShot, "image/png", scenario.getName()+"scenario Failed");
		}
	
	super.quitBrowser();
}
}