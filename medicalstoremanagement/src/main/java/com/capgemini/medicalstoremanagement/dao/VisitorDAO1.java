package com.capgemini.medicalstoremanagement.dao;

import com.capgemini.medicalstoremanagement.dto.VisitorMedicineInfo;

public interface VisitorDAO1 {
	static VisitorMedicineInfo visitormedinfo=new VisitorMedicineInfo();
	void medicineInfo() throws InstantiationException, IllegalAccessException, ClassNotFoundException;

}
