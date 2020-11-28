package top.ngago.entity;

import java.util.Date;

/**
 * 生产计划表
 */
public class t_product_plan {
    private Integer id;
    private Integer flag;
    private Date create_time;
    private Integer create_userid;
    private Date update_time;
    private Integer update_userid;
    private String plan_seq;
    private Integer order_id;
    private Integer product_id;
    private Integer plan_count;
    private Date delivery_date;
    private Date plan_start_date;
    private Date plan_end_date;
    private Integer plan_status;
    private Integer factory_id;

    public t_product_plan() {
    }

    public t_product_plan(int id, int flag, Date create_time, int create_userid, Date update_time, int update_userid, String plan_seq, int order_id, int product_id, int plan_count, Date delivery_date, Date plan_start_date, Date plan_end_date, int plan_status, int factory_id) {
        this.id = id;
        this.flag = flag;
        this.create_time = create_time;
        this.create_userid = create_userid;
        this.update_time = update_time;
        this.update_userid = update_userid;
        this.plan_seq = plan_seq;
        this.order_id = order_id;
        this.product_id = product_id;
        this.plan_count = plan_count;
        this.delivery_date = delivery_date;
        this.plan_start_date = plan_start_date;
        this.plan_end_date = plan_end_date;
        this.plan_status = plan_status;
        this.factory_id = factory_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getCreate_userid() {
        return create_userid;
    }

    public void setCreate_userid(Integer create_userid) {
        this.create_userid = create_userid;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getUpdate_userid() {
        return update_userid;
    }

    public void setUpdate_userid(Integer update_userid) {
        this.update_userid = update_userid;
    }

    public String getPlan_seq() {
        return plan_seq;
    }

    public void setPlan_seq(String plan_seq) {
        this.plan_seq = plan_seq;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getPlan_count() {
        return plan_count;
    }

    public void setPlan_count(Integer plan_count) {
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

    public Integer getPlan_status() {
        return plan_status;
    }

    public void setPlan_status(Integer plan_status) {
        this.plan_status = plan_status;
    }

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    @Override
    public String toString() {
        return "t_product_plan{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", plan_seq='" + plan_seq + '\'' +
                ", order_id=" + order_id +
                ", product_id=" + product_id +
                ", plan_count=" + plan_count +
                ", delivery_date=" + delivery_date +
                ", plan_start_date=" + plan_start_date +
                ", plan_end_date=" + plan_end_date +
                ", plan_status=" + plan_status +
                ", factory_id=" + factory_id +
                '}';
    }
}
