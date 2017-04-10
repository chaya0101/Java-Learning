package arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 廖双龙 on 2017/4/10.
 */
public class ArrayListTest {

    public  static  void main(String[] args){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        for (String temp : a){
            if ("2".equals(temp)){
                a.remove(temp);
            }
        }
        System.out.print(a);

        Map<String,Object> map = new HashMap<String,Object>();
        
    }
}
