package controller;

import com.alibaba.fastjson.JSON;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.IStudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public String queryAllStudent() {
        List<Student> students = studentService.selectAll();
        String jsonResult = JSON.toJSONString(students);
        return jsonResult;
    }
}
