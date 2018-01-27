package com.learn.excel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

/*
 * @author Daybreak
 *  2018年1月20日
 * 
 */
public class CommonExcelDemo {

	/*
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 HttpServletResponse response=null;
		    String title = "省市信息表";
		    String[] rowsName = new String[]{"区域","省份","人口","面积","GDP","气候"};
		    List<Object[]>  dataList = new ArrayList<Object[]>();
		    Object[] objs = null;
		    for (int i = 0; i < 10; i++) {
		        objs = new Object[rowsName.length];
		        objs[0] = i;
		        objs[1] = i;
		        objs[2] = i;
		        objs[3] = i;
		        objs[4] = i;
		        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        String date = df.format(new Date());
		        objs[5] = date;
		        dataList.add(objs);
		    }
		    String fileName="省市信息表-"+String.valueOf(System.currentTimeMillis()).substring(4,13)+".xls";
		    CommonExcel ex = new CommonExcel(title, rowsName, dataList,response,fileName);
		    ex.downloadExcel();

}
}
