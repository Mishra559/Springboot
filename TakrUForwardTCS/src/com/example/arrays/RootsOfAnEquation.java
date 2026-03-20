    package com.example.arrays;

    public class RootsOfAnEquation {
        public static void main(String[] args) {
            double a = 1;
            double b = 1;
            double c = 1;


            double D = b*b  - 4*a*c;
            System.out.println(D);

            if(D>0){
                System.out.println("Roots are real and different");
                double root1 = (-b + Math.sqrt(D))/(2*a);
                double root2 = (-b - Math.sqrt(D))/(2*a);
                System.out.println(root1);
                System.out.println(root2);
            }
            else if (D == 0) {
                System.out.println("Roots are real and equal");
                double root = -b/(2*a);
                System.out.println(root);

            }
            else {
                System.out.println("Roots are not real");
            }
        }
    }
