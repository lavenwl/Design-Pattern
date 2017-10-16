package j2ee_pattern.data_access_object;

import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:20
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
