/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ansam
 */
public class TransactionTable {

    private final List<state> table = new ArrayList<>();
    public ArrayList<output> outTable = new ArrayList<>();
    public TransactionTable() {
        state s = new state();

        // STATE 1
        s.currentStateNo = 1;
        s.lexeme[0] = "O";
        s.nextStatesNo[0] = 2;

        s.lexeme[1] = "C";
        s.nextStatesNo[1] = 9;

        s.lexeme[2] = "I";
        s.nextStatesNo[2] = 12;

        s.lexeme[3] = "N";
        s.nextStatesNo[3] = 23;

        s.lexeme[4] = "R";
        s.nextStatesNo[4] = 31;

        s.lexeme[5] = "'";
        s.nextStatesNo[5] = 90;

        s.lexeme[6] = "\"";
        s.nextStatesNo[6] = 89;

        s.lexeme[7] = "G";
        s.nextStatesNo[7] = 48;

        s.lexeme[8] = "=";
        s.nextStatesNo[8] = 80;

        s.lexeme[9] = "-";
        s.nextStatesNo[9] = 87;

        s.lexeme[10] = "L";
        s.nextStatesNo[10] = 55;

        s.lexeme[11] = "S";
        s.nextStatesNo[11] = 62;

        s.lexeme[12] = "(";
        s.nextStatesNo[12] = 85;

        s.lexeme[13] = ")";
        s.nextStatesNo[13] = 85;

        s.lexeme[14] = "{";
        s.nextStatesNo[14] = 85;

        s.lexeme[15] = "}";
        s.nextStatesNo[15] = 85;

        s.lexeme[16] = "[";
        s.nextStatesNo[16] = 85;

        s.lexeme[17] = "]";
        s.nextStatesNo[17] = 85;

        s.lexeme[18] = "+";
        s.nextStatesNo[18] = 76;

       

        s.lexeme[19] = "*";
        s.nextStatesNo[19] = 76;

        s.lexeme[20] = "/";
        s.nextStatesNo[20] = 76;

        s.lexeme[21] = "&";
        s.nextStatesNo[21] = 77;

        s.lexeme[22] = "|";
        s.nextStatesNo[22] = 78;

        s.lexeme[23] = "~";
        s.nextStatesNo[23] = 79;

        s.lexeme[24] = "!";
        s.nextStatesNo[24] = 81;

        s.lexeme[25] = ">";
        s.nextStatesNo[25] = 82;

        s.lexeme[26] = "<";
        s.nextStatesNo[26] = 83;

        s.lexeme[27] = "0";
        s.nextStatesNo[27] = 86;

        s.lexeme[28] = "1";
        s.nextStatesNo[28] = 86;

        s.lexeme[29] = "2";
        s.nextStatesNo[29] = 86;

        s.lexeme[30] = "3";
        s.nextStatesNo[30] = 86;

        s.lexeme[31] = "4";
        s.nextStatesNo[31] = 86;

        s.lexeme[32] = "5";
        s.nextStatesNo[32] = 86;

        s.lexeme[33] = "6";
        s.nextStatesNo[33] = 86;

        s.lexeme[34] = "7";
        s.nextStatesNo[34] = 86;

        s.lexeme[35] = "8";
        s.nextStatesNo[35] = 86;

        s.lexeme[36] = "9";
        s.nextStatesNo[36] = 86;

        s.lexeme[37] = ".";
        s.nextStatesNo[37] = 91;

        s.lexeme[38] = "$";
        s.nextStatesNo[38] = 92;

        s.lexeme[39] = "@";
        s.nextStatesNo[39] = 93;

        s.Accept[0] = "false";
        table.add(s);

        // STATE 2
        s = new state();
        s.currentStateNo = 2;
        s.lexeme[0] = "u";
        s.nextStatesNo[0] = 3;
        s.Accept[0] = "false";
        table.add(s);

        // STATE 3
        s = new state();
        s.currentStateNo = 3;
        s.lexeme[0] = "t";
        s.nextStatesNo[0] = 4;
        s.Accept[0] = "false";
        table.add(s);

        // STATE 4
        s = new state();
        s.currentStateNo = 4;
        s.lexeme[0] = "L";
        s.nextStatesNo[0] = 5;
        s.Accept[0] = "false";
        table.add(s);

        // STATE 5
        s = new state();
        s.currentStateNo = 5;
        s.lexeme[0] = "o";
        s.nextStatesNo[0] = 6;
        s.Accept[0] = "false";
        table.add(s);
        // STATE 6
        s = new state();
        s.currentStateNo = 6;
        s.lexeme[0] = "o";
        s.nextStatesNo[0] = 7;
        s.Accept[0] = "false";
        table.add(s);

        // STATE 7
        s = new state();
        s.currentStateNo = 7;
        s.lexeme[0] = "p";
        s.nextStatesNo[0] = 8;
        s.Accept[0] = "false";
        table.add(s);

        // STATE 8
        s = new state();
        s.currentStateNo = 8;
        s.Accept[0] = "true";
        s.Accept[1] = "Break";
        table.add(s);

        // STATE 9
        s = new state();
        s.currentStateNo = 9;
        s.lexeme[0] = "h";
        s.nextStatesNo[0] = 10;
        s.Accept[0] = "false";
        table.add(s);

        // stat 10 
        s = new state();
        s.currentStateNo = 10;
        s.lexeme[0] = "j";
        s.nextStatesNo[0] = 11;
        s.Accept[0] = "false";
        table.add(s);

        // state 11
        s = new state();
        s.currentStateNo = 11;
        s.Accept[0] = "true";
        s.Accept[1] = "character";
        table.add(s);

// state 12
        s = new state();
        s.currentStateNo = 12;
        s.lexeme[0] = "F";
        s.nextStatesNo[0] = 13;
        s.lexeme[1] = "n";
        s.nextStatesNo[1] = 14;
        s.lexeme[2] = "M";
        s.nextStatesNo[2] = 20;
        s.lexeme[3] = "m";
        s.nextStatesNo[3] = 20;
        s.Accept[0] = "false";
        table.add(s);

        // state 13
        s = new state();
        s.currentStateNo = 13;
        s.lexeme[0] = "T";
        s.nextStatesNo[0] = 96;
        s.Accept[0] = "false";
        table.add(s);

// state 14
        s = new state();
        s.currentStateNo = 14;
        s.lexeme[0] = "c";
        s.nextStatesNo[0] = 15;
        s.Accept[0] = "false";
        table.add(s);

// state 15
        s = new state();
        s.currentStateNo = 15;
        s.lexeme[0] = "l";
        s.nextStatesNo[0] = 16;
        s.Accept[0] = "false";
        table.add(s);

// state 16
        s = new state();
        s.currentStateNo = 16;
        s.lexeme[0] = "u";
        s.nextStatesNo[0] = 17;
      
        s.Accept[0] = "false";
        table.add(s);

//state 17
        s = new state();
        s.currentStateNo = 17;
        s.lexeme[0] = "d";
        s.nextStatesNo[0] = 18;
        s.Accept[0] = "false";
        table.add(s);

//state 18 
        s = new state();
        s.currentStateNo = 18;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 19;
        s.Accept[0] = "false";
        table.add(s);

//state 19
        s = new state();
        s.currentStateNo = 19;
        s.Accept[0] = "true";
        s.Accept[1] = "inclusion";
        table.add(s);

//state 20
        s = new state();
        s.currentStateNo = 20;
        s.lexeme[0] = "w";
        s.nextStatesNo[0] = 21;
        s.Accept[0] = "false";
        table.add(s);

//state 21
        s = new state();
        s.currentStateNo = 21;
        s.lexeme[0] = "f";
        s.nextStatesNo[0] = 22;
        s.Accept[0] = "true";
        s.Accept[1]="integer";
        table.add(s);

//state 22
        s = new state();
        s.currentStateNo = 22;
        s.Accept[0] = "true";
        s.Accept[1] = "float";
        table.add(s);

//state 23
        s = new state();
        s.currentStateNo = 23;
        s.lexeme[0] = "O";
        s.nextStatesNo[0] = 24;
        s.Accept[0] = "false";
        table.add(s);

//state 24 
        s = new state();
        s.currentStateNo = 24;
        s.lexeme[0] = "R";
        s.nextStatesNo[0] = 25;
        s.Accept[0] = "false";
        table.add(s);

//state 25 
        s = new state();
        s.currentStateNo = 25;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 26;
        s.Accept[0] = "false";
        table.add(s);

// state 26
        s = new state();
        s.currentStateNo = 26;
        s.lexeme[0] = "t";
        s.nextStatesNo[0] = 27;
        s.Accept[0] = "false";
        table.add(s);

// state 27
        s = new state();
        s.currentStateNo = 27;
        s.lexeme[0] = "u";
        s.nextStatesNo[0] = 28;
        s.Accept[0] = "false";
        table.add(s);

//state 28 
        s = new state();
        s.currentStateNo = 28;
        s.lexeme[0] = "r";
        s.nextStatesNo[0] = 29;
        s.Accept[0] = "false";
        table.add(s);

//state 29
        s = new state();
        s.currentStateNo = 29;
        s.lexeme[0] = "n";
        s.nextStatesNo[0] = 30;
        s.Accept[0] = "false";
        table.add(s);

// state 30 
        s = new state();
        s.currentStateNo = 30;
        s.Accept[0] = "true";
        s.Accept[1] = "void";
        table.add(s);

        //State 31
        s = new state();
        s.currentStateNo = 31;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 32;
        s.Accept[0] = "false";
        table.add(s);

        //State 32
        s = new state();
        s.currentStateNo = 32;
        s.lexeme[0] = "p";
        s.nextStatesNo[0] = 40;
        s.lexeme[1] = "i";
        s.nextStatesNo[1] = 33;
        s.Accept[0] = "false";
        table.add(s);

        //State 33
        s = new state();
        s.currentStateNo = 33;
        s.lexeme[0] = "t";
        s.nextStatesNo[0] = 34;
        s.Accept[0] = "false";
        table.add(s);

        //State 34
        s = new state();
        s.currentStateNo = 34;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 35;
        s.Accept[0] = "false";
        table.add(s);

        //State 35
        s = new state();
        s.currentStateNo = 35;
        s.lexeme[0] = "r";
        s.nextStatesNo[0] = 36;
        s.Accept[0] = "false";
        table.add(s);

        //State 36
        s = new state();
        s.currentStateNo = 36;
        s.lexeme[0] = "a";
        s.nextStatesNo[0] = 37;
        s.Accept[0] = "false";
        table.add(s);

        //State 37
        s = new state();
        s.currentStateNo = 37;
        s.lexeme[0] = "t";
        s.nextStatesNo[0] = 38;
        s.Accept[0] = "false";
        table.add(s);

        //State 38
        s = new state();
        s.currentStateNo = 38;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 39;
        s.Accept[0] = "false";
        table.add(s);

        //State 39
        s = new state();
        s.currentStateNo = 39;
        s.Accept[0] = "true";
        s.Accept[1] = "loop";
        table.add(s);

        //State 40
        s = new state();
        s.currentStateNo = 40;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 41;
        s.Accept[0] = "false";
        table.add(s);

        //State 41
        s = new state();
        s.currentStateNo = 41;
        s.lexeme[0] = "a";
        s.nextStatesNo[0] = 42;
        s.Accept[0] = "false";
        table.add(s);

        //State 42
        s = new state();
        s.currentStateNo = 42;
        s.lexeme[0] = "t";
        s.nextStatesNo[0] = 43;
        s.Accept[0] = "false";
        table.add(s);

        //State 43
        s = new state();
        s.currentStateNo = 43;
        s.lexeme[0] = "W";
        s.nextStatesNo[0] = 44;
        s.Accept[0] = "false";
        table.add(s);

        //State 44
        s = new state();
        s.currentStateNo = 44;
        s.lexeme[0] = "h";
        s.nextStatesNo[0] = 45;
        s.Accept[0] = "false";
        table.add(s);

        //State 45
        s = new state();
        s.currentStateNo = 45;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 46;
        s.Accept[0] = "false";
        table.add(s);

        //State 46
        s = new state();
        s.currentStateNo = 46;
        s.lexeme[0] = "n";
        s.nextStatesNo[0] = 47;
        s.Accept[0] = "false";
        table.add(s);

        //State 47
        s = new state();
        s.currentStateNo = 47;
        s.Accept[0] = "true";
        s.Accept[1] = "loop";
        table.add(s);

        //State 48
        s = new state();
        s.currentStateNo = 48;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 49;
        s.Accept[0] = "false";
        table.add(s);

        //State 49
        s = new state();
        s.currentStateNo = 49;
        s.lexeme[0] = "t";
        s.nextStatesNo[0] = 50;
        s.Accept[0] = "false";
        table.add(s);

        //State 50
        s = new state();
        s.currentStateNo = 50;
        s.lexeme[0] = "B";
        s.nextStatesNo[0] = 51;
        s.Accept[0] = "false";
        table.add(s);

        //State 51
        s = new state();
        s.currentStateNo = 51;
        s.lexeme[0] = "a";
        s.nextStatesNo[0] = 52;
        s.Accept[0] = "false";
        table.add(s);

        //State 52
        s = new state();
        s.currentStateNo = 52;
        s.lexeme[0] = "c";
        s.nextStatesNo[0] = 53;
        s.Accept[0] = "false";
        table.add(s);

        //State 53
        s = new state();
        s.currentStateNo = 53;
        s.lexeme[0] = "k";
        s.nextStatesNo[0] = 54;
        s.Accept[0] = "false";
        table.add(s);

        //State 54
        s = new state();
        s.currentStateNo = 54;
        s.Accept[0] = "true";
        s.Accept[1] = "return";
        table.add(s);

        // stat 55 
        s = new state();
        s.currentStateNo = 55;
        s.lexeme[0] = "o";
        s.nextStatesNo[0] = 56;
        s.lexeme[1] = "a";
        s.nextStatesNo[1] = 59;
        s.Accept[0] = "false";
        table.add(s);

// state 56
        s = new state();
        s.currentStateNo = 56;
        s.lexeme[0] = "l";
        s.nextStatesNo[0] = 57;
        s.Accept[0] = "false";
        table.add(s);

//state 57 
        s = new state();
        s.currentStateNo = 57;
        s.lexeme[0] = "i";
        s.nextStatesNo[0] = 58;
        s.Accept[0] = "false";
        table.add(s);

//state 58
        s = new state();
        s.currentStateNo = 58;
        s.Accept[0] = "true";
        s.Accept[1] = "struct";
        table.add(s);

// state 59
        s = new state();
        s.currentStateNo = 59;
        s.lexeme[0] = "s";
        s.nextStatesNo[0] = 60;
        s.Accept[0] = "false";
        table.add(s);

//state 60
        s = new state();
        s.currentStateNo = 60;
        s.lexeme[0] = "t";
        s.nextStatesNo[0] = 61;
        s.Accept[0] = "false";
        table.add(s);

//state 61 
        s = new state();
        s.currentStateNo = 61;
        s.Accept[0] = "true";
        s.Accept[1] = "end";
        table.add(s);

// state 62
        s = new state();
        s.currentStateNo = 62;
        s.lexeme[0] = "t";
        s.nextStatesNo[0] = 68;
        s.lexeme[1] = "e";
        s.nextStatesNo[1] = 63;
        s.lexeme[2] = "I";
        s.nextStatesNo[2] = 72;
        s.Accept[0] = "false";
        table.add(s);

//state 63
        s = new state();
        s.currentStateNo = 63;
        s.lexeme[0] = "r";
        s.nextStatesNo[0] = 64;
        s.Accept[0] = "false";
        table.add(s);

// state 64
        s = new state();
        s.currentStateNo = 64;
        s.lexeme[0] = "i";
        s.nextStatesNo[0] = 65;
        s.Accept[0] = "false";
        table.add(s);

// state 65
        s = new state();
        s.currentStateNo = 65;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 66;
        s.Accept[0] = "false";
        table.add(s);

//state 66
        s = new state();
        s.currentStateNo = 66;
        s.lexeme[0] = "s";
        s.nextStatesNo[0] = 67;
        s.Accept[0] = "false";
        table.add(s);

//state 67
        s = new state();
        s.currentStateNo = 67;
        s.Accept[0] = "true";
        s.Accept[1] = "Group of character";
        table.add(s);

//state 68
        s = new state();
        s.currentStateNo = 68;
        s.lexeme[0] = "a";
        s.nextStatesNo[0] = 69;
        s.Accept[0] = "false";
        table.add(s);

// state 69
        s = new state();
        s.currentStateNo = 69;
        s.lexeme[0] = "r";
        s.nextStatesNo[0] = 70;
        s.Accept[0] = "false";
        table.add(s);

        //state 70
        s = new state();
        s.currentStateNo = 70;
        s.lexeme[0] = "t";
        s.nextStatesNo[0] = 71;
        s.Accept[0] = "false";
        table.add(s);

// state 71
        s = new state();
        s.currentStateNo = 71;
        s.Accept[0] = "true";
        s.Accept[1] = "start";
        table.add(s);

//state 72
        s = new state();
        s.currentStateNo = 72;
        s.lexeme[0] = "M";
        s.nextStatesNo[0] = 73;
        s.Accept[0] = "false";
        table.add(s);

//state 73
        s = new state();
        s.currentStateNo = 73;
        s.lexeme[0] = "w";
        s.nextStatesNo[0] = 74;
        s.Accept[0] = "false";
        table.add(s);

//state 74
        s = new state();
        s.currentStateNo = 74;
        s.lexeme[0] = "f";
        s.nextStatesNo[0] = 75;
        s.Accept[0] = "false";
        table.add(s);

//state 75
        s = new state();
        s.currentStateNo = 75;
        s.Accept[0] = "true";
        s.Accept[1] = "S_float";
        table.add(s);

//state 76
        s = new state();
        s.currentStateNo = 76;
        s.lexeme[0] = "@";
        s.nextStatesNo[0] = 94;
        s.lexeme[1] = "^";
        s.nextStatesNo[1] = 94;
        s.Accept[0] = "true";
        s.Accept[1] = "Arthimetic operation";
        table.add(s);

//state 77
        s = new state();
        s.currentStateNo = 77;
        s.lexeme[0] = "&";
        s.nextStatesNo[0] = 79;
        s.Accept[0] = "false";
        table.add(s);

//state 78
        s = new state();
        s.currentStateNo = 78;
        s.lexeme[0] = "|";
        s.nextStatesNo[0] = 79;
        s.Accept[0] = "false";
        table.add(s);

//state 79
        s = new state();
        s.currentStateNo = 79;
        s.Accept[0] = "true";
        s.Accept[1] = "logic operation";
        table.add(s);

//state 80 
        s = new state();
        s.currentStateNo = 80;
        s.lexeme[0] = "=";
        s.nextStatesNo[0] = 84;
        s.Accept[0] = "true";
        s.Accept[1] = "Assignment operation";
        table.add(s);

//state 81
        s = new state();
        s.currentStateNo = 81;
         s.lexeme[0] = "=";
        s.nextStatesNo[0] = 84;
        s.Accept[0] = "false";
        table.add(s);

//state 82
        s = new state();
        s.currentStateNo = 82;
        s.lexeme[0] = "=";
        s.nextStatesNo[0] = 84;
         s.Accept[0] = "true";
        s.Accept[1] = "Relational operation";
        table.add(s);

//state 83
 s = new state();
        s.currentStateNo = 83;
        s.lexeme[0] = "=";
        s.nextStatesNo[0] = 84;
         s.Accept[0] = "true";
        s.Accept[1] = "Relational operation";
        table.add(s);
//state 84
        s = new state();
        s.currentStateNo = 84;
        s.Accept[0] = "true";
        s.Accept[1] = "Relational operation";
        table.add(s);

//state 85
        s = new state();
        s.currentStateNo = 85;
        s.Accept[0] = "true";
        s.Accept[1] = "brace";
        table.add(s);

//state 86
        s = new state();
        s.currentStateNo = 86;
        
        s.lexeme[0] = "0";
        s.nextStatesNo[0] = 86;
        s.lexeme[1] = "1";
        s.nextStatesNo[1] = 86;
        s.lexeme[2] = "2";
        s.nextStatesNo[2] = 86;
        s.lexeme[3] = "3";
        s.nextStatesNo[3] = 86;
        s.lexeme[4] = "4";
        s.nextStatesNo[4] = 86;
        s.lexeme[5] = "5";
        s.nextStatesNo[5] = 86;
        s.lexeme[6] = "6";
        s.nextStatesNo[6] = 86;
        s.lexeme[7] = "7";
        s.nextStatesNo[7] = 86;
        s.lexeme[8] = "8";
        s.nextStatesNo[8] = 86;
        s.lexeme[9] = "9";
        s.nextStatesNo[9] = 86;
        
        s.Accept[0] = "true";
        s.Accept[1] = "constant";
        table.add(s);

//state 87
        s = new state();
        s.currentStateNo = 87;
        s.lexeme[0] = ">";
        s.nextStatesNo[0] = 88;
        s.Accept[0] = "true";
        s.Accept[1]="Arithmatic operation";
        table.add(s);

// state 88
        s = new state();
        s.currentStateNo = 88;
        s.Accept[0] = "true";
        s.Accept[1] = "Acces operation";
        table.add(s);

//state 89
        s = new state();
        s.currentStateNo = 89;
        s.Accept[0] = "true";
        s.Accept[1] = "qutation mark";
        table.add(s);

//state 90
        s = new state();
        s.currentStateNo = 90;
        s.Accept[0] = "true";
        s.Accept[1] = "qutation mark";
        table.add(s);

// state 91
        s = new state();
        s.currentStateNo = 91;
        s.Accept[0] = "true";
        s.Accept[1] = "line delimter";
        table.add(s);

//state 92
        s = new state();
        s.currentStateNo = 92;
        s.Accept[0] = "true";
        s.Accept[1] = "token delimter";
        table.add(s);

// state 93
        s = new state();
        s.currentStateNo = 93;
        s.lexeme[0] = "/";
        s.nextStatesNo[0] = 95;
        s.Accept[0] = "false";
        table.add(s);

//state 94
        s = new state();
        s.currentStateNo = 94;
        s.Accept[0] = "true";
        s.Accept[1] = "comment";
        table.add(s);

//state 95
        s = new state();
        s.currentStateNo = 95;
        s.Accept[0] = "true";
        s.Accept[1] = "comment";
        table.add(s);

//state 96
        s = new state();
        s.currentStateNo = 96;
        s.lexeme[0] = "r";
        s.nextStatesNo[0] = 97;
        s.Accept[0] = "false";
        table.add(s);

//state 97
        s = new state();
        s.currentStateNo = 97;
        s.lexeme[0] = "u";
        s.nextStatesNo[0] = 98;
        s.Accept[0] = "false";
        table.add(s);

// state 98
        s = new state();
        s.currentStateNo = 98;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 99;
        s.Accept[0] = "true";
        s.Accept[1] = "condition";
        table.add(s);

//state 99
        s = new state();
        s.currentStateNo = 99;
        s.lexeme[0] = "O";
        s.nextStatesNo[0] = 100;
        s.Accept[0] = "false";
        table.add(s);

//state 100
        s = new state();
        s.currentStateNo = 100;
        s.lexeme[0] = "t";
        s.nextStatesNo[0] = 101;
        s.Accept[0] = "false";
        table.add(s);

//state 101
        s = new state();
        s.currentStateNo = 101;
        s.lexeme[0] = "h";
        s.nextStatesNo[0] = 102;
        s.Accept[0] = "false";
        table.add(s);

//state 102
        s = new state();
        s.currentStateNo = 102;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 103;
        s.Accept[0] = "false";
        table.add(s);

//state 103
        s = new state();
        s.currentStateNo = 103;
        s.lexeme[0] = "r";
        s.nextStatesNo[0] = 104;
        s.Accept[0] = "false";
        table.add(s);

// state 104
        s = new state();
        s.currentStateNo = 104;
        s.lexeme[0] = "w";
        s.nextStatesNo[0] = 105;
        s.Accept[0] = "false";
        table.add(s);

//state 105
        s = new state();
        s.currentStateNo = 105;
        s.lexeme[0] = "i";
        s.nextStatesNo[0] = 106;
        s.Accept[0] = "false";
        table.add(s);

//state 106
        s = new state();
        s.currentStateNo = 106;
        s.lexeme[0] = "s";
        s.nextStatesNo[0] = 107;
        s.Accept[0] = "false";
        table.add(s);

//state 107
        s = new state();
        s.currentStateNo = 107;
        s.lexeme[0] = "e";
        s.nextStatesNo[0] = 108;
        s.Accept[0] = "false";
        table.add(s);

//state 108
        s = new state();
        s.currentStateNo = 108;
        s.Accept[0] = "true";
        s.Accept[1] = "condition";
        table.add(s);

    }

