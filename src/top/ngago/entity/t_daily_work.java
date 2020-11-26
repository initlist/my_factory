package top.ngago.entity;

import java.util.Date;

/**
 * 报工表
 */
public class t_daily_work {
    private int id;
    private int flag;
    private Date create_time;
    private int create_userid;
    private Date update_time;
    private int update_userid;
    private int schedule_id;
    private int equipment_id;
    private String equipment_seq;
    private Date start_time;
    private Date end_time;
    private int working_count;
    private int qualified_count;
    private int unqualified_cout;
    private int complete_flag;
    private int factory_id;
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

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public int getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(int equipment_id) {
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

    public int getWorking_count() {
        return working_count;
    }

    public void setWorking_count(int working_count) {
        this.working_count = working_count;
    }

    public int getQualified_count() {
        return qualified_count;
    }

    public void setQualified_count(int qualified_count) {
        this.qualified_count = qualified_count;
    }

    public int getUnqualified_cout() {
        return unqualified_cout;
    }

    public void setUnqualified_cout(int unqualified_cout) {
        this.unqualified_cout = unqualified_cout;
    }

    public int getComplete_flag() {
        return complete_flag;
    }

    public void setComplete_flag(int complete_flag) {
        this.complete_flag = complete_flag;
    }

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
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
