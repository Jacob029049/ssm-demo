package dao;
import model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    int deleteByUid(int uid);

    int insert(Student record);

    List<Student> selectAll();

    int updateByUid(Student record);
}