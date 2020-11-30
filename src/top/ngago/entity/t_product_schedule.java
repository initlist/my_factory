package top.ngago.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 生产调度表
 */
public class t_product_schedule {
    private Integer id;
    private Integer flag;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date create_time;
    private Integer create_userid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date update_time;
    private Integer update_userid;
    private String schedule_seq;
    private Integer schedule_count;
    private Integer schedule_status;
    private Integer plan_id;
    private Integer product_id;
    private Integer equipment_id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date start_date;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date end_date;
    private Integer factory_id;

    public t_product_schedule() {
    }

    public t_product_schedule(int id, int flag, Date create_time, int create_userid, Date update_time, int update_userid, String schedule_seq, int schedule_count, int schedule_status, int plan_id, int product_id, int equipment_id, Date start_date, Date end_date, int factory_id) {
        this.id = id;
        this.flag = flag;
        this.create_time = create_time;
        this.create_userid = create_userid;
        this.update_time = update_time;
        this.update_userid = update_userid;
        this.schedule_seq = schedule_seq;
        this.schedule_count = schedule_count;
        this.schedule_status = schedule_status;
        this.plan_id = plan_id;
        this.product_id = product_id;
        this.equipment_id = equipment_id;
        this.start_date = start_date;
        this.end_date = end_date;
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

    public String getSchedule_seq() {
        return schedule_seq;
    }

    public void setSchedule_seq(String schedule_seq) {
        this.schedule_seq = schedule_seq;
    }

    public Integer getSchedule_count() {
        return schedule_count;
    }

    public void setSchedule_count(Integer schedule_count) {
        this.schedule_count = schedule_count;
    }

    public Integer getSchedule_status() {
        return schedule_status;
    }

    public void setSchedule_status(Integer schedule_status) {
        this.schedule_status = schedule_status;
    }

    public Integer getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(Integer plan_id) {
        this.plan_id = plan_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Integer equipment_id) {
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

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    @Override
    public String toString() {
        return "t_product_schedule{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", schedule_seq='" + schedule_seq + '\'' +
                ", schedule_count=" + schedule_count +
                ", schedule_status=" + schedule_status +
                ", plan_id=" + plan_id +
                ", product_id=" + product_id +
                ", equipment_id=" + equipment_id +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", factory_id=" + factory_id +
                '}';
    }
}
