package api.service;
/**
 * @Date :5/25/2019 9:21 PM
 * @Author :yangjinbiao
 * @Description:
 **/

import api.domain.Student;

/**
 *@ClassName : StudentServiceStub
 *@Description :
 *@Author : yangjinbiao
 *@Date : 5/25/2019 9:21 PM
 **/
public class StudentServiceStub implements StudentService {

    private final StudentService studentService;


    public StudentServiceStub (StudentService studentService){
        super();
        this.studentService= studentService;
    }

    @Override
    public Student findStudent(int id) {
        System.out.println("api 里面的 本地存根");

        return studentService.findStudent(id);
    }

    @Override
    public void add(Student student1) {

    }
}
