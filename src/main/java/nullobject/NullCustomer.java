package nullobject;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午10:50
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
