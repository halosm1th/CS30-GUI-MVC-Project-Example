package HospitalMVC;

/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: GUI and MVC example project
 * Program Name:  hospitalGUIMain
 *
 * Description: the main method for the hospital gui projec, all it really does
 *                      is launch the gui and create an instance of the controller
 *
 * Input: data to be input
 *
 * Output: results to be output
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class hospitalGUIMain {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
    	
    // create instances of objects for i/o and formatting
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    
    	System.out.println("*******************************************");
    	System.out.println("Name:		your name here");
    	System.out.println("Class:		CS20S");
    	System.out.println("Assignment:	Ax Qy");
    	System.out.println("*******************************************");

    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		your name here\n";
    	bannerOut += "Class:		CS20S\n";
    	bannerOut += "Assignment:	Ax Qy\n";
    	bannerOut += "*******************************************\n\n";
    	
    	fout.println("*******************************************");
    	fout.println("Name:		your name here");
    	fout.println("Class:		CS20S");
    	fout.println("Assignment:	Ax Qy");
    	fout.println("*******************************************");
 	    	
    // ************************ get input **********************

    /*	prompt = "Enter your prompt text here. \n";	
    	prompt += "you may need to add additional lines\n";
    	prompt += "or delete some of these prompt lines.\n\n";
    
    	
    	strin = JOptionPane.showInputDialog(bannerOut + prompt);	 
    */
    	/* **********************************
    	 * split the input string into tokens
    	 * use the value in delim as the delimieter
    	 * uncomment the line to use it.
    	 ************************************/
    	//String[] tokens = strin.split(delim);
    	

    // ************************ processing ***************************
    
        PatientGUI patientUI = new PatientGUI();
        patientUI.setVisible(true);
        
    // ************************ print output ****************************

    
        // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
}  // end class
