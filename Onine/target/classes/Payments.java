
@Entity
public class Payments {

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSellAccNo() {
        return sellAccNo;
    }

    public void setSellAccNo(String sellAccNo) {
        this.sellAccNo = sellAccNo;
    }

    public String getCusAccNo() {
        return cusAccNo;
    }

    public void setCusAccNo(String cusAccNo) {
        this.cusAccNo = cusAccNo;
    }

    public String getCusFullName() {
        return cusFullName;
    }

    public void setCusFullName(String cusFullName) {
        this.cusFullName = cusFullName;
    }

    public String getSellFullName() {
        return sellFullName;
    }

    public void setSellFullName(String sellFullName) {
        this.sellFullName = sellFullName;
    }


    public String getSellBankName() {
        return sellBankName;
    }

    public void setSellBankName(String sellBankName) {
        this.sellBankName = sellBankName;
    }


    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;
    @Column(unique = true)
    private String itemId;
    private String orderId;
    private String sellAccNo;
    private String cusAccNo;
    private String cusFullName;
    private String sellFullName;
    private String cardType;
    private String cusBankName;
    private String cusBankBranch;
    private String sellBankName;
    private String sellBankBranch;
    private String amount;
    private String payDate;

}
