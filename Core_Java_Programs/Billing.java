

import java.util.Scanner;

public class Billing {
    private String bid;
    private String p_id;
    private String c_id;
    private String o_id;
    private String pname;
    private String discount;
    private String bill_dt;
    private String total_bill;

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBid() {
        return bid;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_id() {
        return c_id;
    }

    public void setO_id(String o_id) {
        this.o_id = o_id;
    }

    public String getO_id() {
        return o_id;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPname() {
        return pname;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setBill_dt(String bill_dt) {
        this.bill_dt = bill_dt;
    }

    public String getBill_dt() {
        return bill_dt;
    }

    public void setTotal_bill(String total_bill) {
        this.total_bill = total_bill;
    }

    public String getTotal_bill() {
        return total_bill;
    }

    public String calculate(String bid, String p_id, String c_id,String o_id,String pname,String discount,String bill_dt,String total_bill) {
        setBid(bid);
        setP_id(p_id);
        setC_id(c_id);
        setO_id(o_id);
        setPname(pname);
        setDiscount(discount);
        setBill_dt(bill_dt);
        setTotal_bill(total_bill);
        return "calculate successfully";
    }

    public String payment() {
        return "payment successfully";
    }
}