    public void scanner2() {
        int nextState = 1;
        int i = 0;
        int j = 0;
        int count = 0;
        boolean notfound = false;
        boolean ID = false;
        // boolean fAccept= true;
        state s = table.get(nextState - 1);
        while (count < outTable.size()) {
            output o = outTable.get(count);
            

            while (i < o.lexeme.length()) {

                s = table.get(nextState - 1);
                if (o.lexeme.length() > i || s.Accept[0].equals("false")) {//lenght 5elas w al state accept => false
                    if (!notfound) {
                        String c = Character.toString(o.lexeme.charAt(i));

                        while (j <= s.lexeme.length) {
                            String value = s.lexeme[j];
                            if (value != null) {
                                if (value.equals(c)) {
                                    nextState = s.nextStatesNo[j];
                                    j = 0;
                                    break;
                                }
                            } else {

                                notfound = true;
                                break;
                            }
                            j++;
                        }

                    } else {

                        break;
                    }

                }

                // s = table.get(nextState - 1);
                i++;

            }
            if( s.Accept[0].equals("false")||table.get(nextState-1).Accept[0].equals("true")){
                s = table.get(nextState - 1);}

            if (s.Accept[0].equals("true") && !notfound) {
                o.ReturnToken = s.Accept[1];
                o.match = true;
                outTable.set(count, o);
                System.out.println(o.toString());//test

            }
            if (notfound || s.Accept[0].equals("false")) {
                int con = 0;
                StringBuilder b = new StringBuilder();
                while (con < o.lexeme.length()) {
                    //System.out.println(con);
                    if (con == 0 && (Character.isLetter(o.lexeme.charAt(con)) || o.lexeme.charAt(con) == '_')) {
                        b.append(o.lexeme.charAt(con));

                    } //finish
                    else if (con == 0 && !(Character.isLetter(o.lexeme.charAt(con)) || o.lexeme.charAt(con) == '_')) {
                        System.err.println("error 2");
                        o.ReturnToken = "error";
                        o.match = false;
                        outTable.set(count, o);
                        System.out.println(o.toString());//test
                        notfound=false;
                        break;
                    }

                    if (con != 0 && (Character.isLetterOrDigit(o.lexeme.charAt(con)) || o.lexeme.charAt(con) == '_')) {
                        b.append(o.lexeme.charAt(con));
                    } else if (con != 0) {
                        System.err.println("error 1");
                        o.ReturnToken = "error";
                        o.match = false;
                        outTable.set(count, o);
                        System.out.println(o.toString());//test
                        notfound=false;
                        break;
                    }
                    con++;
                }
                if (b.toString().equals(o.lexeme)) {
                    //System.err.println("ID");
                    o.ReturnToken = "ID";
                    o.match = true;
                    outTable.set(count, o);
                    System.out.println(o.toString());//test
                    notfound=false;
                }
            }
            
            
             i = 0;
            j = 0;
            nextState=1;
            s = table.get(nextState - 1);
            count++;
        }

    }
}
