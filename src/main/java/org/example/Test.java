package org.example;


import java.util.Scanner;

public class Test {
//    psvm or main
    public static void main(String[] args) {


        int minAge = 18;
        int currentAge = 34;

        if(currentAge>minAge){
            System.out.println("Okay");
        }else System.out.println("UariaTqvenze");

//        kkk(18);
//        thirdLec();
        levanisEx();
    }


    public static void firstLec(){
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

    }

    public static void secondLec(int currentAge){

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

    public static void thirdLec(){

//        for (int i=0; i<10; i++){
//            if (i%5==0){
//                continue;
//            }
//            System.out.println("Test" + i);
//        }


        for (int i=0; i<10; i++){
            if (i!=0 && i%5==0){
                break;
            }
            System.out.println("Test" + i);
        }

//        for (int i=0; i<3; i++){
//            System.out.println("Test_I = " + i);
//
//            for (int j=0; j<5; j++){
//                System.out.println("    TestFor_J = " + j);
//            }
//        }

        int i = 0;
        while(i<5){
            if(i==3)break;
            System.out.println(i);
            i++;

        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
//        int number = scanner.nextInt();
//
//        while (number!=0){
//            System.out.println("Your num: " + number);
//            number = scanner.nextInt();
//        }


        double[] list = {3,4,4.4,2,3,2};

        for(int iii = 0; iii<list.length;iii++){
            System.out.println(list[iii]);
        }

        String[] strings = {"K1","K2","K3","K4"};

        strings[1] = "KK";

        for (int l=0; l<strings.length;l++){
            System.out.println(strings[l]);
        }

    }

    public static void levanisEx(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("გარეთ ატლასი შიგნით ათასი. \nრა არის?: ");
        String answer = scanner.next();


        while (!answer.equals("ბროწეული")){
            if (answer.equals("broweuli")){
                break;
            }
            System.out.println("პასუხი არ არის სწორი!\n");
            System.out.print("გარეთ ატლასი შიგნით ათასი. \nრა არის?: ");

            answer = scanner.next();
        }
        System.out.println("პასუხი სწორია <3");
    }
}
