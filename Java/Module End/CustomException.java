package com.cdac.main;

import java.util.Scanner;

class FitnessException extends Exception {
    FitnessException(String msg) {
        super(msg);
    }
}

public class CustomException {

    public static void Exception() throws FitnessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter duration of workout = ");
        int duration = sc.nextInt();
        System.out.println("enter distance of workout = ");
        int distance = sc.nextInt();
        
        if(duration > 0) {
            System.out.println("okay");
        }
        else if(duration == 0) {
        	throw new FitnessException("you entered wrong duration as 0");
        }
        else {
            throw new FitnessException("you entered wrong duration negative");
        }
        
        if(distance > 0) {
            System.out.println("okay");
        }
        else if(distance == 0) {
        	throw new FitnessException("you entered wrong distance as 0");
        }
        else {
            throw new FitnessException("you entered wrong distance as negative");
        }
    }
    public static void main(String[] args) {
        try {
            CustomException.Exception();
        }
        catch(FitnessException e) {
            System.out.println("exception catched - "+e.getMessage());
        }
        finally {
            System.out.println("finally execution completed");
        }
    }
}