package com.gregorian;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class GregorianCalenderEx {

	public static void main(String[] args) throws DatatypeConfigurationException {
	
		 XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance()
		            .newXMLGregorianCalendar(2024,06,27,10,15,12,0,0);
		 
		 XMLGregorianCalendar xmlDate2= xmlDate;

		        // Convert XMLGregorianCalendar to Date
		        Date date = xmlDate2.toGregorianCalendar().getTime();
		        
		        System.out.println(date);

		        // Specify the desired date format
		        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		        System.out.println(date);

		        // Format the Date object to the desired string representation
		        String formattedDate = dateFormat.format(date);

		        System.out.println("Formatted Date: " + formattedDate);

	}

}
