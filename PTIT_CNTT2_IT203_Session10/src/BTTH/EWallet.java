package BTTH;

public class EWallet extends PaymentMethod implements Payable {
    private String phoneNumber;
    private double balance;

    public EWallet(String accountName, String paymentId, String phoneNumber, double balance) {
        super(accountName, paymentId);
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }


    @Override
    void validate() {
        if (!phoneNumber.matches("^\\d{10,11}$")) {
            System.out.println("Số điện thoại không hợp lệ");
            return;
        }
    }

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền không hợp lệ");
            return;
        }

        if (amount > balance) {
            System.out.println("Không đủ số dư");
        } else {
            balance -= amount;
            System.out.println("Thanh toán " + amount + " bằng E-Wallet thành công");
            System.out.println("Số dư còn lại: " + balance);
        }
    }
}
