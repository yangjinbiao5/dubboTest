package com.impl;
/**
 * @Date :4/11/2019 1:10 AM
 * @Author :yangjinbiao
 * @Description:
 **/


import api.domain.Student;
import com.dao.StudentMapper;
import api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


/**
 *@ClassName : StudentServiceImpl
 *@Description :
 *@Author : yangjinbiao
 *@Date : 4/11/2019 1:10 AM
 **/

@Service("studentService")
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student findStudent(int id) {
        String format = DateFormat.getDateTimeInstance(2, 2, Locale.CHINESE).format(new Date());
        System.out.println(format);
        System.out.println("调用2");
        Student student = new Student();
        student.setAge(12);
        student.setName("jack!!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return student;
        /*return studentMapper.selectByPrimaryKey(id);*/
    }

    @Override
    public void add(Student student) {
        studentMapper.insert(student);
    }
}
