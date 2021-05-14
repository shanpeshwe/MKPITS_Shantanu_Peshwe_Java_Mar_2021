import java.util.Scanner;

public class Stock {
   private String s_id;
   private String p_id;
   private String stk_disc;
   private String  stk_qty;
   private String  date;
   public void setS_id(String s_id){
       this.s_id=s_id;
   }
   public String getS_id(){
       return s_id;
   }
    public void setP_id(String p_id){
        this.p_id=p_id;
    }
    public String getP_id(){
        return p_id;
    }
    public void setStk_disc(String stk_disc){
        this.stk_disc=stk_disc;
    }
    public String getStk_disc(){
        return stk_disc;
    }
    public void setStk_qty(String stk_qty){
        this.stk_qty=stk_qty;
    }
    public String getStk_qty(){
        return stk_qty;
    }
    public void setDate(String date){
        this.date=date;
    }
    public String getDate(){
        return date;
    }
    public String availability(String s_id,String p_id,String stk_disc,String  stk_qty,String  date)
    {
        setS_id(s_id);
        setP_id(p_id);
        setStk_disc(stk_disc);
        setStk_qty(stk_qty);
        setDate(date);
        return "availbilty added successfully";
    }
    public String addstock(){
       return "stock added succesfully";
    }
    public String removestock(){
       s_id="";
       p_id="";
       stk_disc="";
       stk_qty="";
       date="";
       return "remove stock successfully";
    }
    public String updatestock(){
       return "update stock successfully";
    }

}
