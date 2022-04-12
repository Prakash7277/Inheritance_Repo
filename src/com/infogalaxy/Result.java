package com.infogalaxy;

public class Result extends Internal{
        int perc;
        int total;
        void setPerc(){
            //System.out.println("Enter The Percentage : ");
            //perc = sc.nextInt();
            total = m1 + m2;
            perc = total/2;
        }
        void getResult(){
            System.out.println("ID : "+id);
            System.out.println("Name : "+name);
            System.out.println("M1 Mark : "+m1);
            System.out.println("M2 Mark : "+m2);
            System.out.println("Total Marks : "+total);
            System.out.println("Percentage : "+perc);
        }
    }
    class Main {
        public static void main(String[] args) {
            com.infogalaxy.Result result = new com.infogalaxy.Result();
            result.setStudent();
            result.setMarks();
            result.setPerc();
            result.getResult();
        }
    }


