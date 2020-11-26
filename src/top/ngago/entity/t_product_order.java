package top.ngago.entity;

import java.util.Date;

/**
 * 订单表
 */
public class t_product_order {
    private int id;
    private int flag;
    private Date create_time;
    private int create_userid;
    private Date update_time;
    private int update_userid;
    private String order_seq;
    private int order_source;
    private int product_id;
    private int product_count;
    private Date end_date;
    private int order_status;
    private int factory_id;
    private int factory_yield;

    public t_product_order() {
    }

    public t_product_order(int id, int flag, Date create_time, int create_userid, Date update_time, int update_userid, String order_seq, int order_source, int product_id, int product_count, Date end_date, int order_status, int factory_id, int factory_yield) {
        this.id = id;
        this.flag = flag;
        this.create_time = create_time;
        this.create_userid = create_userid;
        this.update_time = update_time;
        this.update_userid = update_userid;
        this.order_seq = order_seq;
        this.order_source = order_source;
        this.product_id = product_id;
        this.product_count = product_count;
        this.end_date = end_date;
        this.order_status = order_status;
        this.factory_id = factory_id;
        this.factory_yield = factory_yield;
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

    public String getOrder_seq() {
        return order_seq;
    }

    public void setOrder_seq(String order_seq) {
        this.order_seq = order_seq;
    }

    public int getOrder_source() {
        return order_source;
    }

    public void setOrder_source(int order_source) {
        this.order_source = order_source;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_count() {
        return product_count;
    }

    public void setProduct_count(int product_count) {
        this.product_count = product_count;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
        this.factory_id = factory_id;
    }

    public int getFactory_yield() {
        return factory_yield;
    }

    public void setFactory_yield(int factory_yield) {
        this.factory_yield = factory_yield;
    }

    @Override
    public String toString() {
        return "t_product_order{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", order_seq='" + order_seq + '\'' +
                ", order_source=" + order_source +
                ", product_id=" + product_id +
                ", product_count=" + product_count +
                ", end_date=" + end_date +
                ", order_status=" + order_status +
                ", factory_id=" + factory_id +
                ", factory_yield=" + factory_yield +
                '}';
    }
}
