package extend.api;

import com.aventstack.extentreports.Status;

import global.api.Environment;

public class Resultantreport extends Environment {

	public static void vAlid_TokenGeneration() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug(" ------------------------✔️👍🏽  Token Generated Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Token Generated Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Token is NOT Generated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Token is NOT Generated in "+user);
		}
	}

	public static void InvAlid_TokenGeneration() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------❌👎 Token is NOT Generated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Token is NOT Generated in "+user);
		} else {
			log.debug("------------------------❌👎 Token is NOT Generated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Token is NOT Generated in "+user);
		}
	}

	public static void cReateRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍  Region Created Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Region Created Successfully in "+user);
			
		} else {
			log.debug("------------------------❌👎 Region is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎  Region is NOT Created in "+user);
		}
	}

	public static void vIewRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Region Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Region Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Region is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Region is NOT Viewed in "+user);
		}
	}

	public static void vIewSpecificRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific Region Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific Region Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific Region is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific Region is NOT Viewed in "+user);
		}
	}

	public static void uPdateRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Region Updated Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Region Updated Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Region is NOT Updated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎  Region is NOT Updated in "+user);
		}
	}

	public static void dEleteRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Region Deleted Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Region Delete Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Region is NOT Deleted in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Region is NOT Deleted in "+user);
		}
	}

	public static void vIewUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 User-Region Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 User-Region Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 User-Region is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 User-Region is NOT Viewed in "+user);
		}
	}

	public static void vIewSpecificUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific User-Region Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific User-Region Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific User-Region is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific User-Region is NOT Viewed in "+user);
		}
	}

	public static void aSSignUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 User-Region Assigned with Specific Region Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 User-Region Assigned with Specific Region Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 User-Region is NOT Assigned in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 User-Region is NOT Assigned in "+user);
		}
	}

	public static void dEleteUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Deleted the Specific Region in UserRegion Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Deleted the Specific Region in UserRegion Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific Region is NOT Deleted in UserRegion "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 User-Region is NOT Deleted in UserRegion "+user);
		}
	}

	public static void vIewJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Jurisdiction Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Jurisdiction Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Jurisdiction is NOT Viewed  in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Jurisdiction is NOT Viewed in "+user);
		}
	}

	public static void cReateJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Jurisdiction Created Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Jurisdiction Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Jurisdiction is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Jurisdiction is NOT Created in "+user);
		}
	}

	public static void uPdateJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Jurisdiction Updated Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Jurisdiction Updated Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Jurisdiction is NOT Updated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Jurisdiction is NOT Updated in "+user);
		}
	}

	public static void dEleteJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Jurisdiction Deleted Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Jurisdiction Deleted Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Jurisdiction is NOT Deleted in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Jurisdiction is NOT Deleted in "+user);
		}
	}

	public static void viewSpecificJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific Jurisdiction Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific Jurisdiction Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific Jurisdiction is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific Jurisdiction is NOT Viewed in "+user);
		}
	}

	public static void vIewGetMyJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 GetMyJurisdiction Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 GetMyJurisdiction Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 GetMyJurisdiction is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 GetMyJurisdiction is NOT Viewed in "+user);
		}
	}

	public static void vIewGetJurisdictions() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific GetJurisdictions Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific GetJurisdictions Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific GetJurisdictions is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific GetJurisdictions is NOT Viewed in "+user);
		}
	}
	public static void AssignUserJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 UserJurisdiction Assigned to Specfic Jurisdiction Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 UserJurisdiction is Assigned to Spceific Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 UserJurisdiction is NOT Assigned to Spceific Jurisdiction in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 UserJurisdiction is NOT Assigned to Spcefic Jurisdiction in "+user);
		}
	}
	public static void DeleteUserJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 UserJurisdiction Deleted the Jurisdiction Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 UserJurisdiction Deleted the Jurisdiction Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 UserJurisdiction is NOT Deleted the  Specific Jurisdiction in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 UserJurisdiction is NOT Deleted the  Specific Jurisdiction in "+user);
		}
	}
	public static void ViewSpecificUserJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific "+Subcategory+" Viewed under UserJurisdiction Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific "+ Subcategory+" Viewed under UserJurisdiction Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific "+Subcategory+" is NOT Viewed under UserJurisdiction in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific "+Subcategory+" is NOT Viewed under UserJurisdiction in "+user);
		}
	}
	public static void GetByJurisdictionID_UserJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 GetMyJurisdictions under Jurisdiction is Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 GetMyJurisdictions under Jurisdiction is Viewed Successfully  in "+user);
		} else {
			log.debug("------------------------❌👎 GetMyJurisdictions under Jurisdiction is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 GetMyJurisdictions under Jurisdiction is NOT Viewed in "+user);
		}
	}
	public static void GetMyJurisdictions_UserJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 GetMyJurisdictions under Jurisdiction is Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 GetMyJurisdictions under Jurisdiction is Viewed Successfully  in "+user);
		} else {
			log.debug("------------------------❌👎 GetMyJurisdictions under Jurisdiction is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 GetMyJurisdictions under Jurisdiction is NOT Viewed in "+user);
		}
	}
	public static void UpdateDefaultJurisdiction_UserJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 UpdateDefaultJurisdiction is Updated Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍UpdateDefaultJurisdiction is Updated Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 UpdateDefaultJurisdiction is NOT Updated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 UpdateDefaultJurisdiction is NOT Updated in "+user);
		}
	}
	public static void viewEntityType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntityType is Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntityType is Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntityType is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntityType is NOT Viewed in "+user);
		}
	}
	public static void cReateEntityType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntityType is Created Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntityType is Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntityType is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntityType is NOT Created in "+user);
		}
	}
	public static void dEleteEntityType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntityType is Deleted Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntityType is Deleted Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntityType is NOT Deleted in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntityType is NOT Deleted in "+user);
		}
	}
	public static void uPdateEntityType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntityType is Updated Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntityType is Updated Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntityType is NOT Updated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntityType is NOT Updated in "+user);
		}
	}
	public static void viewSpecificEntityType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific EntityType is Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific EntityType is Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific EntityType is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific EntityType is NOT Viewed in "+user);
		}
	}
	public static void cReateEntitySubType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntitySubType is Created Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntitySubType is Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntitySubType is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntitySubType is NOT Created in "+user);
		}
	}
	public static void uPdateEntitySubType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntitySubType is Updated Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntitySubType is Updated Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntitySubType is NOT Updated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntitySubType is NOT Updated in "+user);
		}
	}
	public static void DeleteEntitySubType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntitySubType is Deleted Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntitySubType is Deleted Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntitySubType is NOT Deleted in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntitySubType is NOT Deleted in "+user);
		}
	}
	public static void CreateNewVersion_EntitySubType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 CreateNewVersion EntitySubType is Created Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 CreateNewVersion EntitySubType is Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 CreateNewVersion EntitySubType is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 CreateNewVersion EntitySubType is NOT Created in "+user);
		}
	}
	public static void RollbackVersionChanges_EntitySubType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 RollbackVersionChanges EntitySubType is Created Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 RollbackVersionChanges  EntitySubType is Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 RollbackVersionChanges EntitySubType is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 RollbackVersionChanges EntitySubType is NOT Created in "+user);
		}
	}
	public static void GetByEntityTypeID_EntitySubType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 GetByEntityTypeID is Created in EntitySubType Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 GetByEntityTypeID is Created in EntitySubType Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 GetByEntityTypeID is NOT Created in EntitySubType Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 GetByEntityTypeID is NOT Created in EntitySubType Successfully in "+user);
		}
	}
	public static void cReateEntitySubTypeClone() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntitySubTypeClone is Created Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntitySubTypeClone is Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntitySubTypeClone is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntitySubTypeClone is NOT Created in "+user);
		}
	}
	public static void vIewEntitySubType_IsVersionChangeEnabled() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntitySubType_IsVersionChangeEnabled is Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntitySubType_IsVersionChangeEnabled is Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntitySubType_IsVersionChangeEnabled is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntitySubType_IsVersionChangeEnabled is NOT Viewed in "+user);
		}
	}
	public static void vIewEntitySubType_EntityTypeID() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntitySubType_Specific EntityTypeID is Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntitySubType_Specific EntityTypeID is Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntitySubType_Specific EntityTypeID is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntitySubType_Specific EntityTypeID is NOT Viewed in "+user);
		}
	}
	public static void UpdateEntitySubType_StartVersionChange() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 EntitySubType_Start Version Change is Updated Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 EntitySubType_Start Version Change is Updated Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 EntitySubType_Start Version Change is NOT Updated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 EntitySubType_Start Version Change is NOT Updated in "+user);
		}
	}
	public static void CreateEntities() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Entities Created Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Entities Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Entities is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Entities is NOT Created in "+user);
		}
	}
	public static void DeleteEntities() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Entities Deleted Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Entities Deleted Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Entities is NOT Deleted in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Entities is NOT Deleted in "+user);
		}
	}
	public static void View_Specific_Entities() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific Entities Viewed Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific Entities Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific Entities is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific Entities is NOT Viewed in "+user);
		}
	}
	
	public static void Update_Specific_Entities() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific Entities Updated Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific Entities Updated Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific Entities is NOT Updated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific Entities is NOT Updated in "+user);
		}
	}
	public static void View_Specific_Entities_EntitySubType() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific Entities Viewed Include EntitySubType Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific Entities Viewed Include EntitySubType Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific Entities is NOT Viewed Include EntitySubType in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific Entities is NOT Viewed Include EntitySubType in "+user);
		}
	}
	public static void View_Specific_Entities_GetEntityList() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific Entities Viewed Include GetEntityList Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific Entities Viewed Include GetEntityList Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific Entities is NOT Viewed Include GetEntityList in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific Entities is NOT Viewed Include GetEntityList in "+user);
		}
	}
	public static void cReateRuleConfig() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Rule Configuration is Created  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Rule Configuration is Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Rule Configuration is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Rule Configuration is NOT Created in "+user);
		}
	}
	public static void vIEWRuleConfig() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Rule Configuration is Viewed  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Rule Configuration is Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Rule Configuration is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Rule Configuration is NOT Viewed in "+user);
		}
	}
	public static void vIEW_sPecific_RuleConfig() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific Rule Configuration is Viewed  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific Rule Configuration is Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific Rule Configuration is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific Rule Configuration is NOT Viewed in "+user);
		}
	}
	public static void dElete_sPecific_RuleConfig() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific Rule Configuration is Deleted  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific Rule Configuration is Deleted Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific Rule Configuration is NOT Deletd in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific Rule Configuration is NOT Deleted in "+user);
		}
	}
	public static void uPdate_sPecific_RuleConfig() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Specific Rule Configuration is Updated  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Specific Rule Configuration is Updated Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Specific Rule Configuration is NOT Updated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Specific Rule Configuration is NOT Updated in "+user);
		}
	}

	public static void cReateRuleConfigCLONE() {
		// TODO Auto-generated method stub
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 CLONE Rule Configuration is Created  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 CLONE Rule Configuration is Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 CLONE Rule Configuration is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 CLONE Rule Configuration is NOT Created in "+user);
		}
	}

	public static void cReateRuleConfigCreateNewVersion() {
		// TODO Auto-generated method stub
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 CreateNewVersion Rule Configuration is Created  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 CreateNewVersion Rule Configuration is Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 CreateNewVersion Rule Configuration is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 CreateNewVersion Rule Configuration is NOT Created in "+user);
		}
	}
	public static void vIewRuleConfigIsVersionChangeEnabled() {
		// TODO Auto-generated method stub
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 IsVersionChangeEnabled in Rule Configuration is Viewed  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 IsVersionChangeEnabled in Rule Configuration is Viewed Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 IsVersionChangeEnabled in Rule Configuration is NOT Viewed in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 IsVersionChangeEnabled in Rule Configuration is NOT Viewed in "+user);
		}
	}
	public static void uPdateRuleConfigStartVersionChange() {
		// TODO Auto-generated method stub
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 StartVersionChange in Rule Configuration is Updated  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 StartVersionChange in Rule Configuration is Updated Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 StartVersionChange in Rule Configuration is NOT Updated in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 StartVersionChange in Rule Configuration is NOT Updated in "+user);
		}
	}
	public static void cReateRuleConfigRollBackVersion() {
		// TODO Auto-generated method stub
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 RollBackVersion in Rule Configuration is Created  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 RollBackVersion in Rule Configuration is Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 RollBackVersion in Rule Configuration is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 RollBackVersion in Rule Configuration is NOT Created in "+user);
		}
	}
	public static void cReateRule() {
		// TODO Auto-generated method stub
		if (extendFinalOutput.equals("Pass")) {
			log.debug("------------------------✔️👍 Rule is Created  Successfully in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------✔️👍 Rule is Created Successfully in "+user);
		} else {
			log.debug("------------------------❌👎 Rule is NOT Created in "+user);
			System.out.println();
			test.log(Status.INFO, "------------------------❌👎 Rule is NOT Created in "+user);
		}
	}
	
}
