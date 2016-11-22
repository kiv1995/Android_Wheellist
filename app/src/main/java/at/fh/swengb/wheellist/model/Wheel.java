package at.fh.swengb.wheellist.model;

import java.io.Serializable;

/**
 * Created by Kevin on 22.11.2016.
 */

public class Wheel implements Serializable {
    private String name;
    private String cost;
    private String deep;
    private String phoneNumber;

    public Wheel() {
    }
    public Wheel(String name, String cost, String deep, String phoneNumber) {
        this.name = name;
        this.cost = cost;
        this.deep = deep;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCost() {
        return cost;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }
    public String getDeep() {
        return deep;
    }
    public void setDeep(String deep) {
        this.deep = deep;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wheel wheel = (Wheel) o;

        if (name != null ? !name.equals(wheel.name) : wheel.name != null) return false;
        if (cost != null ? !cost.equals(wheel.cost) : wheel.cost != null) return false;
        if (deep != null ? !deep.equals(wheel.deep) : wheel.deep != null) return false;
        return phoneNumber != null ? phoneNumber.equals(wheel.phoneNumber) : wheel.phoneNumber == null;

    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (deep != null ? deep.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(name).append("; ")
                .append(cost)
                .append('\n')
                .append(deep).append('\n')
                .append(phoneNumber);
        return sb.toString();
    }
}
