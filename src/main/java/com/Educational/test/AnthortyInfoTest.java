package com.Educational.test;

import com.Educational.entity.AnthortyInfo;
import com.Educational.entity.StudentInfo;
import com.Educational.entity.UploadFile;
import com.Educational.service.AnthortyInfoService;
import com.Educational.service.StudentInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author q
 * @create 2019- 05- 26 15:02
 */
public class AnthortyInfoTest {
      ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContent.xml");
      @Test
      public void test(){

       /*   AnthortyInfoService service=ac.getBean(AnthortyInfoService.class);
          AnthortyInfo anthortyInfo=new AnthortyInfo();
          anthortyInfo.setAnthortyName("test");
          Integer save = service.save(anthortyInfo);
          System.out.println(save);*/

          StudentInfoService service=ac.getBean(StudentInfoService.class);
          StudentInfo studentInfo=new StudentInfo();
          studentInfo.setStudentNo("201700000404");//学生已学号登录
          studentInfo.setStudentPassword("1");
          StudentInfo queryOne = service.queryOne(studentInfo);
          System.out.println(queryOne);
      }

    @Test
    public void queryOne(){
      /*  UploadFileService bean = ac.getBean(UploadFileService.class);
        UploadFile u = new UploadFile();
        u.setFileName("wuwenjian");
        Integer save = bean.save(u);
        System.out.println(save);*/
     /*   System.out.println("studentInfoService="+studentInfoService);
        System.out.println("13212");
        StudentInfo employee = new   StudentInfo();
        StudentInfo employee1 =studentInfoService.queryOne(employee);
        System.out.println("employee1="+employee1);*/
    }

}
