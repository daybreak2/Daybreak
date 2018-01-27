package com.learn.export.excel;
import java.io.File;   
import jxl.*;   
import jxl.write.*;  
import jxl.write.biff.RowsExceededException;  
import java.sql.*;  
import java.util.*; 
/*
 * @Author Daybreak 
 *  2018年1月22日
 */
public class DBtoExcelUtil {
	  /*
     * 导出Excel表 
     * @param rs 数据库结果集 
     * @param filePath 要保存的路径，文件名为 fileName.xls 
     * @param sheetName 工作簿名称 工作簿名称，本方法目前只支持导出一个Excel工作簿 
     * @param columnName 列名，类型为Vector 
     */  
	 @SuppressWarnings("all")
    public static void WriteExcel(ResultSet rs, String filePath, String sheetName, List list) {  
        WritableWorkbook workbook = null;  
        WritableSheet sheet = null;  
        int rowNum = 1; // 从第一行开始写入  
        try {  
            workbook = Workbook.createWorkbook(new File(filePath)); // 创建Excel文件  
            sheet = workbook.createSheet(sheetName, 0); // 创建名为 sheetName 的工作簿    
            DBtoExcelUtil.writeCol(sheet, list, 0); // 首先将列名写入  
            // 将结果集写入  
            while(rs.next()) {  
                List col=new ArrayList();
                //Vector col = new Vector(); // 用以保存一行数据  
                for(int i = 1; i <= list.size(); i++) { // 将一行内容保存在col中  
                    col.add(rs.getString(i));  
                }  
                // 写入Excel  
                DBtoExcelUtil.writeCol(sheet, col, rowNum++);  
            }  
        }catch(Exception e) {  
            e.printStackTrace();  
        }  
        finally {  
            try {  
                // 关闭  
                workbook.write();  
                workbook.close();  
                rs.close();  
            }catch(Exception e) {  
                e.printStackTrace();  
            }  
        }  
    }  
    /*
     * 将数组写入工作簿  
     * @param sheet 要写入的工作簿 
     * @param col 要写入的数据数组 
     * @param rowNum 要写入哪一行 
     * @throws WriteException  
     * @throws RowsExceededException  
     */  
	 @SuppressWarnings("all")
    private static void writeCol(WritableSheet sheet, List col, int rowNum) throws RowsExceededException, WriteException {  
        int size = col.size(); // 获取集合大小  
        for(int i = 0; i < size; i++) { // 写入每一列  
            Label label = new Label(i, rowNum, (String) col.get(i));   
            sheet.addCell(label);  
        }  
    }  
}
