package top.ngago.entity;

import java.util.Date;

/**
 * 报工表
 */
public class t_daily_work {
    private Integer id;
    private Integer flag;
    private Date create_time;
    private Integer create_userid;
    private Date update_time;
    private Integer update_userid;
    private Integer schedule_id;
    private Integer equipment_id;
    private String equipment_seq;
    private Date start_time;
    private Date end_time;
    private Integer working_count;
    private Integer qualified_count;
    private Integer unqualified_cout;
    private Integer complete_flag;
    private Integer factory_id;
    private String bak;

    public t_daily_work() {
    }

    public t_daily_work(int id, int flag, Date create_time, int create_userid, Date update_time, int update_userid, int schedule_id, int equipment_id, String equipment_seq, Date start_time, Date end_time, int working_count, int qualified_count, int unqualified_cout, int complete_flag, int factory_id, String bak) {
        this.id = id;
        this.flag = flag;
        this.create_time = create_time;
        this.create_userid = create_userid;
        this.update_time = update_time;
        this.update_userid = update_userid;
        this.schedule_id = schedule_id;
        this.equipment_id = equipment_id;
        this.equipment_seq = equipment_seq;
        this.start_time = start_time;
        this.end_time = end_time;
        this.working_count = working_count;
        this.qualified_count = qualified_count;
        this.unqualified_cout = unqualified_cout;
        this.complete_flag = complete_flag;
        this.factory_id = factory_id;
        this.bak = bak;
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

    public Integer getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(Integer schedule_id) {
        this.schedule_id = schedule_id;
    }

    public Integer getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Integer equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getEquipment_seq() {
        return equipment_seq;
    }

    public void setEquipment_seq(String equipment_seq) {
        this.equipment_seq = equipment_seq;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Integer getWorking_count() {
        return working_count;
    }

    public void setWorking_count(Integer working_count) {
        this.working_count = working_count;
    }

    public Integer getQualified_count() {
        return qualified_count;
    }

    public void setQualified_count(Integer qualified_count) {
        this.qualified_count = qualified_count;
    }

    public Integer getUnqualified_cout() {
        return unqualified_cout;
    }

    public void setUnqualified_cout(Integer unqualified_cout) {
        this.unqualified_cout = unqualified_cout;
    }

    public Integer getComplete_flag() {
        return complete_flag;
    }

    public void setComplete_flag(Integer complete_flag) {
        this.complete_flag = complete_flag;
    }

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    @Override
    public String toString() {
        return "t_daily_work{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", schedule_id=" + schedule_id +
                ", equipment_id=" + equipment_id +
                ", equipment_seq='" + equipment_seq + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", working_count=" + working_count +
                ", qualified_count=" + qualified_count +
                ", unqualified_cout=" + unqualified_cout +
                ", complete_flag=" + complete_flag +
                ", factory_id=" + factory_id +
                ", bak='" + bak + '\'' +
                '}';
    }
}
