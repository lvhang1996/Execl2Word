package controller;

import com.deepoove.poi.XWPFTemplate;
import model.Student;
import java.io.FileOutputStream;

public class ToWord {

    public void word(Student student)  throws Exception{
        XWPFTemplate template = XWPFTemplate.compile("Test.docx").render(student);
        FileOutputStream out = new FileOutputStream(student.getName()+".docx");
        template.write(out);
        out.flush();
        out.close();
        template.close();
    }
}
