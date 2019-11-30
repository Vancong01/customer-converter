package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min =2,max=30,message = "Độ dài từ 3 đến 30")
    private String firstName;
    @Size(min =3,max =30,message = "Độ dài từ 3 đến 30")
    private String lastName;

    private String phoneNumber;

    public Customer() {
    }

    public Customer(@Size(min = 2, max = 30, message = "Độ dài từ 3 đến 30") String firstName, @Size(min = 3, max = 30, message = "Độ dài từ 3 đến 30") String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getA(){
        return phoneNumber;
    }
//    @Override
//    public String toString() {
//        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
//    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
