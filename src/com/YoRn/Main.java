package com.YoRn;

public class Main {

    // Where it all starts
    public static void main(String[] args) {
        String hw = "Hello, World!"; // Declaring first variable
	System.out.println(hw); // Prints a string called hw

	Hello(); // Using secondary Method below
    }

    // Trying to make a method
    public static void Hello() {
        String name = "John";
        int age = 19;
        System.out.println(name);
        System.out.println(age);
    } // Method is working as intended
}
