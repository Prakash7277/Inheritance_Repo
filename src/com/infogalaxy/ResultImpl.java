package com.infogalaxy;

public class ResultImpl extends Student implements ISports {
        int perc;
        void setPerc(){
            System.out.println("Enter The Percentage : ");
            perc = sc.nextInt();
        }

    @Override
    public void calculate() {
            if(perc<35 && perc > 30){
                perc = perc + sperc;
            }
        }
        void showResult(){
            System.out.println("ID : "+ id);
            System.out.println("Name : "+ name);
            System.out.println("Percentage :"+perc);
        }
}



