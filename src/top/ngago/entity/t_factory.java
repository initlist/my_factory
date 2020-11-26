package top.ngago.entity;

import java.util.Date;

/**
 * 工厂表
 */
public class t_factory {
    private int id;
    private int flag;
    private Date create_time;
    private int create_userid;
    private Date update_time;
    private int update_userid;
    private String bak;
    private String factory_name;
    private String factory_img_url;
    private String factory_addr;
    private String factory_url;
    private int factory_worker;
    private int factory_status;

    public t_factory() {
    }

    public t_factory(int id, int flag, Date create_time, int create_userid, Date update_time, int update_userid, String bak, String factory_name, String factory_img_url, String factory_addr, String factory_url, int factory_worker, int factory_status) {
        this.id = id;
        this.flag = flag;
        this.create_time = create_time;
        this.create_userid = create_userid;
        this.update_time = update_time;
        this.update_userid = update_userid;
        this.bak = bak;
        this.factory_name = factory_name;
        this.factory_img_url = factory_img_url;
        this.factory_addr = factory_addr;
        this.factory_url = factory_url;
        this.factory_worker = factory_worker;
        this.factory_status = factory_status;
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

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    public String getFactory_name() {
        return factory_name;
    }

    public void setFactory_name(String factory_name) {
        this.factory_name = factory_name;
    }

    public String getFactory_img_url() {
        return factory_img_url;
    }

    public void setFactory_img_url(String factory_img_url) {
        this.factory_img_url = factory_img_url;
    }

    public String getFactory_addr() {
        return factory_addr;
    }

    public void setFactory_addr(String factory_addr) {
        this.factory_addr = factory_addr;
    }

    public String getFactory_url() {
        return factory_url;
    }

    public void setFactory_url(String factory_url) {
        this.factory_url = factory_url;
    }

    public int getFactory_worker() {
        return factory_worker;
    }

    public void setFactory_worker(int factory_worker) {
        this.factory_worker = factory_worker;
    }

    public int getFactory_status() {
        return factory_status;
    }

    public void setFactory_status(int factory_status) {
        this.factory_status = factory_status;
    }

    @Override
    public String toString() {
        return "t_factory{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", bak='" + bak + '\'' +
                ", factory_name='" + factory_name + '\'' +
                ", factory_img_url='" + factory_img_url + '\'' +
                ", factory_addr='" + factory_addr + '\'' +
                ", factory_url='" + factory_url + '\'' +
                ", factory_worker=" + factory_worker +
                ", factory_status=" + factory_status +
                '}';
    }
}
