import java.util.HashMap;

public class Example5 {

    public static HashMap<String,String> pa = new HashMap<>(){{
        put("Alpha","a");
        put("Bravo","b");
        put("Charlie","c");
        put("Delta","d");
        put("Echo","e");
        put("Foxtrot","f");
        put("Golf","g");
        //...
        put("Romeo","r");
        //...
    }};

    public static String m="Charlie Alpha Romeo";

    public static void main(String[] args) {
        dpa(m);
    }

    public static void dpa(String str){
        for(String a : str.split(" ")){
            System.out.println("alphabet : " + pa.get(a));
        }
    }
}
