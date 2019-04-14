package com.arcsoft.sdk_demo.data;

/**
 * Created by 83541 on 2018/6/5.
 */

public class rfid_user {
    private String num;
    private String username;
    private String balance;
    private String RFID;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getRFID() {
        return RFID;
    }

    public void setRFID(String RFID) {
        this.RFID = RFID;
    }

    @Override
    public String toString() {
        return "rfid_user{" +
                "num='" + num + '\'' +
                ", username='" + username + '\'' +
                ", balance='" + balance + '\'' +
                ", RFID='" + RFID + '\'' +
                '}';
    }
}
