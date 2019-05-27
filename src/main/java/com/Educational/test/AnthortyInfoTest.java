package com.Educational.test;

import com.Educational.entity.AnthortyInfo;
import com.Educational.entity.UploadFile;
import com.Educational.service.AnthortyInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.mybatis.mapper.entity.Example;

/**
 * @author q
 * @create 2019- 05- 26 15:02
 */
public class AnthortyInfoTest {
      ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContent.xml");
      @Test
      public void test(){

          AnthortyInfoService service=ac.getBean(AnthortyInfoService.class);
          AnthortyInfo anthortyInfo=new AnthortyInfo();
           Example example = new Example(AnthortyInfo.class);
          example.orderBy("anthortyPid").desc();
          service.queryEmpListByExamle(example);

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
