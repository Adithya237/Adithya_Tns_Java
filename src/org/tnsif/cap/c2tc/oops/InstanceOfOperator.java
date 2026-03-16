package org.tnsif.cap.c2tc.oops;

class Animal {
}

class Dog extends Animal {
}

public class InstanceOfOperator {
    public static void main(String[] args) {
        
        Dog d = new Dog();

        System.out.println(d instanceof Dog);     
        System.out.println(d instanceof Animal);  
        System.out.println(d instanceof Object);  
    }
}
