package prototype;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/11 上午11:48
 */
public abstract class AbstractShape implements Cloneable{
    private String id;
    protected String type;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getType(){
        return type;
    }

    abstract void draw();

    @Override
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
