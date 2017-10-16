package j2ee_pattern.composite_entity;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:01
 */
public class CoarseGrainedObject {

    DependentObject1 dependentObject1 = new DependentObject1();
    DependentObject2 dependentObject2 = new DependentObject2();

    public void setData(String data1, String data2){
        dependentObject1.setData(data1);
        dependentObject2.setData(data2);
    }

    public String[] getData(){
        return new String[] {dependentObject1.getData(), dependentObject2.getData()};
    }
}
