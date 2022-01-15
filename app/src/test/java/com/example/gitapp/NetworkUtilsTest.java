package com.example.gitapp;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NetworkUtilsTest {

    @Test
    public void getDataFromApi() {
        List<String>test=new ArrayList<>();
        test.add("Hi ");
        test.add("testing successful");
        getDataFromApi();

    }
}