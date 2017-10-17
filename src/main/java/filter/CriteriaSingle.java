package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午5:26
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePerson = new ArrayList<Person>();
        for(Person person : persons){
            if("SINGLE".equalsIgnoreCase(person.getMaritalStatus())){
                singlePerson.add(person);
            }
        }
        return singlePerson;
    }
}
