package j2ee_pattern.mvc;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午3:07
 */
public class StudentView {
    public void printStudentDeatails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name:" + studentName);
        System.out.println("Roll No:" + studentRollNo);
    }
}
