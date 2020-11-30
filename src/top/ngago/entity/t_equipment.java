package top.ngago.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 设备表
 */
public class t_equipment {
    private Integer id;
    private Integer flag;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date create_time;
    private Integer create_userid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date update_time;
    private Integer update_userid;
    private String equipment_seq;
    private String equipment_name;
    private String equipment_img_url;
    private Integer equipment_status;
    private Integer factory_id;

    public t_equipment() {
    }

    public t_equipment(int id, int flag, Date create_time, int create_userid, Date update_time, int update_userid, String equipment_seq, String equipment_name, String equipment_img_url, int equipment_status, int factory_id) {
        this.id = id;
        this.flag = flag;
        this.create_time = create_time;
        this.create_userid = create_userid;
        this.update_time = update_time;
        this.update_userid = update_userid;
        this.equipment_seq = equipment_seq;
        this.equipment_name = equipment_name;
        this.equipment_img_url = equipment_img_url;
        this.equipment_status = equipment_status;
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

    public String getEquipment_seq() {
        return equipment_seq;
    }

    public void setEquipment_seq(String equipment_seq) {
        this.equipment_seq = equipment_seq;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getEquipment_img_url() {
        return equipment_img_url;
    }

    public void setEquipment_img_url(String equipment_img_url) {
        this.equipment_img_url = equipment_img_url;
    }

    public Integer getEquipment_status() {
        return equipment_status;
    }

    public void setEquipment_status(Integer equipment_status) {
        this.equipment_status = equipment_status;
    }

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    @Override
    public String toString() {
        return "t_equipment{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", equipment_seq='" + equipment_seq + '\'' +
                ", equipment_name='" + equipment_name + '\'' +
                ", equipment_img_url='" + equipment_img_url + '\'' +
                ", equipment_status=" + equipment_status +
                ", factory_id=" + factory_id +
                '}';
    }
}
