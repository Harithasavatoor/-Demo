package com.capgemini.medicalstoremanagement.controller;


import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.medicalstoremanagement.dao.VisitorDAO;
import com.capgemini.medicalstoremanagement.dao.VisitorDAO1;
import com.capgemini.medicalstoremanagement.dto.VisitorInfo;
import com.capgemini.medicalstoremanagment.daoimp.VisitorDAO1Imp;
import com.capgemini.medicalstoremanagment.daoimp.VisitorDAOImp;
import com.capgemini.medicalstoremanagment.exception.TryToOrder;

public class VisitorApp {
	static Logger log = LogManager.getLogger("main");

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Scanner scanner=new Scanner(System.in);
		int a=0;
			log.debug("Press 1 to UserInformation: ");
			log.debug("Press 2 to MedicineInformation: ");
			log.debug("press 3 Try to order");
			log.debug("Press 4 to Go Back to Home ");
			log.debug("Please enter your choice..");
			a=scanner.nextInt();
		switch(a) {
		case 1:
		VisitorDAOImp visitordao = new VisitorDAOImp();
     	visitordao.detailsInfo();
     	break;
     	//System.out.println(VisitorDAO.visitorinfo.getUserId());
		case 2:
     	VisitorDAO1Imp visitordao1 = new VisitorDAO1Imp();
     	visitordao1.medicineInfo();
     	break;
     	//System.out.println(VisitorDAO1.visitormedinfo.getMedicineId());
		case 3:
			TryToOrder trytoorder=new TryToOrder();
			trytoorder.order("ertu");
			break;
		case 4:
			log.debug("Go Back to Home");
     	       break;
     	default:
     		log.debug("Invalid");
		
	}

}
}