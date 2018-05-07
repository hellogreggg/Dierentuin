package com.company;

import java.util.ArrayList;


class Personeel extends Dierentuin{

   public ArrayList<String> personen = new ArrayList<>();

   public void Personeel(String naam){
       personen.add(naam);
   }
   

   public void List(){
       for (String x : personen){
           System.out.println(x);
       }
   }






}
