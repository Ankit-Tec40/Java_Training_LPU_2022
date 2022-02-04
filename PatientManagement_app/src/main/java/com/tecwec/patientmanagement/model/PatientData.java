package com.tecwec.patientmanagement.model;

public class PatientData {
    public int id;
    public String name;
    public String phone;
    public String email;
    public String password;
    public String disease;
    public String registeredOnDate;

    public PatientData(){}

    public PatientData(int id, String name, String phone, String email,String password, String disease, String registeredOnDate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.disease = disease;
        this.registeredOnDate = registeredOnDate;
    }


    @Override
    public String toString() {
        return "PatientData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", disease='" + disease + '\'' +
                ", registeredOnDate='" + registeredOnDate + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getRegisteredOnDate() {
        return registeredOnDate;
    }

    public void setRegisteredOnDate(String registeredOnDate) {
        this.registeredOnDate = registeredOnDate;
    }


    //    public String toSQL(){
//        return "insert into PatientData(0, '\"+name+\"', '\"+phone+\"', '\"+email+\"', \"+disease+\" , '\"+registeredOnDate+\"');";
//    }

//    public static void main(String[] args) {
//        PatientData ob=new PatientData();
//        ob.inputData();
//    }

}
