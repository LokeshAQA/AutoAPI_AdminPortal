package depend_1.api;

import java.util.List;

import global.api.Environment;

public class ExtractJsonValue extends Environment {

	public static void fromResult() {
		try {
			List<String> extractid = httpresponse.jsonPath().getList("Id");
			// log.debug("JSON IDs ➞➞ "+extractid);
			log.debug("List of Users IDs ➞➞ " + extractid.size());
			UsersID = extractid.get(0);
			log.debug("Index 0 User ID ➞➞ " + UsersID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug("❌ Failling ! 🙁...Exception occur on ID Extraction from Users" + e);
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	public static void entityResult() {
		try {
			List<String> extractKey = httpresponse.jsonPath().getList("Key");
			log.debug("List of EntityKey ➞➞ " + extractKey.size());
			//List<String> extractName = httpresponse.jsonPath().getList("Name");
			//log.debug("List of  EntityName ➞➞ " + extractName.size());
			
			for (int i = 0; i < extractKey.size(); i++) {
				if (extractKey.get(0).contains("entityapi")) {
					String Key0=extractKey.get(0);
				    EntityKey=Key0;
				}
				if (extractKey.get(1).contains("entityapi")) {
					String Key1=extractKey.get(1);
					EntityKey=Key1;
					}
				if (extractKey.get(2).contains("entityapi")) {
					String Key2=extractKey.get(2);
					EntityKey=Key2;
					}
				if (extractKey.get(3).contains("entityapi")) {
					String Key3=extractKey.get(3);
					EntityKey=Key3;
					}
				if (extractKey.get(4).contains("entityapi")) {
					String Key4=extractKey.get(4);
					EntityKey=Key4;
					}
				if (extractKey.get(5).contains("entityapi")) {
					String Key5=extractKey.get(5);
					EntityKey=Key5;
					}
				if (extractKey.get(6).contains("entityapi")) {
					String Key6=extractKey.get(6);
					EntityKey=Key6;
					}
				if (extractKey.get(7).contains("entityapi")) {
					String Key7=extractKey.get(7);
					EntityKey=Key7;
					}
				if (extractKey.get(8).contains("entityapi")) {
					String Key8=extractKey.get(8);
					EntityKey=Key8;
					}
				if (extractKey.get(9).contains("entityapi")) {
					String Key9=extractKey.get(9);
					EntityKey=Key9;
					}
				if (extractKey.get(10).contains("entityapi")) {
					String Key10=extractKey.get(10);
					EntityKey=Key10;
					}
				if (extractKey.get(11).contains("entityapi")) {
					String Key11=extractKey.get(11);
					EntityKey=Key11;
					}
				if (extractKey.get(12).contains("entityapi")) {
					String Key12=extractKey.get(12);
					EntityKey=Key12;
					}
				if (extractKey.get(13).contains("entityapi")) {
					String Key13=extractKey.get(13);
					EntityKey=Key13;
					}
				if (extractKey.get(14).contains("entityapi")) {
					String Key14=extractKey.get(14);
					EntityKey=Key14;
					}
				if (extractKey.get(15).contains("entityapi")) {
					String Key15=extractKey.get(15);
					EntityKey=Key15;
					}
				if (extractKey.get(16).contains("entityapi")) {
					String Key16=extractKey.get(16);
					EntityKey=Key16;
					}
				if (extractKey.get(17).contains("entityapi")) {
					String Key17=extractKey.get(17);
					EntityKey=Key17;
					}
				if (extractKey.get(18).contains("entityapi")) {
					String Key18=extractKey.get(18);
					EntityKey=Key18;
					}
				if (extractKey.get(19).contains("entityapi")) {
					String Key19=extractKey.get(19);
					EntityKey=Key19;
					}
				if (extractKey.get(20).contains("entityapi")) {
					String Key20=extractKey.get(20);
					EntityKey=Key20;
					}
				if (extractKey.get(21).contains("entityapi")) {
					String Key21=extractKey.get(21);
					EntityKey=Key21;
					}
				if (extractKey.get(22).contains("entityapi")) {
					String Key22=extractKey.get(22);
					EntityKey=Key22;
					}
				if (extractKey.get(23).contains("entityapi")) {
					String Key23=extractKey.get(23);
					EntityKey=Key23;
					}
				if (extractKey.get(24).contains("entityapi")) {
					String Key24=extractKey.get(24);
					EntityKey=Key24;
					}
				if (extractKey.get(25).contains("entityapi")) {
					String Key25=extractKey.get(25);
					EntityKey=Key25;
					}
				if (extractKey.get(26).contains("entityapi")) {
					String Key26=extractKey.get(26);
					EntityKey=Key26;
					}
				if (extractKey.get(26).contains("entityapi")) {
					String Key26=extractKey.get(26);
					EntityKey=Key26;
					}
				if (extractKey.get(27).contains("entityapi")) {
					String Key27=extractKey.get(27);
					EntityKey=Key27;
					}
				if (extractKey.get(28).contains("entityapi")) {
					String Key28=extractKey.get(28);
					EntityKey=Key28;
					}
				if (extractKey.get(29).contains("entityapi")) {
					String Key29=extractKey.get(29);
					EntityKey=Key29;
					}
				if (extractKey.get(30).contains("entityapi")) {
					String Key30=extractKey.get(30);
					EntityKey=Key30;
					}
				if (extractKey.get(31).contains("entityapi")) {
					String Key31=extractKey.get(31);
					EntityKey=Key31;
					}
				if (extractKey.get(32).contains("entityapi")) {
					String Key32=extractKey.get(32);
					EntityKey=Key32;
					}
				if (extractKey.get(33).contains("entityapi")) {
					String Key33=extractKey.get(33);
					EntityKey=Key33;
					}
				if (extractKey.get(34).contains("entityapi")) {
					String Key34=extractKey.get(34);
					EntityKey=Key34;
					}
				if (extractKey.get(35).contains("entityapi")) {
					String Key35=extractKey.get(35);
					EntityKey=Key35;
					}
				if (extractKey.get(36).contains("entityapi")) {
					String Key36=extractKey.get(36);
					EntityKey=Key36;
					}
				if (extractKey.get(37).contains("entityapi")) {
					String Key37=extractKey.get(37);
					EntityKey=Key37;
					}
				if (extractKey.get(38).contains("entityapi")) {
					String Key38=extractKey.get(38);
					EntityKey=Key38;
					}
				if (extractKey.get(39).contains("entityapi")) {
					String Key39=extractKey.get(39);
					EntityKey=Key39;
					}
				if (extractKey.get(40).contains("entityapi")) {
					String Key40=extractKey.get(40);
					EntityKey=Key40;
					}
				if (extractKey.get(41).contains("entityapi")) {
					String Key41=extractKey.get(41);
					EntityKey=Key41;
					}
				if (extractKey.get(42).contains("entityapi")) {
					String Key42=extractKey.get(42);
					EntityKey=Key42;
					}
				if (extractKey.get(43).contains("entityapi")) {
					String Key43=extractKey.get(43);
					EntityKey=Key43;
					}
				if (extractKey.get(44).contains("entityapi")) {
					String Key44=extractKey.get(44);
					EntityKey=Key44;
					}
				if (extractKey.get(45).contains("entityapi")) {
					String Key45=extractKey.get(45);
					EntityKey=Key45;
					}
				if (extractKey.get(46).contains("entityapi")) {
					String Key46=extractKey.get(46);
					EntityKey=Key46;
					}
				if (extractKey.get(47).contains("entityapi")) {
					String Key47=extractKey.get(47);
					EntityKey=Key47;
					}
				if (extractKey.get(48).contains("entityapi")) {
					String Key48=extractKey.get(48);
					EntityKey=Key48;
					}
				if (extractKey.get(49).contains("entityapi")) {
					String Key49=extractKey.get(49);
					EntityKey=Key49;
					}
				if (extractKey.get(50).contains("entityapi")) {
					String Key50=extractKey.get(50);
					EntityKey=Key50;
					}
				if (extractKey.get(51).contains("entityapi")) {
					String Key51=extractKey.get(51);
					EntityKey=Key51;
					}
			}
			/*
			 * String EntityKey0 = extractKey.get(0); if
			 * (EntityKey0.contains("(entityapi)")) { EntityKey=EntityKey0; }
			 * 
			 * String EntityKey1 = extractKey.get(1); if
			 * (EntityKey1.contains("(entityapi)")) { EntityKey=EntityKey1; }
			 * 
			 * String EntityKey2 = extractKey.get(2); if
			 * (EntityKey2.contains("(entityapi)")) { EntityKey=EntityKey2; }
			 * 
			 * String EntityKey3 = extractKey.get(3); if
			 * (EntityKey3.contains("(entityapi)")) { EntityKey=EntityKey3; }
			 * 
			 * String EntityKey4 = extractKey.get(4); if
			 * (EntityKey4.contains("(entityapi)")) { EntityKey=EntityKey4; }
			 * 
			 * String EntityKey5 = extractKey.get(5); if
			 * (EntityKey5.contains("(entityapi)")) { EntityKey=EntityKey5; }
			 */
			 

			/*
			 * String EntityKey6 = extractKey.get(6); String Entityname6 =
			 * extractName.get(6); //log.debug("Index 6 EntityKey ➞➞ " + EntityKey6);
			 * //log.debug("Index 6 Entityname ➞➞ " + Entityname6); if
			 * (EntityKey6.contains("(entityapi)")) { EntityKey=EntityKey6; }
			 */
			
			/*
			 * String EntityKey7 = extractKey.get(7); String Entityname7 =
			 * extractName.get(7); //log.debug("Index 7 EntityKey ➞➞ " + EntityKey6);
			 * //log.debug("Index 7 Entityname ➞➞ " + Entityname6); if
			 * (EntityKey7.contains("(entityapi)")) { EntityKey=EntityKey7; }
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug("❌ Failling ! 🙁...Exception occur on EntityKey Extraction from Users " + e);
			e.printStackTrace();
		}

	}

}
