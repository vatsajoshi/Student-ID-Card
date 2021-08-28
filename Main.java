package com.studentcompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String Yourgroup = "group";

        System.out.println("Enter Name: ");
        Scanner name = new Scanner(System.in);
        String urname = name.nextLine();

        System.out.println("Enter Age: ");
        Scanner age = new Scanner(System.in);
        int urage = Integer.parseInt(age.nextLine());

        if(urage >= 20) {
            Yourgroup = "RED";
        }else if(urage >= 15  && urage<20) {
            Yourgroup = "BLUE";
        }else if (urage >= 10 && urage<15){
            Yourgroup = "YELLOW";
        }

        System.out.println("Enter Blood Group: ");
        Scanner Bloodgroup = new Scanner(System.in);
        String urBloodgroup = Bloodgroup.nextLine();

        System.out.println();

        System.out.println("---------------");
        System.out.println("Name: " + urname);
        System.out.println("Age: " + urage);
        System.out.println("Blood Group :" + urBloodgroup);
        System.out.println("---------------");
        System.out.println("Your group is " + Yourgroup);
        System.out.println("---------------");

    }
}
