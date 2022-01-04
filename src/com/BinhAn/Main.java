package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,bim;
        System.out.print("nhập cân nặng");
        weight = sc.nextDouble();
        System.out.print("nhập chiều cao");
        height = sc.nextDouble();
        bim = weight/Math.pow(height,2);
        if (bim<18.5){
            System.out.printf("Underweight");
        }else if (bim<25){
            System.out.printf("Normal");

        }else if (bim<30){
            System.out.printf("Overweight");
        }else if (30< bim){
            System.out.printf("Obese");
        }
    }
}
