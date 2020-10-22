package com.entity;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.ArrayList;
/*读 表 ，表的每一行为 一个插入对象，此时为一个User对象。
调用 UploadFileDao insert 方法，插入数据库 。
* */
public class UploadFile {
    //返回User 集合，参数为 表格的绝对地址
    public ArrayList<User> getUserList(String fileDir){
        ReadTables readTables = new ReadTables();
        Workbook wb = readTables.readExcel(fileDir);
        Row row = null;
        ArrayList<User> userList = new ArrayList<>();
        if(wb!=null){
            //从 表格文件的第一页，可以指定表格文件格式。
            Sheet sheet = wb.getSheetAt(0);
            //获取 此页行数
            int rowNum = sheet.getPhysicalNumberOfRows();
            for(int i=1;i<rowNum;i++){
                row = sheet.getRow(i); //获取 行内容，注意第一行为表头，判断是否为空
                if(row == null) break;
                User user = new User();
                //userID	userName	userPwd	userType	userClass	userGrade	userMajor
                //第0          1           2       3             4           5            6   列
                user.setUserID((String) readTables.getCellFormatValue(row.getCell(0)));
                user.setUserName((String) readTables.getCellFormatValue(row.getCell(1)));
                user.setUserPwd((String) readTables.getCellFormatValue(row.getCell(2)));
                user.setUserType(strToint((String) readTables.getCellFormatValue(row.getCell(3))));
                user.setUserClass((String) readTables.getCellFormatValue(row.getCell(4)));
                user.setUserGrade(strToint((String) readTables.getCellFormatValue(row.getCell(5))));
                user.setUserMajor((String) readTables.getCellFormatValue(row.getCell(6)));
                userList.add(user);
            }

        }
        return userList;
    }
private int strToint(String str){
        return Double.valueOf(str).intValue();
}
}
