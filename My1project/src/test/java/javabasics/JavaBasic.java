package javabasics;

public class JavaBasic {
    public static void main(String[] args) {

String role="clerk";
        int numberofworkingdays=15;

        if(role.equals("manager")){
            System.out.println(numberofworkingdays * 500);
        }
        else if(role.equals("staff")){
            System.out.println(numberofworkingdays * 350);
        }
        else if ( role.equals("clerk")){
            System.out.println(numberofworkingdays * 200);
        }
        else {
            System.out.println("invalid input");
        }
    }
}