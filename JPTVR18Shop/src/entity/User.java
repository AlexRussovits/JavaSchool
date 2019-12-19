/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;

/**
 *
 * @author pupil
 */
public class User {
    
    private String fname;
    private String lname;
    private String address;
    private String Email;
    private String phone;
    private int money;

    public User() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.fname);
        hash = 29 * hash + Objects.hashCode(this.lname);
        hash = 29 * hash + Objects.hashCode(this.address);
        hash = 29 * hash + Objects.hashCode(this.Email);
        hash = 29 * hash + Objects.hashCode(this.phone);
        hash = 29 * hash + this.money;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.money != other.money) {
            return false;
        }
        if (!Objects.equals(this.fname, other.fname)) {
            return false;
        }
        if (!Objects.equals(this.lname, other.lname)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "fname=" + fname + ", lname=" + lname + ", address=" + address + ", Email=" + Email + ", phone=" + phone + ", money=" + money + '}';
    }
    
    
}
