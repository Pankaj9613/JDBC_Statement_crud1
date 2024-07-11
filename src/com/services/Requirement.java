package com.services;

public interface Requirement {
    void createTable()throws Exception ;
	void insertData() throws Exception;
	void viewSingleData() throws Exception ;
	void viewAllData() throws Exception ;
	void updateData()throws Exception;
	void deleteSingleData() throws Exception;
	void deleteAllData()throws Exception;
	void deleteData() throws Exception;
	

}
