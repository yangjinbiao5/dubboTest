package boot.provider.bootprovider.service;
/**
 * @Date :4/11/2019 1:10 AM
 * @Author :yangjinbiao
 * @Description:
 **/



import api.domain.Student;
import api.service.StudentService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 *@ClassName : StudentServiceImpl
 *@Description :
 *@Author : yangjinbiao
 *@Date : 4/11/2019 1:10 AM
 **/

@Component
@Service//dubbo的注解
public class StudentServiceImpl implements StudentService {


    @Override
    public Student findStudent(int id) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("实现方法 ：");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));


        Student student = new Student();
        student.setAge(12);
        student.setName("jack!!");

        return student;
    }

    @Override
    public void add(Student student1) {

    }


}
