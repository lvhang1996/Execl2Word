package controller;

import com.deepoove.poi.data.MiniTableRenderData;
import com.deepoove.poi.data.PictureRenderData;
import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.TextRenderData;
import model.Student;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.util.Arrays;

public class ExeclTo {

    public void execl(Student student) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("D:\\Test\\IDEA\\Execl2Word\\testE.xlsx"));
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFRow row = sheet.getRow(1);
//        for (int i=1;i<2;i++){
//            XSSFCell cell = row.getCell(i);
//            cell.setCellType(CellType.STRING);
//            System.out.println(cell.getStringCellValue());
//        }
        XSSFCell cell1 = row.getCell(1);
        cell1.setCellType(CellType.STRING);
        student.setName(cell1.getStringCellValue());

        XSSFCell cell2 = row.getCell(4);
        cell2.setCellType(CellType.STRING);
        student.setSex(cell2.getStringCellValue());

        student.setImage(new PictureRenderData(160, 230,"src\\images\\1.jpg"));

        RowRenderData header = RowRenderData.build(new TextRenderData("时间"), new TextRenderData("学校名称"),new TextRenderData("专业"));

        RowRenderData row0 = RowRenderData.build("2010.09-2014.07", "江西科技学院","国际经济与贸易");
        student.setEducationTable(new MiniTableRenderData(header, Arrays.asList(row0)));

//        //判断是否为空
//        RowRenderData row0 = RowRenderData.build("2010.09-2014.07", "江西科技学院","国际经济与贸易");
//        RowRenderData row1 = RowRenderData.build("2010.09-2014.07", "江西科技学院","国际经济与贸易");
//        student.setEducationTable(new MiniTableRenderData(header, Arrays.asList(row0,row1)));
//        //if内接着判断
//        RowRenderData row0 = RowRenderData.build("2010.09-2014.07", "江西科技学院","国际经济与贸易");
//        RowRenderData row1 = RowRenderData.build("2010.09-2014.07", "江西科技学院","国际经济与贸易");
//        RowRenderData row2 = RowRenderData.build("2010.09-2014.07", "江西科技学院","国际经济与贸易");
//        student.setEducationTable(new MiniTableRenderData(header, Arrays.asList(row0,row1,row2)));
    }

}
