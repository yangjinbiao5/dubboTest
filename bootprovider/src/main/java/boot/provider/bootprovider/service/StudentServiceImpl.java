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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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


        System.out.println("实现方法 ：");

        System.out.println(System.currentTimeMillis());


        List<String> list = new ArrayList<String>();
        for (int i =0;i<1000;i++){
            list.add(new String(""));
        }
        Student student = new Student();
        student.setAge(12);
        student.setName("jack!!");


        return student;
    }

    @Override
    public void add(Student student1) {

    }


}
