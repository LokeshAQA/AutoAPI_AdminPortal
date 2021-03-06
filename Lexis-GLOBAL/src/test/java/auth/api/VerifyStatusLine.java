package auth.api;

import org.testng.Assert;
import com.aventstack.extentreports.Status;
import global.api.Environment;

public class VerifyStatusLine extends Environment {

	public static void ensureLine200() {
		try {
			statusline = httpresponse.getStatusLine();
			if (statusline.equals("HTTP/1.1 200 OK")) {
				log.debug("Actual Status_Info is â¨â¨ " + statusline);
				log.debug("âï¸PASS ! ð...Expected â¨ [HTTP/1.1 200 OK] == Actual â¨ " + "["+ statusline + "]");
				test.log(Status.PASS, "âï¸PASS ! ð...Expected â¨ [HTTP/1.1 200 OK] == Actual â¨ " + "["+ statusline + "]");
		    	extendFinalOutput="Pass";
			} else {
				log.debug("Actual Status_Info is â¨â¨ " + statusline);
				log.debug("â Fail ! ð...Expected â¨ [HTTP/1.1 200 OK] â â  Actual â¨ " + "["+ statusline + "]");
				test.log(Status.FAIL, "â Fail ! ð...Expected â¨ [HTTP/1.1 200 OK] â â  Actual â¨ " + "["+ statusline + "]");
				extendFinalOutput="Fail";
				Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
				Assert.fail();
			}	
		} catch (Exception e) {
			log.debug("â Failing ! ð...Exception occur! on StatusLine Area with HTTP/1.1 200 OK " + e);
			test.log(Status.FAIL, "Expected Status_Line [HTTP/1.1 200 OK] â   Actual Status_Code " + "["+ statusline + "]" + " Bad RESPONSE");
			Assert.fail();
		}
	}
	public static void ensureLine403() {
		try {
			statusline = httpresponse.getStatusLine();
			if (statusline.equals("HTTP/1.1 403 Forbidden")) {
				log.debug("Actual Status_Info is â¨â¨ " + statusline);
				log.debug("âï¸PASS ! ð...Expected â¨ [HTTP/1.1 403 Forbidden] == Actual â¨ " + "["+ statusline + "]");
				test.log(Status.PASS, "âï¸PASS ! ð...Expected â¨ [HTTP/1.1 403 Forbidden] == Actual â¨ " + "["+ statusline + "]");
				extendFinalOutput="Fail";
			} else {
				log.debug("Actual Status_Info is â¨â¨ " + statusline);
				log.debug("â Fail ! ð...Expected â¨ [HTTP/1.1 403 Forbidden] â â  Actual â¨ " + "["+ statusline + "]");
				test.log(Status.FAIL, "â Fail ! ð...Expected â¨  [HTTP/1.1 403 Forbidden] â â  Actual â¨ " + "["+ statusline + "]");
				extendFinalOutput="Fail";
				Assert.assertEquals(statusline, "HTTP/1.1 403 Forbidden");
				Assert.fail();
			}	
		} catch (Exception e) {
			log.debug("â Failing ! ð...Exception occur! on StatusLine Area with HTTP/1.1 200 OK ",e);
			Assert.fail();
		}
	}
	public static void ensureLine400() {
		try {
			statusline = httpresponse.getStatusLine();
			if (statusline.equals("HTTP/1.1 400 Bad Request")) {
				log.debug("Actual Status_Info is â¨â¨ " + statusline);
				log.debug("âï¸PASS ! ð...Expected â¨ [HTTP/1.1 400 Bad Request] == Actual â¨ " + "["+ statusline + "]");
				test.log(Status.PASS, "âï¸PASS ! ð...Expected â¨ [HTTP/1.1 400 Bad Request] == Actual â¨ " + "["+ statusline + "]");
				extendFinalOutput="Fail";
			} else {
				log.debug("Actual Status_Info is â¨â¨ " + statusline);
				log.debug("â Fail ! ð...Expected â¨ [HTTP/1.1 400 Forbidden] â â  Actual â¨ " + "["+ statusline + "]");
				test.log(Status.FAIL, "â Fail ! ð...Expected â¨ [HTTP/1.1 400 Forbidden] â â  Actual â¨ " + "["+ statusline + "]");
				extendFinalOutput="Fail";
				Assert.assertEquals(statusline, "HTTP/1.1 400 Bad Request");
				Assert.fail();
			}	
		} catch (Exception e) {
			log.debug("â Failing ! ð...Exception occur! on StatusLine Area with HTTP/1.1 200 OK ",e);
			Assert.fail();
		}
	}

