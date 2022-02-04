package com.tecwec.patientmanagement.db;

import java.util.ArrayList;

public interface Rules<T>{
    int insert(T object);
    int update(T object);
    int delete(int id);
    int register(T object);
    int login(T object);
    ArrayList<T> query();
}
