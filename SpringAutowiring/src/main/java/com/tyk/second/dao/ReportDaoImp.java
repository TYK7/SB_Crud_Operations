package com.tyk.second.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class ReportDaoImp implements ReportDao {
	public ReportDaoImp() {
		System.out.println("ReportDaoImp:: Connstructor");
	}

	
	public String findData() {
		System.out.println("Fetching Data from db....");
				return "Reporting Data";
	}

}
