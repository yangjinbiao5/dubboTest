package api.service;


import api.domain.Student;

/**
 * @Date :4/11/2019 1:10 AM
 * @Author :yangjinbiao
 * @Description:
 **/

public interface StudentService {

    Student findStudent(int id);

    void add(Student student1);
}
