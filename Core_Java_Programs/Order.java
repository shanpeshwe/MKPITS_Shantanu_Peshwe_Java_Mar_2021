import java.util.Scanner;

public class Order {
    private String o_id;
    private String  o_dt;
    private String  disc_rate;
    private String  o_price;
    private String  o_qty;
    private String status;

    public void setO_id(String o_id) {
        this.o_id = o_id;
    }
    public String getO_id() {
        return o_id;
    }
    public void setO_dt(String o_dt) {
        this.o_dt = o_dt;
    }
    public String getO_dt() {
        return o_dt;
    }
    public void setDisc_rate(String disc_rate) {
        this.disc_rate = disc_rate;
    }
    public String getDisc_rate() {
        return disc_rate;
    }
    public void setO_price(String o_price) {
        this.o_price = o_price;
    }
    public String getO_price() {
        return o_price;
    }
    public void setO_qty(String o_qty) {
        this.o_qty = o_qty;
    }
    public String getO_qty() {
        return o_qty;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public String addorder(String o_id,String o_dt,String disc_rate,String o_price,String o_qty,String status){
        setO_id(o_id);
        setO_dt(o_dt);
        setDisc_rate(disc_rate);
        setO_price(o_price);
        setO_qty(o_qty);
        setStatus(status);
        return "add order successfully";
    }
    public String removeorder(){
        o_id="";
        o_dt="";
        disc_rate="";
        o_price="";
        o_qty="";
        status="";
        return "remove order successfully";
    }
    public String updateorder(){
        return "update order successfully";
    }
}

