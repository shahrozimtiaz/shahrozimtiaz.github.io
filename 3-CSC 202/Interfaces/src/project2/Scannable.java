 /**
 * This is my description of my Scannable Interface. It has 2 methods.
 *
 * @author Shahroz Imtiaz
 * @version 1.0
 * @since 09/4/2017
 */

package project2;

public interface Scannable {
	public static final String EMPTY_BARCODE = "000000000000";

	default public String getBarcode() {
		return EMPTY_BARCODE;
	}//getBarcode()
	public static String generateBarcode(String name) {

		String charNumName;
		String threeNum;
		String addedGroupsName;

		if(name != null) {
			//name = name.toUpperCase();
			charNumName = "";
			for(int i = 0;i<=name.length()-1;i++) {
				switch(name.toUpperCase().charAt(i)) {
				case 'A': charNumName += "01"; 
					break;
				case 'B': charNumName += "02";
					break;
				case 'C': charNumName += "03"; 
					break;
				case 'D': charNumName += "04"; 
					break;
				case 'E': charNumName += "05"; 
					break;
				case 'F': charNumName += "06"; 
					break;
				case 'G': charNumName += "07";
					break;
				case 'H': charNumName += "08";
					break;
				case 'I': charNumName += "09"; 
					break;
				case 'J': charNumName += "10"; 
					break;
				case 'K': charNumName += "11"; 
					break;
				case 'L': charNumName += "12"; 
					break;
				case 'M': charNumName += "13"; 
					break;
				case 'N': charNumName += "14"; 
					break;
				case 'O': charNumName += "15"; 
					break;
				case 'P': charNumName += "16"; 
					break;
				case 'Q': charNumName += "17"; 
					break;
				case 'R': charNumName += "18"; 
					break;
				case 'S': charNumName += "19"; 
					break;
				case 'T': charNumName += "20"; 
					break;
				case 'U': charNumName += "21"; 
					break;
				case 'V': charNumName += "22"; 
					break;
				case 'W': charNumName += "23"; 
					break;
				case 'X': charNumName += "24"; 
					break;
				case 'Y': charNumName += "25"; 
					break;
				case 'Z': charNumName += "26"; 
					break;
						default: charNumName += "00"; 
				}//switch
			}//for loop
			while(charNumName.length()%6 !=0) {
				charNumName += "0";
			}
			charNumName += "0";

			addedGroupsName = "";
			int t = 0;
			int count = 1;
			int num1,num2,num3;

			while(t<=charNumName.length()-4) {
				threeNum = "";
				
				if(count==1) {
					threeNum = charNumName.substring(t, t+=6);

					num1 = Integer.parseInt(threeNum.substring(0,2));
					num2 = Integer.parseInt(threeNum.substring(2,4));
					num3 = Integer.parseInt(threeNum.substring(4));
				}
				else {
					threeNum = charNumName.substring(t-=2, t+=6);

					num1 = Integer.parseInt(threeNum.substring(0,2));
					num2 = Integer.parseInt(threeNum.substring(2,4));
					num3 = Integer.parseInt(threeNum.substring(4));
				}
				count++;
				int total = num1+num2+num3;

				if(total<10) {
					addedGroupsName += "0" + String.valueOf(total);
				}
				else{
					addedGroupsName += String.valueOf(total);
				}
			}
			if(addedGroupsName.length()<12) {
				int l = addedGroupsName.length();
				for(int i = 1;i<=12-l;i++) {
					addedGroupsName += "0";
				}
			}
			if(addedGroupsName.length()>12) {
				addedGroupsName = addedGroupsName.substring(0, 13);
			}
			return addedGroupsName;
		}//big if statement
		return name;
	}//generateBarcode
}//class