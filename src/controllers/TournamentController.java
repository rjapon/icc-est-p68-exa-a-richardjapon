package controllers;

import models.Athlete;
import models.Tournament;

public class TournamentController {

  public void sortBubbleDesc(Athlete[] athletes){

    boolean swapp;
    for(int i = 0; i < athletes.length-1; i++){

      swapp = false;

      for(int j = 0; j < athletes.length -1 -i; j++){

        if (athletes[j].getPoints() < athletes[j+1].getPoints() ) {
          
          swapp = true;
          Athlete aux = athletes[j];
          athletes[j] = athletes[j+1];
          athletes[j+1] = aux;

        }
      }

      if (!swapp) {
        break;
      }

    }

  }

  public Tournament binarySearchByTotalStarterPointsFilaA(Tournament[] tournaments, int totalStarterPoints){
    
    int alto = tournaments.length - 1;
    int bajo = 0;

    while (bajo <= alto) {
      
      int centro = (alto + bajo)/2;

        if (tournaments[centro].getTotalStarterPoints() < 0){
          return centro;
        }


      }

          return -1;

    }  

}
