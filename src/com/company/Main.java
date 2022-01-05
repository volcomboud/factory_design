package com.company;

public class Main {

    public static void main(String[] args) {

    //Creer le factory qui servira à instancier les différents media
    communicationFactory commFactory = new communicationFactory();

    //Remarquer Comment chaque média est traiter de la même facon sans remodelage du code.
    // Les ajouts sont ainsi beaucoup plus simple pour la maintenance && les modifications

    Media medEmail = communicationFactory.getComm("email");
    medEmail.send();

    Media medTexto = communicationFactory.getComm("texto");
    medTexto.send();

    Media medAppel= communicationFactory.getComm("appel");
    medAppel.send();

    Media medFume = communicationFactory.getComm("fumee");
    medFume.send();

    }
}