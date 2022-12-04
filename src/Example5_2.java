import java.util.HashMap;

public class Example5_2 {

    public static HashMap<String,String> phoneticAlphabet = new HashMap<>(){{
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

    public static String message="Charlie Alpha Romeo";

    public static void main(String[] args) {
        decodePhoneticAlphabet(message);
    }

    public static void decodePhoneticAlphabet(String str){
        for(String alphabet : str.split(" ")){
            System.out.println("alphabet : " + phoneticAlphabet.get(alphabet));
        }
    }
}

