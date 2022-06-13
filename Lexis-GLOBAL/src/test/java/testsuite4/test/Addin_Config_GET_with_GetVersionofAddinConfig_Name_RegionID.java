package testsuite4.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import apache.api.FileIO;
import apache.api.Operation;
import dataprovider.api.DP_Base;
import global.api.Environment;

public class Addin_Config_GET_with_GetVersionofAddinConfig_Name_RegionID extends Environment {

	@Test(dataProvider = "ProbaseURL", dataProviderClass = DP_Base.class)
	public static void ViewSpecific_AddinConfig(String url) throws IOException, InterruptedException {
		try {
			sheetname = "AddinConfig_View(ID)";
			FileIO.coreutility(sheetname);
			Operation.worksheet(url);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Delte Specific Region in Sheet Page " + e);
			Assert.fail();
		}
	}
}