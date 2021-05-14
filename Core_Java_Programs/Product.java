import java.util.Scanner;

public class Product {
    private String pi_id;
    private String p_name;
    private String  p_qty;
    private String batch_name;
    private String  sp;
    private String mfg_dt;
    private String exp_dt;

    public void setPi_id(String pi_id) {
        this.pi_id = pi_id;
    }

    public String getPi_id() {
        return pi_id;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_qty(String  p_qty) {
        this.p_qty = p_qty;
    }

    public String  getP_qty() {
        return p_qty;
    }

    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }

    public String getBatch_name() {
        return batch_name;
    }

    public void setSp(String  sp) {
        this.sp = sp;
    }

    public String  getSp() {
        return sp;
    }

    public void setMfg_dt(String mfg_dt) {
        this.mfg_dt = mfg_dt;
    }

    public String getMfg_dt() {
        return mfg_dt;
    }

    public void setExp_dt(String exp_dt) {
        this.exp_dt = exp_dt;
    }

    public String getExp_dt() {
        return exp_dt;
    }

    public String addproduct(String pi_id, String p_name, String  p_qty, String batch_name, String  sp, String mfg_dt, String exp_dt) {
        setPi_id(pi_id);
        setP_name(p_name);
        setP_qty(p_qty);
        setBatch_name(batch_name);
        setSp(sp);
        setMfg_dt(mfg_dt);
        setExp_dt(exp_dt);
        return "product added successfully";
    }

    public String removeproduct() {
        pi_id = "";
        p_name = "";
        p_qty = "";
        batch_name = "";
        sp = "";
        mfg_dt = "";
        exp_dt = "";
        return "product removed successfully";
    }

    public String orderproduct() {
        // System.out.println("order product");
        return "order product succesfully";
    }

    public String updateproduct() {
        //System.out.println("update product");
        return "update product succesfully";
    }
}
