package com.learn.export.excel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import java.util.Vector;
/*
 * @Author Daybreak 
 *  2018年1月22日
 */
public class DBtoExcelTest {
	/*
	 * @param args
	 */
	@SuppressWarnings("all")
	public static void main(String[] args) {
		    String DRIVER = "com.mysql.jdbc.Driver";  
	        String URL = "jdbc:mysql://localhost:3306/exportexcel";  
	        String USERNAME = "root";  
	        String USERPASSWORD = "123456";  
	        // 查询语句  
	        String sql = "Select * from Person"; 
	        // 列名
	        List list=new ArrayList();
	        list.add("编号");
	        list.add("姓名");
	        list.add("性别");
	        list.add("地址");
	        list.add("职业");
	        list.add("学历");
//	        Vector columnName = new Vector(); // 列名   
//	        columnName.add("编号");  
//	        columnName.add("姓名");  
//	        columnName.add("性别");  
//	        columnName.add("地址");  
//	        columnName.add("职业");  
//	        columnName.add("学历");        
	        // 连接数据库  
	        try {
				Class.forName(DRIVER);
			} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			}
	        Connection conn = null;
			try {
				conn = DriverManager.getConnection(URL,USERNAME,USERPASSWORD);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}  
	        PreparedStatement ps = null;
			try {
				ps = conn.prepareStatement(sql);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}  
	        ResultSet rs = null;
			try {
				rs = ps.executeQuery();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}  
	        // 导出文件  
	         DBtoExcelUtil.WriteExcel(rs, "person.xls", "人物信息", list);   
	}

}
