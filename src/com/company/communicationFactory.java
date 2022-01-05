package com.company;

public class communicationFactory {

    //On va utiliser getComm() pour avoir l'objet de type Media

    public static Media getComm(String commType){
        if(commType == null){
            return null;
        }
        else if(commType.equalsIgnoreCase("email")){
            return new email();
        }
        else if(commType.equalsIgnoreCase("texto")){
            return new texto();
        }
        else if(commType.equalsIgnoreCase("appel")){
            return new appel();
        }
        else if (commType.equalsIgnoreCase("fumee")){
            return new signauxFumee();
        }
        else
            return null;
    }
}
