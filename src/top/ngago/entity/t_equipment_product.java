package top.ngago.entity;

/**
 * 设备与产品对应表
 */
public class t_equipment_product {
    private Integer id;
    private Integer equipment_id;
    private Integer product_id;
    private Integer yield;
    private Integer unit;
    private Integer factory_id;

    public t_equipment_product() {
    }

    public t_equipment_product(int id, int equipment_id, int product_id, int yield, int unit, int factory_id) {
        this.id = id;
        this.equipment_id = equipment_id;
        this.product_id = product_id;
        this.yield = yield;
        this.unit = unit;
        this.factory_id = factory_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Integer equipment_id) {
        this.equipment_id = equipment_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getYield() {
        return yield;
    }

    public void setYield(Integer yield) {
        this.yield = yield;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    @Override
    public String toString() {
        return "t_equipment_product{" +
                "id=" + id +
                ", equipment_id=" + equipment_id +
                ", product_id=" + product_id +
                ", yield=" + yield +
                ", unit=" + unit +
                ", factory_id=" + factory_id +
                '}';
    }
}
