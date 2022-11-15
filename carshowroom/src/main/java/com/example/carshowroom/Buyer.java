package com.example.carshowroom;


import com.Prgr.Person;

public class Buyer extends Person {
private int id;
    public Buyer(String first_name, String middle_name, String last_name, String birth, String phone_number, String gender, String string) {
        super(first_name, middle_name, last_name, birth, phone_number, Person.gender.valueOf(gender));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Buyer(int id, String first_name, String middle_name, String last_name, String birth, String phone_number, String gender) {
        super(first_name, middle_name, last_name, birth, phone_number, Person.gender.valueOf(gender));
        this.id = id;
    }

    @Override
    public String getFirst_name() {
        return super.getFirst_name();
    }

    @Override
    public void setFirst_name(String first_name) {
        super.setFirst_name(first_name);
    }

    @Override
    public String getMiddle_name() {
        return super.getMiddle_name();
    }

    @Override
    public void setMiddle_name(String middle_name) {
        super.setMiddle_name(middle_name);
    }

    @Override
    public String getLast_name() {
        return super.getLast_name();
    }

    @Override
    public void setLast_name(String last_name) {
        super.setLast_name(last_name);
    }

    @Override
    public String getBirth() {
        return super.getBirth();
    }

    @Override
    public void setBirth(String birth) {
        super.setBirth(birth);
    }

    @Override
    public String getPhone_number() {
        return super.getPhone_number();
    }

    @Override
    public void setPhone_number(String phone_number) {
        super.setPhone_number(phone_number);
    }

    @Override
    public Person.gender getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(Person.gender gender) {
        super.setGender(gender);
    }
}