	public static void prePOSTensure() {
		try {
			statusline = httpresponse.getStatusLine();
			if (statusline.equals("HTTP/1.1 200 OK")) {
				log.debug("âï¸PASS ! ð...Expected â¨ [HTTP/1.1 200 OK] == Actual â¨ " + "["
						+ statusline + "]");
				// test.log(Status.PASS, "Status_Line "+"["+ statusline+"]"+" Status OK");
			} else {
				log.debug("Actual Status_Info â¨â¨ " + statusline);
				log.debug("â Fail ! ð...Expected â¨ [HTTP/1.1 200 OK] == Actual â¨ " + "["
						+ statusline + "]");
				test.log(Status.FAIL, "Status_Line " + "[" + statusline + "]" + " Bad Request");
				// Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
				// Assert.fail();
			}
		} catch (Exception e) {
			log.debug("â Failling ! ð...Exception occur! on StatusLine Area with HTTP/1.1 200 OK " + e);
			test.log(Status.FAIL, "Expected Status_Line [HTTP/1.1 200 OK] is Not Equal to  Actual Status_Code " + "["
					+ statusline + "]" + " Bad RESPONSE");
			Assert.fail();
		}
	}


	public static void ensureStatusLineValid() {
		try {
			statusline = httpresponse.getStatusLine();
			log.debug("Actual StatusLine â¨â¨  " + statusline);
			if (statusline.equals("HTTP/1.1 200 OK")) {
				log.debug("âï¸PASS ! ð...Expected â¨ [HTTP/1.1 200 OK]  == Actual â¨ " + "["+ statusline + "]");
				test.log(Status.PASS,"âï¸PASS ! ð...Expected â¨ [HTTP/1.1 200 OK]  == Actual â¨ " + "[" + statusline + "]");
				extendFinalOutput="Pass";
			} else {
				log.debug("â Fail ! ð...Expected â¨ [HTTP/1.1 200 OK]  â â  Actual â¨ " + "["+ statusline + "]");
				test.log(Status.FAIL,"âFail ! ð...Expected â¨ [HTTP/1.1 200 OK]  â â  Actual â¨ " + "[" + statusline + "]");
				extendFinalOutput="Fail";
			}
		} catch (Exception e) {
			log.debug("âFailing ! ð...Exception occur! on Verify StatusLine ", e);
			Assert.fail();
		}
	}

	public static void ensureStatusLineInvalid() {
		try {
			statusline = httpresponse.getStatusLine();
			log.debug("Actual StatusLine â¨â¨  " + statusline);
			if (statusline.equals("HTTP/1.1 400 Bad Request")) {
				log.debug("âPASS ! ð...Expected â¨ [HTTP/1.1 400 Bad Request] == Actual â¨ " + "["+ statusline + "]");
				test.log(Status.PASS,"âï¸PASS ! ð...Expected â¨ [HTTP/1.1 400 Bad Request]  == Actual â¨ " + "[" + statusline + "]");
				extendFinalOutput="Fail";
			} else {
				log.debug("â Fail ! ð...Expected â¨ [HTTP/1.1 400 Bad Request]  â â  Actual â¨ " + "["+ statusline + "]");
				test.log(Status.FAIL,"âFail ! ð...Expected â¨ [HTTP/1.1 400 Bad Request]  â â  Actual â¨ " + "[" + statusline + "]");
				extendFinalOutput="Fail";
			}
		} catch (Exception e) {
			log.debug("âFailing ! ð...Exception occur! on Verify StatusLine ", e);
			Assert.fail();
		}
	}
}