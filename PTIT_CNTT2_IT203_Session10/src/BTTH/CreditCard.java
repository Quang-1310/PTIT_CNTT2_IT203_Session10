package BTTH;

public class CreditCard extends PaymentMethod implements Payable{
    private String cardNumber;
    private String cvv;
    private double creditLimit;

    public CreditCard(String accountName, String paymentId,String cardNumber, String cvv, double creditLimit) {
        super(accountName,paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền không hợp lệ");
            return;
        }

        if (amount > creditLimit) {
            System.out.println("Vượt quá hạn mức tín dụng");
        } else {
            creditLimit -= amount;
            System.out.println("Thanh toán " + amount + " bằng Credit Card thành công");
            System.out.println("Hạn mức còn lại: " + creditLimit);
        }
    }


    @Override
    void validate() {
        if (!cardNumber.matches("^\\d{16}$")) {
            System.out.println("Card number không hợp lệ ");
            return;
        }
    }
}
