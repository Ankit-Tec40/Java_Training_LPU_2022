package com.tecwec.db;

import java.util.ArrayList;

public interface Rules<T>{
    int insert(T object);
    int update(T object);
    int delete(int id);
    ArrayList<T> query();
}
