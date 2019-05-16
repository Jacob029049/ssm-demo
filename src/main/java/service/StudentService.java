package service;

import dao.StudentMapper;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    public int deleteByUid(int uid) {
        return studentMapper.deleteByUid(uid);
    }

    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    public int updateByUid(Student student) {
        return studentMapper.updateByUid(student);
    }
}
