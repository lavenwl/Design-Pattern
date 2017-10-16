package filter;

import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 下午5:21
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
