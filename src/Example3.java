public class Example3 {
    public static class orderInfo{
        public static String productName = "레드마블치킨";
        public static String productId = "RMC2021";
        public static int price = 20000;
        public static int quantity = 1;
        public static String companyName = "NeNe";
        public static String userId = "724thomas";
    }

    public static void main(String[] args) {
        makePayment(orderInfo.productName,orderInfo.productId, orderInfo.price,
                orderInfo.quantity, orderInfo.companyName, orderInfo.userId);
    }
    public static void makePayment(String productName, String productId, int price,
                                   int quantity, String companyName, String userId){
        //Making a payment
    }

}

