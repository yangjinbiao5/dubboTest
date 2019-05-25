package boot.consumer.bootconsumer.controller;
/**
 * @Date :5/25/2019 12:33 AM
 * @Author :yangjinbiao
 * @Description:
 **/

import api.domain.Student;
import api.service.StudentService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *@ClassName : StudentController
 *@Description :
 *@Author : yangjinbiao
 *@Date : 5/25/2019 12:33 AM
 **/
@Controller
public class StudentController {

    @Reference(stub = "api.service.StudentServiceStub")
    StudentService studentService;

    @RequestMapping("/init")
    @ResponseBody
    public Student init(){
        System.out.println("controller");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return studentService.findStudent(1);
    }
}
