package it.develhope.ifstatement;

public class Start {
    public static void main(String[] args) {
        String myName = "Lucrezia";

        int length = myName.length();
        String result;

        if(length%2==0){
            result= "My name has an even number of letters";
        } else {
            result ="My name has an odd number of letters";
        }
        System.out.println(result);
    }
}



    
