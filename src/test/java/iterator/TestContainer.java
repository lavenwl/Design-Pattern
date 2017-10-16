package iterator;

import org.junit.Test;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/13 上午10:52
 */
public class TestContainer {
    @Test
    public void testIterator(){
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
