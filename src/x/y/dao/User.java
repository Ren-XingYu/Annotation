package x.y.dao;

import x.y.annotation.CustomAnnotation;

public class User {
    @CustomAnnotation(name = "xyz",timeout = 200)
    public void getUser(){
        System.out.println("getUser");
    }
}
