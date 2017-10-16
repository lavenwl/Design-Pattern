package junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/9 下午10:38
 */
public class StringFilter {
    public String stringFilter(String string){

        if(string == null)
            return null;
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(string);
        StringBuffer sb = new StringBuffer();

        while(m.find()){
            m.appendReplacement(sb, ("_"+m.group()).toLowerCase());
        }
        return m.appendTail(sb).toString().toLowerCase();
    }
}
