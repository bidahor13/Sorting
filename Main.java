package com.Babatunde;

public class Main {

    public static void main(String[] args) {
       String[] arsenalTeam = new String[11];
        //int[] shirtNumber = new int[11];
        int[] shirtNumber = {3,6,7,29,12,16,11};

        /**
         * Arsenal first team Player list
         */
        arsenalTeam[0] = "Gibbs";
        arsenalTeam[1] = "Bellerin";
        arsenalTeam[2] = "Sanchez";
        arsenalTeam[3] = "Xhaka";
        arsenalTeam[4] = "Giroud";
        arsenalTeam[5] = "Corzola";
        arsenalTeam[6] = "Ozil";
        /**
         * Shirt number assigned to each player every match.
         */
//        shirtNumber[0] = 3;
//        shirtNumber[1] = 6;
//        shirtNumber[2] = 7;
//        shirtNumber[3] = 29;
//        shirtNumber[4] = 16;
//        shirtNumber[5] = 11;

        /**
         * Display player details
         */
        System.out.println("Arsenal player: " + arsenalTeam[0] + " ==>  " +"Shirt number: " + shirtNumber[1] +"\n") ;
        System.out.println("Arsenal player: " + arsenalTeam[1] + " ==>" + "Shirt number: " + shirtNumber[2]+"\n") ;
        System.out.println("Arsenal player: " + arsenalTeam[2] + " ==>" + "Shirt number: " + shirtNumber[3]+"\n") ;
        System.out.println("Arsenal player: " + arsenalTeam[3] + " ==> " + "Shirt number: " + shirtNumber[4]+"\n") ;
        System.out.println("Arsenal player: " + arsenalTeam[4] + "==>  " + "Shirt number: " + shirtNumber[5]+"\n") ;
        System.out.println("Arsenal player: " + arsenalTeam[5] + " ==> " + "Shirt number: " + shirtNumber[6]+"\n") ;


    }
}
