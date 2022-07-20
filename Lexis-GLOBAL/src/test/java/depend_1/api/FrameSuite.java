package depend_1.api;

import java.io.IOException;
import org.testng.Assert;
import auth.api.VerifyBearerToken;
import auth.api.VerifyJsonID;
import auth.api.VerifyJsonResult;
//import auth.api.VerifyResponseTime;
import auth.api.VerifyStatusCode;
import auth.api.VerifyStatusLine;
import extend.api.Resultantreport;
import global.api.Environment;
import io.restassured.RestAssured;

public class FrameSuite extends Environment {

	@SuppressWarnings("static-access")
	public static void POST_Login(String url, String str1) throws InterruptedException, IOException {
		if (Subcategory.equals("Valid")) {
			test = htmlreport.createTest(executefile + " ➜ POST Method in " + user).info("Login as " + user);
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			withrespectto.loginflexiuser();
			referencereqresponse.PREPOSTresponse(url, str1);
			VerifyJsonResult.ensurebodyUNtoken();
			VerifyBearerToken.ensurelogintokenValid();
			VerifyStatusCode.ensureStatusCodeValid();
			VerifyStatusLine.ensureStatusLineValid();
			// VerifyResponseTime.ensure1(url, str1);
			Resultantreport.vAlid_TokenGeneration();
			htmlreport.flush();
		}
		if (Subcategory.equals("Invalid")) {
			test = htmlreport.createTest(executefile + " ➜ POST Method in " + user).info("Login as " + user);
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			withrespectto.loginflexiuser();
			referencereqresponse.PREPOSTresponse(url, str1);
			VerifyJsonResult.ensurebodyUNtoken();
			VerifyBearerToken.ensurelogintokenInvalid();
			VerifyStatusCode.ensureStatusCodeInvalid();
			VerifyStatusLine.ensureStatusLineInvalid();
			Resultantreport.InvAlid_TokenGeneration();
			htmlreport.flush();
		}
	}

