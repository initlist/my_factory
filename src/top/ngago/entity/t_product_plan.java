package top.ngago.entity;

import java.util.Date;

public class t_product_plan {
    private int id;
    private int flag;
    private Date create_time;
    private int create_userid;
    private Date update_time;
    private int update_userid;
    private String plan_seq;
    private int order_id;
    private int product_id;
    private int plan_count;
    private Date delivery_date;
    private Date plan_start_date;
    private Date plan_end_date;
    private int plan_status;
    private int factory_id;

    public t_product_plan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public int getCreate_userid() {
        return create_userid;
    }

    public void setCreate_userid(int create_userid) {
        this.create_userid = create_userid;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public int getUpdate_userid() {
        return update_userid;
    }

    public void setUpdate_userid(int update_userid) {
        this.update_userid = update_userid;
    }

    public String getPlan_seq() {
        return plan_seq;
    }

    public void setPlan_seq(String plan_seq) {
        this.plan_seq = plan_seq;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getPlan_count() {
        return plan_count;
    }

    public void setPlan_count(int plan_count) {
        this.plan_count = plan_count;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }

    public Date getPlan_start_date() {
        return plan_start_date;
    }

    public void setPlan_start_date(Date plan_start_date) {
        this.plan_start_date = plan_start_date;
    }

    public Date getPlan_end_date() {
        return plan_end_date;
    }

    public void setPlan_end_date(Date plan_end_date) {
        this.plan_end_date = plan_end_date;
    }

    public int getPlan_status() {
        return plan_status;
    }

    public void setPlan_status(int plan_status) {
        this.plan_status = plan_status;
    }

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
        this.factory_id = factory_id;
    }
}
