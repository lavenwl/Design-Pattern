package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午5:22
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePerson = new ArrayList<Person>();
        for(Person person : persons){
            if("MALE".equalsIgnoreCase(person.getGender())){
                malePerson.add(person);
            }
        }
        return malePerson;
    }
}
