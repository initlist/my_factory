package top.ngago.entity;

import java.util.Date;

/**
 * 生产调度表
 */
public class t_product_schedule {
    private int id;
    private int flag;
    private Date create_time;
    private int create_userid;
    private Date update_time;
    private int update_userid;
    private String schedule_seq;
    private int schedule_count;
    private int schedule_status;
    private int plan_id;
    private int product_id;
    private int equipment_id;
    private Date start_date;
    private Date end_date;
    private int factory_id;

    public t_product_schedule() {
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

    public String getSchedule_seq() {
        return schedule_seq;
    }

    public void setSchedule_seq(String schedule_seq) {
        this.schedule_seq = schedule_seq;
    }

    public int getSchedule_count() {
        return schedule_count;
    }

    public void setSchedule_count(int schedule_count) {
        this.schedule_count = schedule_count;
    }

    public int getSchedule_status() {
        return schedule_status;
    }

    public void setSchedule_status(int schedule_status) {
        this.schedule_status = schedule_status;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(int equipment_id) {
        this.equipment_id = equipment_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
        this.factory_id = factory_id;
    }
}
