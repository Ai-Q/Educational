/*
package com.Educational.test;

import com.Educational.entity.UploadFile;

import com.Educational.service.UploadFileService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

*/
/**
 * @authorshkstart
 * @create2019-05-2518:05
 *//*

public class EmployeeMapperTest {
    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContent.xml");




    @Test
    public void queryOne(){
         UploadFileService bean = app.getBean(UploadFileService.class);
        UploadFile u = new UploadFile();
       u.setFileName("wuwenjian");
        Integer save = bean.save(u);
        System.out.println(save);
     */
/*   System.out.println("studentInfoService="+studentInfoService);
        System.out.println("13212");
        StudentInfo employee = new   StudentInfo();
        StudentInfo employee1 =studentInfoService.queryOne(employee);
        System.out.println("employee1="+employee1);*//*

    }
   */
/* *//*
*/
/**
     * 查询集合
     * @param
     * @return
     *//*
*/
/*
    @Test
    public void queryList(){
        Employee employee = new Employee(1,null,null,null);
        List<Employee> employees = employeeService.queryList(null);
        int i=1;
        for(Employee employee1:employees){
            System.out.println("index["+(i++)+"]"+employee1);
        }

    }
    *//*
*/
/**
     * 查询所有集合
     * @param
     * @return
     *//*
*/
/*
    @Test
    public void queryAllList(){
        List<Employee> employees = employeeService.queryAllList();
        int i=1;
        for(Employee employee1:employees){
            System.out.println("index["+(i++)+"]"+employee1);
        }
    }

    *//*
*/
/**
     * 查询数量
     * @param
     * @return
     *//*
*/
/*
    @Test
    public void queryCount(){
        int i = employeeService.queryCount(null);
        System.out.println("数量="+i);
    }
    *//*
*/
/**
     * 根据主键id查询数据
     * @param
     * @return
     *//*
*/
/*
    @Test
    public void queryByPrimaryKey(){
        Employee employee = employeeService.queryByPrimaryKey(3);
        System.out.println("根据id:"+employee);
    }
    *//*
*/
/**
     * 判断主键是否存在
     * @param
     * @return
     *//*
*/
/*
    @Test
    public void existsWithPrimaryKey(){
        boolean b = employeeService.existsWithPrimaryKey(3);
        System.out.println("是否存在："+b);
    }




    *//*
*/
/**
     * 新增数据
     * @param
     * @return 受影响数据行数
     *//*
*/
/*
    @Test
    public void save(){
        Employee employee = new Employee(10,"黄毛",null,20);
        Integer save = employeeService.save(employee);
        System.out.println(save);
    }

    *//*
*/
/**
     * 新增数据 不为null的数据作为参数插入
     * @param
     * @return 受影响数据行数
     *//*
*/
/*
    @Test
   public void saveSelective(){
        Employee employee = new Employee(null,"黄毛",null,20);
        Integer save = employeeService.save(employee);
        System.out.println(save);
    }




    *//*
*/
/**
     * 更新数据
     * @param
     * @return 受影响数据行数
     *//*
*/
/*
    @Test
    public void update(){
        Employee employee = new Employee(11,"xiuixn",null,20);
        Integer update = employeeService.update(employee);
        System.out.println(update);
    }
    *//*
*/
/**
     * 新增数据 不为null的数据作为参数插入
     * @param
     * @return
     *//*
*/
/*
    @Test
    public void updateSelective(){
        Employee employee = new Employee(11,"邱鑫",null,20);
        Integer update = employeeService.updateSelective(employee);
        System.out.println(update);
    }



    *//*
*/
/**
     * 删除数据
     * @param
     * @return
     *//*
*/
/*
    @Test
    public void delete(){
        Employee employee = new Employee(11,"邱鑫",null,20);
        Integer delete = employeeService.delete(employee);
        System.out.println(delete);
    }
    *//*
*/
/**
     * 根据主键id删除
     * @param
     * @return
     *//*
*/
/*
    @Test
    public void deleteById(){
        Integer delete = employeeService.deleteById(8);
        System.out.println(delete);
    }
*//*




}*/
