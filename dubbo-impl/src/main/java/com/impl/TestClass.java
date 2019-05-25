package com.impl;
/**
 * @Date :5/24/2019 2:44 PM
 * @Author :yangjinbiao
 * @Description:
 **/


import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

/**
 *@ClassName : TestClass
 *@Description :
 *@Author : yangjinbiao
 *@Date : 5/24/2019 2:44 PM
 **/

@Service("testClass")
public class TestClass {
    private String name = "java";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String str = " ";
        System.out.println(StringUtils.isEmpty(str));
        System.out.println(StringUtils.isBlank(str));
    }
}
