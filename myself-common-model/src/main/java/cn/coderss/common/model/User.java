package cn.coderss.common.model;

import java.io.Serializable;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/1
 * Time: 下午2:57
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
public class User implements Serializable{
    private String name;
    private int sex;
    private String address;

    public User(String name, int sex, String address) {
        this.name = name;
        this.sex = sex;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
