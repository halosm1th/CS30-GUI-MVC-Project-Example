package HospitalMVC;
/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	GUi MVC example, hospital bill calculator
 *
 * Description:	use a Gui and MVC to build an app that uses a gui 
to enter patient info, dispplay patient info and calculate 
patient bills
 *
 * 
 * *************************************************************
 */
 // import files here as needed
 public class Patient
 {  // begin class
     // class variables 
     
     private static int nextID = 1000;                      // next patient id number

    // *********** class constants **********
     
     // constant values for individual daily rates for rooms and services
     private static final int icRoomRate = 395;
     private static final int privateRoomRate = 350;
     private static final int doubleRoomRate = 310;
     
     private static final int privateNurseRate = 275;
     private static final int semiPrivateNurseRate = 250;
     
     private static final int tvRate = 40;
     private static final int phoneRate = 16;

    // ********** instance variable **********
     
     private String firstName;
     private String lastName;
     
     private int days = 0;                                  // days in hospital
     private int id = 0;                                    // unique patient id number
     
     // variables to hold service codes
     private char roomType;
     private char nurseType;
     private char tvType;
     private char phoneType;
     
     // variables to hold individual charges?
     private int roomCost;
     private int nurseCost;
     private int tvCost;
     private int phoneCost;

    // ********** constructors ***********
     
     public Patient(){
         id = nextID++;                                     // assign id and increment global next id value
         days = 0;                                          // set days to 0
         
         roomType = 'D';
         nurseType = 'X';
         tvType = 'X';
         phoneType = 'X';
         
         System.out.println("creating new patient.");
     } // end default construcor
     
     public Patient(String fn,                              //first name
                                String ln,                  // last name
                                int d,                      // days
                                char rt,                    // room type
                                char nt,                    // nurse type
                                char tvt,                   // tv type
                                char pt){                   // phone type
         firstName = fn;
         lastName = ln;
         
         id = nextID++;                                     // assign id and increment global next id value
         days =d;                                           // set days to 
         
         roomType = rt;
         nurseType = nt;
         tvType = tvt;
         phoneType = pt;
         
         System.out.println("creating new patient.");         
     } // end initialized constructor

    // ********** accessors **********

    //*****************************************************
    // Purpose: calculate and return the total cost of the room
    // Interface: IN: na
    // Returns: room bill
    // *****************************************************   
     public int getRoomCost(){
         int roomCost = 0;
         
         switch (roomType) {
             case 'I':
                 roomCost = icRoomRate * days;
                 break;
             case 'P':
                 roomCost = privateRoomRate * days;
                 break;
             default:
                 roomCost = doubleRoomRate * days;
                 break;
         }
         return roomCost;
     } // end get room cost
     
    //*****************************************************
    // Purpose: calculate and return the total cost of the nurse
    // Interface: IN: na
    // Returns: nurse bill
    // *****************************************************   
     public int getNurseCost(){
         int nurseCost = 0;
         
         switch (nurseType) {
             case 'X':
                 nurseCost = 0;
                 break;
             case 'N':
                 nurseCost = privateNurseRate * days;
                 break;
             default:
                 nurseCost = semiPrivateNurseRate * days;
                 break;
         }
         return nurseCost;
     } // end get nure cost
     
    //*****************************************************
    // Purpose: calculate and return the total cost of the tv services
    // Interface: IN: na
    // Returns: tv bill
    // *****************************************************   
     public int getTVCost(){
         int tvCost = 0;
         
         if(tvType == 'X')
             tvCost = 0;
         else
              tvCost = tvRate * days;
             
         return tvCost;
     } // end get tv cost
     
    //*****************************************************
    // Purpose: calculate and return the total cost of the phone services
    // Interface: IN: na
    // Returns: tv bill
    // *****************************************************   
     public int getPhoneCost(){
         int phoneCost = 0;
         
         if(phoneType == 'X')
             phoneCost = 0;
         else
              phoneCost = phoneRate * days;
             
         return phoneCost;
     } // end get phone cost
     
    //*****************************************************
    // Purpose: calculate and return the total bill
    // Interface: IN: na
    // Returns: total bill
    // *****************************************************
     public int getTotalBill(){
        return this.getRoomCost() + this.getNurseCost() + this.getTVCost() + this.getPhoneCost();
     } // end get total bill
     
    // *****************************************************   
     
    // ********** mutators **********
    //*****************************************************
    // Purpose: change the room type code for a patient
    // Interface: IN: new room type code
    // Returns: na
    // *****************************************************
     public void setRoomType(char rt){
        roomType = rt;
     } // end set room type
     
    //*****************************************************
    // Purpose: change the nusre type code for a patient
    // Interface: IN: new nurse type code
    // Returns: na
    // *****************************************************
     public void setNurseType(char nt){
        nurseType = nt;
     } // end set nurse type    
     
    //*****************************************************
    // Purpose: change the tv type code for a patient
    // Interface: IN: new tv type code
    // Returns: na
    // *****************************************************
     public void setTVType(char tvt){
        tvType = tvt;
     } // end set tv type
     
    //*****************************************************
    // Purpose: change the phone type code for a patient
    // Interface: IN: new phone type code
    // Returns: na
    // *****************************************************
     public void setPhoneType(char pt){
        phoneType = pt;
     } // end set phone type
     
     // remember to add a method to set next id after a list is loded from disk
     
 }  // end class
