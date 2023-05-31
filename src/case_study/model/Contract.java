package case_study.model;

public class Contract {
    private String contractID;
    private String bookingID;
    private int advanceDepositAmount;
    private int totalPaymentAmount;

    public Contract() {
    }

    public Contract(String contractID, String bookingID, int advanceDepositAmount, int totalPaymentAmount) {
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public int getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(int advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public int getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(int totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractID='" + contractID + '\'' +
                ", bookingID='" + bookingID + '\'' +
                ", advanceDepositAmount=" + advanceDepositAmount +
                ", totalPaymentAmount=" + totalPaymentAmount +
                '}';
    }
}
