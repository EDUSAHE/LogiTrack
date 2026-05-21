package com.edusahe.logitrack.models;

public class Cliente implements Comparable<Cliente> {

    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;

    public Cliente(){}

    public Cliente(String name, String lastName, String email, String phoneNumber, String address) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return name + " " + lastName;
    }

    @Override
    public int compareTo(Cliente o) {
        String actualClientFullName = this.name + " " + this.lastName;
        String oClientFullName = o.getName() + " " + o.getLastName();
        return actualClientFullName.compareTo(oClientFullName);
    }
}
