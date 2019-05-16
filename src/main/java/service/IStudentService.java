package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    int deleteByUid(int uid);

    int insert(Student record);

    List<Student> selectAll();

    int updateByUid(Student record);
}
