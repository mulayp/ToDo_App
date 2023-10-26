package com.example.todo_app.Data;

import java.util.ArrayList;

public class DataStorage {
    private static ArrayList<DataClass> data = new ArrayList<>();

    public static ArrayList<DataClass> getData() {
        return data;
    }

    public static void setData(DataClass new_Data) {
        data.add(new_Data);
    }

    public static void deldata(ArrayList<DataClass> data) {
        DataStorage.data = data;
    }

}
