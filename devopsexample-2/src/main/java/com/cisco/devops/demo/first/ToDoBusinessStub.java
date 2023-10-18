package com.cisco.devops.demo.first;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;


public class ToDoBusinessStub {
    @Test
    public void test() {
        ToDoService doServiceStub = new ToDoServiceStub();
        ToDoBusiness business = new ToDoBusiness(doServiceStub);
        List<String> retrievetodos = business.getTodosforSpring("Dummy");
        assertEquals(2,retrievetodos.size());
        System.out.println("Stub is working properly");
    }
}


