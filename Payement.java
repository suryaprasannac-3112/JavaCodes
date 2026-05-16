class TypeOfPayement{
    int payement(int upi_id, String name){

        System.out.println("Online payement");
        System.out.println(upi_id + " " +name);

        return 0;
    }
    int payement(int debit_card_num, int cvv, int expiryDate){
        System.out.println("DEBIT CARD");
        System.out.println(debit_card_num + " " + cvv+ " " + expiryDate);
        return 0;
    }
    int payement(int credit_card_num, int cvv, int expiry_date, String name){
        System.out.println("CREDIT CARD");
        System.out.println(credit_card_num + " "+cvv + " "+ expiry_date+ " "+ name);
        return 0;
    }
}



public class Payement{
    public static void main(String[] args){
        TypeOfPayement tp = new TypeOfPayement();
        tp.payement(0, null);
        tp.payement(101, 556, 314);
        tp.payement(105,225,524,"prasanna");
    }
}