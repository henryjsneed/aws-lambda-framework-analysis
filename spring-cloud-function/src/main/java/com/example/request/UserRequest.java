package com.example.request;

import org.springframework.stereotype.Component;

@Component
public class UserRequest {
    private String first_name;
    private String last_name;
    private String email;
    private int age;
    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return this.email + " " + this.first_name + " " + this.last_name + " " + this.age;
    }
}
