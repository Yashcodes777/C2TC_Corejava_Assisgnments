package com.yaswanth.assignment4;

//File: Bank.java


public class Bank {
 private static int totalAccounts = 0;

 public static void incrementAccounts() {
     totalAccounts++;
 }

 public static int getTotalAccounts() {
     return totalAccounts;
 }
}