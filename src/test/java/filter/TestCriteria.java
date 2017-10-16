package filter;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午5:40
 */
public class TestCriteria {
    @Test
    public void testFilter(){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        Assert.assertEquals(4,male.meetCriteria(persons).size());
        Assert.assertEquals(2,female.meetCriteria(persons).size());
        Assert.assertEquals(4,single.meetCriteria(persons).size());
        Assert.assertEquals(3,singleMale.meetCriteria(persons).size());
        Assert.assertEquals(5,singleOrFemale.meetCriteria(persons).size());

    }
}
