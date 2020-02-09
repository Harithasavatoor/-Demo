package com.capgemini.medicalstoremanagment.daoimp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.medicalstoremanagement.dao.VisitorDAO1;
import com.capgemini.medicalstoremanagement.dto.VisitorMedicineInfo;

public class VisitorDAO1Imp implements VisitorDAO1{
	public void medicineInfo() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstore_db", "root", "root");
			String query = "select * from medicalstoremedicineinfo";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int medicineId = rs.getInt("medicineId");
				String medicineName = rs.getString("medicineName");
				int medicinePrice= rs.getInt("medicinePrice");
				Date medicineExpDate=rs.getDate("medicineMfgDate");
				Date medicineMfgDate =rs.getDate("medicineExpDate");
				String medicineCompany=rs.getString("medicineCompany");
				System.out.println("medicineId: "+medicineId);
				System.out.println("medicineName: "+medicineName);
				System.out.println("medicinePrice: "+medicinePrice);
				System.out.println("medicineExpDate: "+medicineMfgDate);
				System.out.println("medicineMfgDate: "+medicineExpDate);
				System.out.println("medicineCompany: "+medicineCompany);
			//	VisitorMedicineInfo visitormedinfo=new VisitorMedicineInfo();
				visitormedinfo.setMedicineId(rs.getInt("medicineId"));
				visitormedinfo.setMedicineName(rs.getString("medicineName"));
				visitormedinfo.setMedicinePrice(rs.getInt("medicinePrice"));
				visitormedinfo.setMedicineExpDate(rs.getDate("medicineMfgDate"));
				visitormedinfo.setMedicineMfgDate(rs.getDate("medicineExpDate"));
				visitormedinfo.setMedicineCompany(rs.getString("medicineCompany"));
				

			}
		}catch(
		SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

