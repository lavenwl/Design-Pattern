package j2ee_pattern.mvc;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午3:09
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(String rollNo){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDeatails(model.getName(), model.getRollNo());
    }
}
