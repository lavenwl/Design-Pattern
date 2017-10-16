package null_object;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 上午10:48
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
