/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

/**
 *
 * @author Ansam
 */
public class state {
   public int currentStateNo;
   public String lexeme[]=new String[100];
   public int nextStatesNo[]=new int[100];
   public String Accept[]=new String[2];  
}
