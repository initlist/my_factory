package top.ngago.entity;

import java.util.Date;

/**
 * 用于定义产品
 */
public class t_product {
    private Integer id;
    private Integer flag;
    private Date create_time;
    private Integer create_userid;
    private Date update_time;
    private Integer update_userid;
    private String product_num;
    private String product_name;
    private String product_img_url;
    private Integer factory_id;

    public t_product() {
    }

    public t_product(int id, int flag, Date create_time, int create_userid, Date update_time, int update_userid, String product_num, String product_name, String product_img_url, int factory_id) {
        this.id = id;
        this.flag = flag;
        this.create_time = create_time;
        this.create_userid = create_userid;
        this.update_time = update_time;
        this.update_userid = update_userid;
        this.product_num = product_num;
        this.product_name = product_name;
        this.product_img_url = product_img_url;
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

    public String getProduct_num() {
        return product_num;
    }

    public void setProduct_num(String product_num) {
        this.product_num = product_num;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_img_url() {
        return product_img_url;
    }

    public void setProduct_img_url(String product_img_url) {
        this.product_img_url = product_img_url;
    }

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    @Override
    public String toString() {
        return "t_product{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", product_num='" + product_num + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_img_url='" + product_img_url + '\'' +
                ", factory_id=" + factory_id +
                '}';
    }
}
