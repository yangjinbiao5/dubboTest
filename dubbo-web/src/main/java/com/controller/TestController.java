package com.controller;
/**
 * @Date :5/23/2019 9:08 PM
 * @Author :yangjinbiao
 * @Description:
 **/

import api.domain.Student;
import api.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *@ClassName : TestController
 *@Description :
 *@Author : yangjinbiao
 *@Date : 5/23/2019 9:08 PM
 **/
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private StudentService studentService;

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ModelAndView myActivities(HttpServletRequest request, HttpServletResponse response, Model model){

        LOGGER.info("请示参数 request"+ request.getParameterNames());

        System.out.println("我们成功了");
        Student student = studentService.findStudent(1);

        System.out.println("姓名："+student.getName() +" 年龄："+student.getAge());

        ModelAndView  viewPage  = new ModelAndView("/index");
        return viewPage;
    }
}
