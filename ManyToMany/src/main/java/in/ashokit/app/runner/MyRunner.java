package in.ashokit.app.runner;

import in.ashokit.app.entity.Course;
import in.ashokit.app.entity.Student;
import in.ashokit.app.repo.CourseRepo;
import in.ashokit.app.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        saveStudentWithCourses();

    }

    private void saveStudentWithCourses() {
        Student student = new Student();
        student.setId(103);
        student.setStudentName("Lilly");

        student.setCourses(List.of(courseRepo.findById(10).get(),courseRepo.findById(20).get()));

        studentRepo.save(student);
    }
}
