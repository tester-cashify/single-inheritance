package com.HelloWorld;

public class Employee {
    float salary = 20000;
}
class programmer extends Employee{
    int bonus=5000;
    public static void main(String []args){
        programmer p=new programmer();
        System.out.println("programmer salary is:"+p.salary);
        System.out.println("bonus of programmer is:"+p.bonus);
    }
}
