package filter;

import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午5:27
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPerson = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPerson);
    }
}
