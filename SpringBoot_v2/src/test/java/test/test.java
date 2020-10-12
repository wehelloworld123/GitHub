package test;

import com.fc.SpringbootStart;
import com.fc.test.common.conf.V2Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootStart.class)
public class test {
    @Test
    public void test2(){
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("a","1");
        list.add(map);
        for(Map<String,Object> m:list){
            System.out.println(m.get("b"));
        }
    }
    @Test
    public  void test3(){
        String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1595058888914&di=e001096c598be620290b2e9f113c2e80&imgtype=0&src=http%3A%2F%2Fgss0.baidu.com%2F-vo3dSag_xI4khGko9WTAnF6hhy%2Fzhidao%2Fpic%2Fitem%2Fa8014c086e061d954f51db5679f40ad162d9ca4d.jpg";
        System.out.println(url.length());
    }

    @Test
    public  void test4(){

        for (int a =1;a<15;a++){
            int value = 15 -a;
            for(int b=a+1;b<value;b++){
                int c = value-b;
                if(c>b) {
                    System.out.println(a + "," + b + "," + c);
                }
            }
        }
    }

    @Test
    public void test5(){
        System.out.println(V2Config.getDefaultBaseDir());
    }
}
