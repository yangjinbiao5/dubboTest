package com;
/**
 * @Date :5/24/2019 2:36 PM
 * @Author :yangjinbiao
 * @Description:
 **/

import com.impl.TestClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 *@ClassName : StartTest
 *@Description :
 *@Author : yangjinbiao
 *@Date : 5/24/2019 2:36 PM
 **/
public class StartTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        context.start();
        TestClass bean = context.getBean(TestClass.class);
        System.out.println(bean.getName());
        System.in.read();
    }
}
