import java.util.ArrayList;

public class Example1 {

    static int qrCheck=1;
    static ArrayList<User> userDatabase;


    public static void main(String[] args) {

        boolean a =Login("724thomas@gmail.com","1234");

    }




    public static boolean Login(String userEmail, String userPassword){
        return checkUserInDatabase(userEmail, userPassword)? loginSuccessMessage() : loginFailMessage();
    }
    public static boolean checkUserInDatabase(String userEmail, String userPassword){
        for (User user: userDatabase) {
            if (user.getEmail().equals(userEmail) && user.getPassword().equals(userEmail)) {
                    return true;
            }
        }
        return false;
    }
    public static boolean loginSuccessMessage(){
        System.out.println("로그인 성공");
        System.out.println("쿠키 생성");
        System.out.println("세션 저장");
        return true;
    }
    public static boolean loginFailMessage(){
        System.out.println("로그인 실패");
        return false;
    }
}