	@SuppressWarnings("static-access")
	public static void Region_GET_View(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		if (user.contains("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.contains("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.contains("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.contains("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Region_GET_View_Specific(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.vIewSpecificRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.vIewSpecificRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.vIewSpecificRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.vIewSpecificRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.vIewSpecificRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.vIewSpecificRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Region_POST_Create(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		if (user.contains("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				VerifyJsonID.fromRegionID();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("❌ Failling ! 🙁...Excepetion occur! on Region POST Function in GlobalAdmin ", e);
				Assert.fail();
			}
		}
		if (user.contains("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Excepetion occur! on Specific POST Function on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.contains("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Excepetion occur! on Specific POST Function on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.contains("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Excepetion occur! on Specific POST Function on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.contains("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Excepetion occur! on Specific POST Function on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.contains("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Excepetion occur! on Specific POST Function on CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Region_DELETE_Delete(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific DELETE on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific DELETE on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific DELETE on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific DELETE on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific DELETE on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific DELETE on CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Region_PUT_Update(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.updateregioninglobal();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.uPdateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific PUT Function on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.updateregioninglobal();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode400();
				VerifyStatusLine.ensureLine400();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.uPdateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific PUT Function on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.vIewRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				withrespectto.updateregioninglobal();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.uPdateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific PUT Function on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.vIewRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				withrespectto.updateregioninglobal();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.uPdateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific PUT Function on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.vIewRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				withrespectto.updateregioninglobal();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.uPdateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific PUT Function on CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.vIewRegion();

				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				withrespectto.updateregioninglobal();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.uPdateRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific PUT Function on CORE FRAME " + e);
				Assert.fail();
			}
		}

	}

	@SuppressWarnings("static-access")
	public static void UserRegion_GET_View(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewUserRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewUserRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewUserRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewUserRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewUserRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewUserRegion();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}

	}

	@SuppressWarnings("static-access")
	public static void UserRegion_GET_View_Specific_UserID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 2
				// httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				// PrePostRequest.tokengeneration(url, str1);
				// referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				// VerifyJsonResult.ensurebodyToken();
				// VerifyStatusCode.ensureCode200();
				// VerifyStatusLine.ensureLine200();
				// ExtractJsonValue.fromResult();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewSpecificUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 2
				// httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				// PrePostRequest.tokengeneration(url, str1);
				// referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				// VerifyJsonResult.ensurebodyToken();
				// VerifyStatusCode.ensureCode200();
				// VerifyStatusLine.ensureLine200();
				// ExtractJsonValue.fromResult();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void UserRegion_GET_View_Specific_UserID_RegionID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.aSSignUserRegion();

				/*
				 * // TODO Stage 1-AA httprequest = RestAssured.given(); // TODO Token
				 * Generation and Store it PrePostRequest.tokengeneration(url, str1); // TODO
				 * Create a Region and Store Unique ID withrespectto.createregioninglobal();
				 * referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				 * // url,str4 VerifyJsonResult.ensurebodyToken(); VerifyJsonID.fromRegionID();
				 * VerifyStatusCode.ensureCode200(); VerifyStatusLine.ensureLine200(); //
				 * VerifyResponseTime.ensure2(url, str2, str3, str4);
				 * Resultantreport.cReateRegion();
				 */

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();

				// Assigning
				/*
				 * // TODO Stage 3 httprequest = RestAssured.given(); // TODO Token Generation
				 * and Store it PrePostRequest.tokengeneration(url, str1);
				 * withrespectto.additionUserRegion(); referencereqresponse.POSTresponse(url,
				 * str2, str3, str4, str5, str6, str7); VerifyJsonResult.ensurebodyToken();
				 * VerifyStatusCode.ensureCode200(); VerifyStatusLine.ensureLine200();
				 * //VerifyResponseTime.ensure3(url, str2); // TODO End the HTML Report
				 * Resultantreport.aSSignUserRegion();
				 */

				// TODO Stage 4
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				Subcategory = "UserIDRegionID";
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewSpecificUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				// TODO End the HTML Report
				Resultantreport.aSSignUserRegion();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				Subcategory = "UserIDRegionID";
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewSpecificUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				Subcategory = "UserIDRegionID";
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewSpecificUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				Subcategory = "UserIDRegionID";
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewSpecificUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				Subcategory = "UserIDRegionID";
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewSpecificUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				Subcategory = "UserIDRegionID";
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewSpecificUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void UserRegion_POST_Create(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ ASSIGN SPECIFIC REGION TO " + executefile + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.aSSignUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ ASSIGN SPECIFIC REGION TO " + executefile + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				Resultantreport.vIewUserRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.aSSignUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ ASSIGN SPECIFIC REGION TO " + executefile + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.aSSignUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ ASSIGN SPECIFIC REGION TO " + executefile + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.aSSignUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ ASSIGN SPECIFIC REGION TO " + executefile + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.aSSignUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ ASSIGN SPECIFIC REGION TO " + executefile + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				Resultantreport.cReateRegion();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.aSSignUserRegion();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void UserRegion_DELETE_Delete_UserID_RegionID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE  SPECIFIC REGION FROM " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.aSSignUserRegion();
				// TODO Stage 4
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.dEleteUserRegion();
				htmlreport.flush();
				Subcategory = "UserIDRegionID";
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			Subcategory = "UserIDRegionID";
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE  SPECIFIC REGION FROM " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.aSSignUserRegion();
				// TODO Stage 4
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.dEleteUserRegion();
				htmlreport.flush();
				Subcategory = "UserIDRegionID";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			Subcategory = "UserIDRegionID";
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE  SPECIFIC REGION FROM " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.aSSignUserRegion();
				// TODO Stage 4
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.dEleteUserRegion();
				htmlreport.flush();
				Subcategory = "UserIDRegionID";
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			Subcategory = "UserIDRegionID";
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE  SPECIFIC REGION FROM " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.aSSignUserRegion();
				// TODO Stage 4
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.dEleteUserRegion();
				htmlreport.flush();
				Subcategory = "UserIDRegionID";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			Subcategory = "UserIDRegionID";
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE  SPECIFIC REGION FROM " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.aSSignUserRegion();
				// TODO Stage 4
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.dEleteUserRegion();
				htmlreport.flush();
				Subcategory = "UserIDRegionID";
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			Subcategory = "UserIDRegionID";
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE  SPECIFIC REGION FROM " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// ExtractJsonValue.fromResult();
				Resultantreport.vIewUserRegion();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.additionUserRegion();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.aSSignUserRegion();
				// TODO Stage 4
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.dEleteUserRegion();
				htmlreport.flush();
				Subcategory = "UserIDRegionID";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_POST_Create(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.cReateJurisdiction();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}

		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.cReateJurisdiction();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.cReateJurisdiction();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.cReateJurisdiction();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.cReateJurisdiction();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
						.info("SCENARIO ➨ CREATE A NEW " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.cReateJurisdiction();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_GET_View(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_GET_View_Specific_JurisID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.viewSpecificJurisdiction();
				htmlreport.flush();

				// TODO End the HTML Report
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.viewSpecificJurisdiction();
				htmlreport.flush();

				// TODO End the HTML Report
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.viewSpecificJurisdiction();
				htmlreport.flush();

				// TODO End the HTML Report
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.viewSpecificJurisdiction();
				htmlreport.flush();

				// TODO End the HTML Report
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.viewSpecificJurisdiction();
				htmlreport.flush();

				// TODO End the HTML Report
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);

				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.viewSpecificJurisdiction();
				htmlreport.flush();

				// TODO End the HTML Report
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_GET_View_Specific_JurisID_GetMyJurisdiction(String url, String str1, String str2,
			String str3, String str4, String str5, String str6, String str7) {
		try {
			test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
					.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			// TODO Create a Region and Store Region Unique ID
			withrespectto.createregioninglobal();

			Subcategory = "BaseLine";

			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure2(url, str2, str3, str4);

			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);

			Subcategory = "GetMyJurisdiction";

			referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);

			// TODO End the HTML Report
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}

	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_GET_View_Specific_JurisID_GetJurisdictions(String url, String str1, String str2,
			String str3, String str4, String str5, String str6, String str7) {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();

				Subcategory = "BaseLine";

				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				Subcategory = "GetJurisdictions";

				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewGetJurisdictions();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();

				Subcategory = "BaseLine";

				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				Subcategory = "GetJurisdictions";

				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewGetJurisdictions();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();

				Subcategory = "BaseLine";

				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				Subcategory = "GetJurisdictions";

				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewGetJurisdictions();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();

				Subcategory = "BaseLine";

				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				Subcategory = "GetJurisdictions";

				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewGetJurisdictions();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();

				Subcategory = "BaseLine";

				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				Subcategory = "GetJurisdictions";

				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewGetJurisdictions();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
						.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();

				Subcategory = "BaseLine";

				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);

				Subcategory = "GetJurisdictions";

				referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);

				// TODO End the HTML Report
				Resultantreport.vIewGetJurisdictions();
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_GET_View_GetMyJurisdiction(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewGetMyJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewGetMyJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewGetMyJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewGetMyJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewGetMyJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
						.info("SCENARIO ➨ VIEW ALL " + executefile + " Include " + Subcategory + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.vIewGetMyJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_PUT_Update(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.updationJurisdiction();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.uPdateJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Jurisdiction PUT Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.updationJurisdiction();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.uPdateJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Jurisdiction PUT Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.updationJurisdiction();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.uPdateJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Jurisdiction PUT Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.updationJurisdiction();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.uPdateJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Jurisdiction PUT Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.updationJurisdiction();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.uPdateJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Jurisdiction PUT Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
						.info("SCENARIO ➨ UPDATE THE EXISTING " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Region Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();

				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();
				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.updationJurisdiction();
				referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.uPdateJurisdiction();
				htmlreport.flush();
			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Jurisdiction PUT Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_DELETE_Delete_JurisdictionID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteJurisdiction();

				// TODO End the HTML Report
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode200();
				VerifyStatusLine.ensureLine200();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteJurisdiction();

				// TODO End the HTML Report
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteJurisdiction();

				// TODO End the HTML Report
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteJurisdiction();

				// TODO End the HTML Report
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteJurisdiction();

				// TODO End the HTML Report
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
						.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
				// TODO Stage 1
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				// TODO Create a Region and Store Unique ID
				withrespectto.createregioninglobal();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromRegionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure2(url, str2, str3, str4);
				Resultantreport.cReateRegion();
				// TODO Stage 2
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				withrespectto.creationJurisdiction();
				referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyJsonID.fromJurisdictionID();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.cReateJurisdiction();

				// TODO Stage 3
				httprequest = RestAssured.given();
				// TODO Token Generation and Store it
				PrePostRequest.tokengeneration(url, str1);
				referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
				VerifyJsonResult.ensurebodyToken();
				VerifyStatusCode.ensureCode403();
				VerifyStatusLine.ensureLine403();
				// VerifyResponseTime.ensure3(url, str2);
				Resultantreport.dEleteJurisdiction();

				// TODO End the HTML Report
				htmlreport.flush();

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_POST_Create(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
					.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it

			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			ExtractJsonValue.fromResult();
			Resultantreport.vIewUserRegion();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			VerifyJsonResult.ensurebodyToken();
			VerifyJsonID.fromRegionID();
			// VerifyResponseTime.ensure2(url, str2, str3, str4);
			Resultantreport.cReateRegion();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			Resultantreport.cReateJurisdiction();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creation_UserJurisdiction();
			Subcategory = "Yes_UserJurisdiction";
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure4(url, str6);
			Resultantreport.AssignUserJurisdiction();
			htmlreport.flush();
		}
		if (user.equals("RegionalAdmin")) {

		}
		if (user.equals("CompanyAdmin")) {

		}
		if (user.equals("AccountIT")) {

		}
		if (user.equals("Approver")) {

		}
		if (user.equals("NormalUser")) {

		}
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_DELETE_Delete(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
					.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);

			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			ExtractJsonValue.fromResult();
			Resultantreport.vIewUserRegion();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			VerifyJsonResult.ensurebodyToken();
			VerifyJsonID.fromRegionID();
			// VerifyResponseTime.ensure2(url, str2, str3, str4);
			Resultantreport.cReateRegion();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			Resultantreport.cReateJurisdiction();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creation_UserJurisdiction();
			Subcategory = "Yes_UserJurisdiction";
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure4(url, str6);
			Resultantreport.AssignUserJurisdiction();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.deletion_UserJurisdiction();
			Subcategory = "Yes_UserJurisdiction";
			referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure4(url, str6);
			Resultantreport.DeleteUserJurisdiction();
			htmlreport.flush();
		}
		if (user.equals("RegionalAdmin")) {

		}
		if (user.equals("CompanyAdmin")) {

		}
		if (user.equals("AccountIT")) {

		}
		if (user.equals("Approver")) {

		}
		if (user.equals("NormalUser")) {

		}
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_GET_View_Specific_UserID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
				.info("SCENARIO ➨ VIEW THE SPECIFIC " + executefile + " include " + Subcategory + " in " + user);

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		ExtractJsonValue.fromResult();
		Resultantreport.vIewUserRegion();

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure4(url, str6);
		Resultantreport.ViewSpecificUserJurisdiction();
		htmlreport.flush();

	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_GET_View_Specific_UserIDJurisID(String url, String str1, String str2,
			String str3, String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
				.info("SCENARIO ➨ VIEW THE SPECIFIC " + executefile + " include " + Subcategory + " in " + user);

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		ExtractJsonValue.fromResult();
		Resultantreport.vIewUserRegion();

		// TODO Stage 1
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		// TODO Create a Region and Store Unique ID
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromRegionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creation_UserJurisdiction();
		Subcategory = "Yes_UserJurisdiction";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure4(url, str6);
		Resultantreport.AssignUserJurisdiction();

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "UserIDJurisdictionID";
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure4(url, str6);
		Resultantreport.ViewSpecificUserJurisdiction();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_POST_Create_GetByJurisID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " include " + Subcategory + " in " + user);

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		ExtractJsonValue.fromResult();
		Resultantreport.vIewUserRegion();

		// TODO Stage 1
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		// TODO Create a Region and Store Unique ID
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromRegionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creation_UserJurisdiction();
		Subcategory = "Yes_UserJurisdiction";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure4(url, str6);
		Resultantreport.AssignUserJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.getmyjurisdictionID_UserJurisdiction();
		Subcategory = "GetMyJurisdictionID";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.GetByJurisdictionID_UserJurisdiction();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_GET_All_GetMyJurisdictions(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
				.info("SCENARIO ➨ VIEW ALL " + executefile + " include " + Subcategory + " in " + user);

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		htmlreport.flush();
		Resultantreport.GetMyJurisdictions_UserJurisdiction();

	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_PUT_UpdateDefaultJurisdiction_UserIDJurisID(String url, String str1,
			String str2, String str3, String str4, String str5, String str6, String str7)
			throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " in GET(ID) Method")
				.info("CASE : View the Specific " + executefile + " Value");

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);

		Subcategory = "UpdateDefaultJurisdiction";

		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		ExtractJsonValue.fromResult();
		Resultantreport.vIewUserRegion();

		// TODO Stage 1
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		// TODO Create a Region and Store Unique ID
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromRegionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creation_UserJurisdiction();
		Subcategory = "Yes_UserJurisdiction";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure4(url, str6);
		Resultantreport.AssignUserJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.UpdateDefaultJurisdiction_UserJurisdiction();
		htmlreport.flush();

	}

	@SuppressWarnings("static-access")
	public static void EntityType_POST_Create(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.cReateEntityType();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void EntityType_GET_View(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
				.info("SCENARIO ➨ VIEW ALL " + executefile + " in " + user);
		// TODO Stage 1
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		htmlreport.flush();
		Resultantreport.viewEntityType();
	}

	@SuppressWarnings("static-access")
	public static void EntityType_PUT_Update(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
					.info("SCENARIO ➨ UPDATE THE SPECIFIC " + executefile + " in " + user);

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			VerifyJsonID.fromRegionID();
			// VerifyResponseTime.ensure2(url, str2, str3, str4);
			Resultantreport.cReateRegion();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			Resultantreport.cReateJurisdiction();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.Creation_EntityType();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			Resultantreport.cReateEntityType();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			ExtractJsonValue.entityResult();
			Resultantreport.viewEntityType();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.Updation_EntityType();
			referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			Resultantreport.uPdateEntityType();
			htmlreport.flush();
		}
		if (user.equals("RegionalAdmin")) {

		}
		if (user.equals("CompanyAdmin")) {

		}
		if (user.equals("AccountIT")) {

		}
		if (user.equals("Approver")) {

		}
		if (user.equals("NormalUser")) {

		}
	}

	@SuppressWarnings("static-access")
	public static void EntityType_GET_View_Specific_EntityType(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {

			test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
					.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " in " + user);

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			VerifyJsonID.fromRegionID();
			// VerifyResponseTime.ensure2(url, str2, str3, str4);
			Resultantreport.cReateRegion();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			Resultantreport.cReateJurisdiction();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.Creation_EntityType();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			VerifyJsonID.fromEntitytypeID();
			Resultantreport.cReateEntityType();

			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			// TODO End the HTML Report
			Resultantreport.viewSpecificEntityType();
			htmlreport.flush();

		}
		if (user.equals("RegionalAdmin")) {

		}
		if (user.equals("CompanyAdmin")) {

		}
		if (user.equals("AccountIT")) {

		}
		if (user.equals("Approver")) {

		}
		if (user.equals("NormalUser")) {

		}
	}

	@SuppressWarnings("static-access")
	public static void EntityType_DELETE_Delete(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
				.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.dEleteEntityType();
		htmlreport.flush();

	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_GET_View_EntityTypeID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {

		test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
				.info("SCENARIO ➨ VIEW SPECIFIC " + executefile + " in " + user);
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		// TODO Stage 3
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "BaseLine";
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		// TODO End the HTML Report
		Resultantreport.viewSpecificEntityType();
		htmlreport.flush();

	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_POST_Create(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {

		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();
		Subcategory = "BaseLine";
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_PUT_Update(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
					.info("SCENARIO ➨ UPDATE THE SPECIFIC " + executefile + " in " + user);

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			VerifyJsonID.fromRegionID();
			// VerifyResponseTime.ensure2(url, str2, str3, str4);
			Resultantreport.cReateRegion();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			Resultantreport.cReateJurisdiction();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.Creation_EntityType();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			VerifyJsonID.fromEntitytypeID();
			Resultantreport.cReateEntityType();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.Creation_EntitySubType();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			VerifyJsonID.fromEntitySubtypeID();
			Resultantreport.cReateEntitySubType();

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.Updation_EntitySubType();
			Subcategory = "BaseLine";
			referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			Resultantreport.uPdateEntitySubType();
			htmlreport.flush();
		}

	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_DELETE_Delete(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
				.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.DeleteEntitySubType();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void Entities_DELETE_Delete(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ DELETE Method in " + user)
				.info("SCENARIO ➨ DELETE THE SPECIFIC " + executefile + " in " + user);
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_Entities();
		Subcategory = "CreateEntities";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitiesID();
		Resultantreport.CreateEntities();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Deletion_Entities();
		referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.DeleteEntities();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void Entities_GET_Specific_View_Entities(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
				.info("SCENARIO ➨ VIEW THE SPECIFIC " + executefile + " in " + user);
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_Entities();
		Subcategory = "CreateEntities";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitiesID();
		Resultantreport.CreateEntities();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "View_Specific_Entities";
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.View_Specific_Entities();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void Entities_PUT_Update_Specific_Entities(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
				.info("SCENARIO ➨ UPDATE THE SPECIFIC " + executefile + " in " + user);
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_Entities();
		Subcategory = "CreateEntities";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitiesID();
		Resultantreport.CreateEntities();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Updation_Entities();
		Subcategory = "Update_Entities";
		referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.Update_Specific_Entities();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void Entities_GET_Specific_View_Entities_with_EntitySubType(String url, String str1, String str2,
			String str3, String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
				.info("SCENARIO ➨ VIEW THE SPECIFIC " + executefile + " in " + user);
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_Entities();
		Subcategory = "CreateEntities";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitiesID();
		Resultantreport.CreateEntities();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "View_Specific_Entities_EntitySubType";
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.View_Specific_Entities_EntitySubType();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void Entities_GET_Specific_View_Entities_with_GetEntityList(String url, String str1, String str2,
			String str3, String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ GET Method in " + user)
				.info("SCENARIO ➨ VIEW THE SPECIFIC " + executefile + " in " + user);
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_Entities();
		Subcategory = "CreateEntities";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitiesID();
		Resultantreport.CreateEntities();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "View_Specific_Entities_GetEntityList";
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.View_Specific_Entities_GetEntityList();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_POST_Create_Clone(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType_Clone();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubTypeClone();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_GET_View_Specific_IsVersionChangeEnabled(String url, String str1, String str2,
			String str3, String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
				.info("SCENARIO ➨ VIEW THE SPECIFIC " + executefile + " include " + Subcategory + " in " + user);
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "IsVersionChangedEnabled";
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		// TODO End the HTML Report
		Resultantreport.vIewEntitySubType_IsVersionChangeEnabled();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_GET_View_Specific_EntityTypeID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ GET(ID) Method in " + user)
				.info("SCENARIO ➨ VIEW THE SPECIFIC " + executefile + " include " + Subcategory + " in " + user);
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "EntityTypeID";
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// TODO End the HTML Report
		Resultantreport.vIewEntitySubType_IsVersionChangeEnabled();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_PUT_Update_StartVersionChange(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ PUT Method in " + user)
				.info("SCENARIO ➨ UPDATE THE SPECIFIC " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		// withrespectto.Updation_EntitySubType();
		Subcategory = "StartVersionChange";
		referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.UpdateEntitySubType_StartVersionChange();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void Entities_POST_Create(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromJurisdictionID();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_Entities();
		Subcategory = "CreateEntities";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitiesID();
		Resultantreport.CreateEntities();
		htmlreport.flush();

	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_POST_Create_CreateNewVersion(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.CreateNewVersion_EntitySubType();
		Subcategory = "CreateNewVersion";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.CreateNewVersion_EntitySubType();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_POST_Create_RollbackVersionChanges(String url, String str1, String str2,
			String str3, String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "RollbackVersionChanges";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.RollbackVersionChanges_EntitySubType();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void EntitySubType_POST_Create_GetByEntityTypeID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateJurisdiction();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntityType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitytypeID();
		Resultantreport.cReateEntityType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.Creation_EntitySubType();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromEntitySubtypeID();
		Resultantreport.cReateEntitySubType();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.GetByEntityTypeID();
		Subcategory = "GetByEntityTypeID";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.GetByEntityTypeID_EntitySubType();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void RuleConfig_POST_Create(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationRuleConfig();
		Subcategory = "Create_RuleConfig";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		Resultantreport.cReateRuleConfig();
		htmlreport.flush();

	}

	@SuppressWarnings("static-access")
	public static void RuleConfig_GET_View(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "ViewAll_RuleConfiguration";
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.vIEWRuleConfig();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void RuleConfig_GET_View_RuleConfigID(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationRuleConfig();
		Subcategory = "Create_RuleConfig";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		VerifyJsonID.fromRuleConfigID();
		Resultantreport.cReateRuleConfig();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "ViewSpecific_RuleConfiguration";
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.vIEW_sPecific_RuleConfig();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void RuleConfig_DELETE_Delete_RuleConfigID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

        httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationRuleConfig();
		Subcategory = "Create_RuleConfig";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		VerifyJsonID.fromRuleConfigID();
		Resultantreport.cReateRuleConfig();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "DeleteSpecific_RuleConfiguration";
		referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.dElete_sPecific_RuleConfig();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void RuleConfig_PUT_Update_Specific_RuleConfig(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		VerifyJsonID.fromRegionID();
		// VerifyResponseTime.ensure2(url, str2, str3, str4);
		Resultantreport.cReateRegion();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationRuleConfig();
		Subcategory = "Create_RuleConfig";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		// VerifyResponseTime.ensure3(url, str2);
		VerifyJsonID.fromRuleConfigID();
		Resultantreport.cReateRuleConfig();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.UpdationRuleConfig();
		Subcategory = "UpdateSpecific_RuleConfiguration";
		referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebodyToken();
		VerifyStatusCode.ensureCode200();
		VerifyStatusLine.ensureLine200();
		Resultantreport.uPdate_sPecific_RuleConfig();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void RuleConfig_POST_Create_Clone(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		  httprequest = RestAssured.given();
		  // TODO Token Generation and Store it
		  PrePostRequest.tokengeneration(url, str1);
		  withrespectto.createregioninglobal();
		  referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		  VerifyJsonResult.ensurebodyToken();
		  VerifyStatusCode.ensureCode200();
		  VerifyStatusLine.ensureLine200();
		  VerifyJsonID.fromRegionID();
		  // VerifyResponseTime.ensure2(url, str2, str3, str4);
		  Resultantreport.cReateRegion();
		  
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationRuleConfig();
			Subcategory = "Create_RuleConfig";
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			VerifyJsonID.fromRuleConfigID();
			Resultantreport.cReateRuleConfig();

		  httprequest = RestAssured.given();
		  // TODO Token Generation and Store it
		  PrePostRequest.tokengeneration(url, str1);
		  withrespectto.creationRuleConfig_CLONE();
		  Subcategory = "Create_RuleConfig_Clone";
		  referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		  VerifyJsonResult.ensurebodyToken();
		  VerifyStatusCode.ensureCode200();
		  VerifyStatusLine.ensureLine200();
		  // VerifyResponseTime.ensure3(url, str2);
		  VerifyJsonID.fromRuleConfigID();
		  Resultantreport.cReateRuleConfigCLONE();
		  htmlreport.flush();
	  }

	@SuppressWarnings("static-access")
	public static void RuleConfig_POST_Create_CreateNewVersion(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		  httprequest = RestAssured.given();
		  // TODO Token Generation and Store it
		  PrePostRequest.tokengeneration(url, str1);
		  withrespectto.createregioninglobal();
		  referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		  VerifyJsonResult.ensurebodyToken();
		  VerifyStatusCode.ensureCode200();
		  VerifyStatusLine.ensureLine200();
		  VerifyJsonID.fromRegionID();
		  // VerifyResponseTime.ensure2(url, str2, str3, str4);
		  Resultantreport.cReateRegion();
		  
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationRuleConfig();
			Subcategory = "Create_RuleConfig";
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			VerifyJsonID.fromRuleConfigID();
			Resultantreport.cReateRuleConfig();

		  httprequest = RestAssured.given();
		  // TODO Token Generation and Store it
		  PrePostRequest.tokengeneration(url, str1);
		  withrespectto.creationRuleConfig_CreateNewVersion();
		  Subcategory = "Create_RuleConfig_CreateNewVersion";
		  referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		  VerifyJsonResult.ensurebodyToken();
		  VerifyStatusCode.ensureCode200();
		  VerifyStatusLine.ensureLine200();
		  // VerifyResponseTime.ensure3(url, str2);
		  VerifyJsonID.fromRuleConfigID();
		  Resultantreport.cReateRuleConfigCreateNewVersion();
		  htmlreport.flush();
		  
	}

	@SuppressWarnings("static-access")
	public static void RuleConfig_GET_View_IsVersionChangeEnabled(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method Stub Lokeshwaran B Sections and their and Various and Matter
	  
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		  httprequest = RestAssured.given();
		  // TODO Token Generation and Store it
		  PrePostRequest.tokengeneration(url, str1);
		  withrespectto.createregioninglobal();
		  referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		  VerifyJsonResult.ensurebodyToken();
		  VerifyStatusCode.ensureCode200();
		  VerifyStatusLine.ensureLine200();
		  VerifyJsonID.fromRegionID();
		  // VerifyResponseTime.ensure2(url, str2, str3, str4);
		  Resultantreport.cReateRegion();
		  
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationRuleConfig();
			Subcategory = "Create_RuleConfig";
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			VerifyJsonID.fromRuleConfigID();
			Resultantreport.cReateRuleConfig();
			
			 httprequest = RestAssured.given();
			  // TODO Token Generation and Store it
			  PrePostRequest.tokengeneration(url, str1);
			  //withrespectto.creationRuleConfig_CreateNewVersion();
			  Subcategory = "View_RuleConfig_IsVersionChangeEnabled";
			  referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			  VerifyJsonResult.ensurebodyToken();
			  VerifyStatusCode.ensureCode200();
			  VerifyStatusLine.ensureLine200();
			  // VerifyResponseTime.ensure3(url, str2);
			  VerifyJsonID.fromRuleConfigID();
			  Resultantreport.vIewRuleConfigIsVersionChangeEnabled();
			  htmlreport.flush();
	
	}

	@SuppressWarnings("static-access")
	public static void RuleConfig_PUT_Update_StartVersionChange(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		  httprequest = RestAssured.given();
		  // TODO Token Generation and Store it
		  PrePostRequest.tokengeneration(url, str1);
		  withrespectto.createregioninglobal();
		  referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		  VerifyJsonResult.ensurebodyToken();
		  VerifyStatusCode.ensureCode200();
		  VerifyStatusLine.ensureLine200();
		  VerifyJsonID.fromRegionID();
		  // VerifyResponseTime.ensure2(url, str2, str3, str4);
		  Resultantreport.cReateRegion();
		  
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationRuleConfig();
			Subcategory = "Create_RuleConfig";
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			VerifyJsonID.fromRuleConfigID();
			Resultantreport.cReateRuleConfig();
			
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			//withrespectto.creationRuleConfig_CreateNewVersion();
			Subcategory = "Update_RuleConfig_StartVersionChange";
			referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
	        Resultantreport.uPdateRuleConfigStartVersionChange();
			htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void RuleConfig_POST_Create_RollBackVersion(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		  httprequest = RestAssured.given();
		  // TODO Token Generation and Store it
		  PrePostRequest.tokengeneration(url, str1);
		  withrespectto.createregioninglobal();
		  referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		  VerifyJsonResult.ensurebodyToken();
		  VerifyStatusCode.ensureCode200();
		  VerifyStatusLine.ensureLine200();
		  VerifyJsonID.fromRegionID();
		  // VerifyResponseTime.ensure2(url, str2, str3, str4);
		  Resultantreport.cReateRegion();
		  
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationRuleConfig();
			Subcategory = "Create_RuleConfig";
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			VerifyJsonID.fromRuleConfigID();
			Resultantreport.cReateRuleConfig();
			
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			//withrespectto.creationRuleConfig_CreateNewVersion();
			Subcategory = "Create_RuleConfig_RollBackVersion	";
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
	        Resultantreport.cReateRuleConfigRollBackVersion();
			htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void Rule_POST_Create(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		test = htmlreport.createTest(executefile + " ➜ POST Method in " + user)
				.info("SCENARIO ➨ CREATE THE NEW " + executefile + " in " + user);

		  httprequest = RestAssured.given();
		  // TODO Token Generation and Store it
		  PrePostRequest.tokengeneration(url, str1);
		  withrespectto.createregioninglobal();
		  referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		  VerifyJsonResult.ensurebodyToken();
		  VerifyStatusCode.ensureCode200();
		  VerifyStatusLine.ensureLine200();
		  VerifyJsonID.fromRegionID();
		  // VerifyResponseTime.ensure2(url, str2, str3, str4);
		  Resultantreport.cReateRegion();
		  
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationRuleConfig();
			Subcategory = "Create_RuleConfig";
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
			VerifyJsonID.fromRuleConfigID();
			Resultantreport.cReateRuleConfig();
			
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			System.out.println("Monitering....");
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationRule();
			Subcategory="Create_Rule";
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebodyToken();
			VerifyStatusCode.ensureCode200();
			VerifyStatusLine.ensureLine200();
			// VerifyResponseTime.ensure3(url, str2);
	        Resultantreport.cReateRule();
			htmlreport.flush();
	}
}

