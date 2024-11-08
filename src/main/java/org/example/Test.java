package org.example;


public class Test {
//    psvm or main
    public static void main(String[] args) {

        byte customerAge = 127;
        short salary = 32767;
        int salaryBig = 2147483647;
        long longSalary = 9223372036854775807L;

        float height = 1.65f;
        double heightD = 3.43;

        boolean t = true;

        char k = 'k';

        int a = 7;
        int b = 3;

        char aa= 'a';
        char bb= 'b';

        double c = (double) 7 /3;


        String fullName = "Aleksandre Soselia";

        fullName = fullName.toUpperCase();

        char char2 = fullName.charAt(2);
        int char3 = fullName.indexOf('L');

        String string1 = "Ako", string2 = "Ako";

        System.out.println(string1.concat(string2));
//      sout
        System.out.println(string1.compareTo(string2));
        System.out.println(string1.equals(string2));
        System.out.println("Hey\nHey\"Aaand\\");


//        int kk = Math.random();

        System.out.println(Math.min(5,3));
        System.out.println(Math.max(5,3));
        System.out.println(Math.max(5,3.7));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.sqrt(82));
        System.out.println(Math.abs(-82));
        System.out.println((int)(Math.random()*100));

        int minAge = 18;
        int currentAge = 34;

        if(currentAge>minAge){
            System.out.println("Okay");
        }else System.out.println("UariaTqvenze");

        kkk(18);
    }


    public static void kkk(int currentAge){

//        6-18 skola
//        19-24 student
//        25-64
        if(5<currentAge && currentAge<19){
            System.out.println("shkolaa");
        }else if(currentAge>18 && currentAge<25){
            System.out.println("student");
        }else if(currentAge>24 && currentAge< 65){
            System.out.println("business");
        }else if(64<currentAge){
            System.out.println("Pensia");
        }else System.out.println("Pawuka");


        System.out.println((currentAge<18)? "Yes":"No");

        switch (currentAge){
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
        }



    }



}
