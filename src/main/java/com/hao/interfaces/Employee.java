package com.hao.interfaces;

import java.util.Objects;

/**
 * @ClassName Employee
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-07-20 08:52
 * @Copyright:
 **/
public class Employee {
    private Integer id;
    private String name;

    public Employee() {
    }

    public Employee(Integer id) {
        this.id = id;
    }

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(!(o instanceof Employee)){
            return false;
        }
        Employee home= (Employee) o;
        return Objects.equals(id,home.id);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
