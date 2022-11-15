package com.Prgr;

public class Person {
    public enum gender{
        MALE,
        FEMALE
    }
public String first_name,middle_name, last_name,birth, phone_number;
public int id;
public static gender gender;

    public Person(String first_name, String middle_name, String last_name, String birth, String phone_number, Person.gender gender) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.birth = birth;
        this.phone_number = phone_number;
        this.gender = gender;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Person.gender getGender() {
        return gender;
    }

    public void setGender(Person.gender gender) {
        this.gender = gender;
    }
}
