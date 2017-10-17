package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午5:24
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePerson = new ArrayList<Person>();
        for(Person person : persons){
            if("FEMALE".equalsIgnoreCase(person.getGender())){
                femalePerson.add(person);
            }
        }
        return femalePerson;
    }
}
