package com.tyk.second.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.second.dao.ReportDao;

@Service
public class ReportService {
	private ReportDao dao;
	public ReportDao getDao() {
		return dao;
	}
//	@Autowired
//	@Qualifier("di")
//	public void setDao(ReportDao dao) {
//		System.out.println("Set Dao settrer");
//		this.dao = dao;
//	}
	
	public void generateData()
	{
		String findData = dao.findData();
		System.out.println("Generating Report");
		System.out.println(findData);
	}
@Autowired	
public ReportService(ReportDao dao) {
	
	this.dao = dao;
}
public ReportService() {
	System.out.println("O Param Constructor");
}

	
}
