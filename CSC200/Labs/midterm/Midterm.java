package midterm;

import java.util.*; 

public class Midterm {

	public static void main(String[] args) {
        double convertEuro = .78, convertPounds=.61,  
                convertPeso = 8.4, convertZloty = 3.26; 


double moreDollars;   //  will define how much the dollars need to be reduced to get whole number currency
                    
//  request dollars

Scanner getData = new Scanner(System.in);
System.out.println("Enter dollars to convert");   
double dollars = getData.nextDouble();  //captialized the "double"                                                                       
// validate dollar number is in range


	if (dollars < 50.)System.out.println(" Must be more than $50");
  else {     // else 1
        if (dollars >  500. && dollars != 750) System.out.println( "Must be less than or equal to $500 or $750"); //value can be equal to 500
                        
        else {                // else 2
    
//request which currency
  
          System.out.println("Enter integer for currency using  Euros = 1 and British pounds = 2 and  Argentine Peso = 3 and Polish Zloty = 4");
           int curType = getData.nextInt();
           
           getData.close();    ///closes the scanner input class getData created to get inputs
        
// make sure the currency is correct value and then calculate how much currency for the dollars entered                  
           
           if (curType >4 || curType == 0) System.out.println (" No such currency"); // SINGLE = SIGN   //when comparing use "=="       
           else {   //else 3
                switch (curType){
                case 1: {         
                      double foreignCash = dollars * convertEuro;
                       if (foreignCash > (int)foreignCash){
                           moreDollars = (foreignCash - (int) foreignCash) * (1/convertEuro);
                            
                           moreDollars = ((((int)(moreDollars*1000)) + 5) / 10)/100.; 
                       
                           System.out.println (" Need " + (dollars - moreDollars) + " to buy exactly  " + (int)foreignCash +  "  Euros");
                        }
                      else System.out.println ("You get " + foreignCash + " Euros"); //added the missing end (") mark                                
                       break;
                }  // case 1
                case 2:  {
                      double foreignCash = dollars * convertPounds; //variable is declared as "convertPounds" not "convertPound"
                       if (foreignCash > (int)foreignCash){

                      	 moreDollars = (foreignCash - (int) foreignCash) * (1/convertPounds); //variable is declared as "convertPounds" not "convertPound"
                            


                             moreDollars = ((((int)(moreDollars*1000)) + 5) / 10)/100.; //divide by "100."  to convert to double
                             
                                                    

                           System.out.println (" Need " + (dollars - moreDollars) + " to buy exactly  " + (int)foreignCash +  "  Pounds");
                        }
                      else System.out.println ("You get " + foreignCash + " Pounds");
                       break;
                		}  // case 2
                case 3:  {      //lowercase "c" 
                	double foreignCash = dollars * convertPeso; //never defined foreignCash
                       if (foreignCash > (int)foreignCash){
                           moreDollars = (foreignCash - (int) foreignCash) * (1/convertPeso);
                            moreDollars = ((((int)(moreDollars*1000)) + 5) / 10)/100.; 
                           System.out.println (" Need " + (dollars - moreDollars) + " to buy exactly  " + (int)foreignCash +  "  Pesos"); //dollars - moreDollars
                           
                                    }
                      else System.out.println ("You get " + foreignCash + " Pesos"); 
                       break;
                }  // case 3
                		case 4:  {
                      double foreignCash = dollars * convertZloty;
                       if (foreignCash > (int)foreignCash){
                           moreDollars = (foreignCash - (int) foreignCash) * (1/convertZloty);
                            moreDollars = ((((int)(moreDollars*1000)) + 5) / 10)/100.; 
                           System.out.println (" Need " + (dollars - moreDollars) + " to buy exactly  " + (int)foreignCash +  "  Zloty");
                        }
                      else System.out.println ("You get " + foreignCash + " Zloty");
                       break;             
                      }//case 4
                }  // switch
                
           }  // else 3
    }  // else 2
}  //else 1





	}

}
