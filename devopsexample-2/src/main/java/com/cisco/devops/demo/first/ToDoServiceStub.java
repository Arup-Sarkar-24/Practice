package com.cisco.devops.demo.first;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {
    public List<String> getTodos(String user) {
        // TODO Auto-generated method stub
        //these are the sample of mock values
        return Arrays.asList("Core Java","Spring Core","Spring MVC");
    }

	}

