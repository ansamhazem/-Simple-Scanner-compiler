/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import myi.task.IDDE;

/**
 *
 * @author Ansam
 */
public class scan {

    public static TransactionTable table ;
     public static int  NoLine = 1;
    public static int NoInLine = 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        table = new TransactionTable();
        //table.scan("lddlo", 0, 0);
       /* ArrayList<Character> MyChar = new ArrayList<>();
        while (MyChar.add((char) System.in.read())) {
            if (MyChar.get(MyChar.size() - 1).equals('0')) {
                break;
            }
        }

        DoToken(MyChar, table);
        System.out.println("lineNo" + " " + "lexeme" + " " + "ReturnToken" + " " + "LexemelineNo" + " " + "match");
        for (int i = 0; i < table.outTable.size(); i++) {
            System.out.println(table.outTable.get(i).lineNo + " " + table.outTable.get(i).lexeme + " " + table.outTable.get(i).ReturnToken + " " + table.outTable.get(i).LexemelineNo + " " + table.outTable.get(i).match);
        }*/
       
       new IDDE().setVisible(true);
    }

    public static void DoToken(ArrayList<Character> input, TransactionTable ObjectOfTable) throws IOException {

       
        int flag = 1;
        int flagSpecial = 1;
        int flagLine = 1;
        String include="";
        int index ;
        String Path ="";
        
        char[] SpicialChar = {'+', '-', '*', '/', '&', '|', '~', '=', '<', '>', '!', '{', '}', '[', ']', '(', ')', '"', '\'', '@', '$', '.', '\n', ' '};
        output ObjectOfOutput = new output();
        String tok = new String();

        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < SpicialChar.length; j++) {

                if (input.get(i) == SpicialChar[j] || input.get(i) == '0') {

                    if ((input.get(i) == '\n' && i>=1 && (input.get(i-1)!='.')) ) {
                        
                        flagLine = 0;
                    }
                    if(input.get(i)=='.'&&!(i+4<input.size()&&input.get(i+1)=='t'&&input.get(i+2)=='x'&&input.get(i+3)=='t'&&input.get(i+4)==')'))
                    {
                        flagLine=0;
                    }
                    if (i + 1 < input.size()) {
                        if (input.get(i) == '/' && (input.get(i + 1) == '@' || input.get(i + 1) == '^')) {

                            flagSpecial = 0;
                        }
                        if (input.get(i) == '@' && input.get(i + 1) == '/') {

                            flagSpecial = 0;
                        }

                        if (input.get(i) == '&' && input.get(i + 1) == '&') {

                            flagSpecial = 0;
                        }

                        if (input.get(i) == '|' && input.get(i + 1) == '|') {

                            flagSpecial = 0;
                        }

                        if (input.get(i) == '-' && input.get(i + 1) == '>') {

                            flagSpecial = 0;
                        }

                        if (input.get(i) == '=' && input.get(i + 1) == '=') {

                            flagSpecial = 0;
                        }

                        if (input.get(i) == '!' && input.get(i + 1) == '=') {

                            flagSpecial = 0;
                        }

                        if (input.get(i) == '<' && input.get(i + 1) == '=') {

                            flagSpecial = 0;
                        }

                        if (input.get(i) == '>' && input.get(i + 1) == '=') {

                            flagSpecial = 0;
                        }
                    }

                    if (input.get(i) ==' ') {
                        ObjectOfOutput = new output();
                        ObjectOfOutput.lexeme = tok;
                        ObjectOfOutput.LexemelineNo = NoInLine;
                        ObjectOfOutput.lineNo = NoLine;
                        NoInLine = NoInLine + 1;
                        ObjectOfTable.outTable.add(ObjectOfOutput);
                        tok = "";
                        flag = 0;//
                        break;
                    }

                    if (!tok.equals("")) {//علشان لو جاب حرف مخصوص فى اول الكلام
                        ObjectOfOutput = new output();
                        ObjectOfOutput.lexeme = tok;
                        ObjectOfOutput.LexemelineNo = NoInLine;
                        ObjectOfOutput.lineNo = NoLine;
                        NoInLine = NoInLine + 1;
                        ObjectOfTable.outTable.add(ObjectOfOutput);
                        tok = "";
                    }
                    if (flagSpecial == 0) {//علشان اعرف الاتنين اللى ورا بعض صح ولا لأ
                        tok = tok + input.get(i) + input.get(i + 1);
                        i = i + 1;
                        flagSpecial = 1;
                    } else {//توك المفروض فض
                        tok = tok + input.get(i).toString();
                    }
                    if (!tok.equals("\n")) {//علشان مايحطش الانتر فى الاراى
                        ObjectOfOutput = new output();
                        ObjectOfOutput.lexeme = tok;
                        ObjectOfOutput.LexemelineNo = NoInLine;
                        ObjectOfOutput.lineNo = NoLine;
                        NoInLine = NoInLine + 1;
                        ObjectOfTable.outTable.add(ObjectOfOutput);
                        tok = "";
                    } else {
                        tok = "";
                    }

                    if (flagLine == 0) {//علشان مايزودت السطر قبل ما يحط ال"."";""/n"
                        NoLine = NoLine + 1;
                        NoInLine = 1;
                        flagLine = 1;
                    }
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {//علشان ما يضفش حرف مخصوص على الكلمه اللى بجمع فيها
                tok = tok + input.get(i);
                if (tok.equals("Include")&& (i-6 == 0 || ((i-7) >= 0 &&(input.get(i-7)==' '||input.get(i-7)=='\n')))) {
                    Path = GetPath(i + 1, input);
                    //DoInclude(Path, ObjectOfTable);
                    include = tok;
                    index = i+1;
                }
            } else {
                flag = 1;
            }
            if(input.get(i).equals(')')&&!include.equals("")){
                //Path = GetPath(i + 1, input);
                DoInclude(Path, ObjectOfTable);
                Path="";
                include="";
                index=0;
            }
        }

    }

    private static String GetPath(int Start, ArrayList<Character> input) {
        String path = "";
        int Flagleft = 0;//علشان اعرف ان القوس اليمين جه الاول
        int Flagright = 0;//علشان اعرف نهايه عنوان الfile
        for (int i = Start; i < input.size(); i++) {
            if (input.get(i) == ' ') {
                continue;
            } else {
                if (input.get(i) == '(') {
                    Flagleft = 1;
                    continue;
                }
                if (input.get(i) == ')') {
                    Flagright = 1;
                }

                if (i  < input.size()) {
                    if (Flagright == 1 && Flagleft == 0) {
                        return "error";
                    } else {
                        if (Flagright == 1 && Flagleft == 1) {
                            return path;
                        }
                    }
                }
                if (Flagleft == 1) {
                    path = path + input.get(i);
                    continue;
                } else {
                    return "error";
                }
            }
        }
        return path;
    }

    public static ArrayList<Character> DoInclude(String FileName, TransactionTable ObjectOfTable) throws FileNotFoundException, IOException {
        ArrayList<Character> input = new ArrayList<>();
        String line;
        BufferedReader in;
        File f = new File(FileName);
        //---------------------------------------------------
        try {

            if (f.exists()) {
                in = new BufferedReader(new FileReader(FileName));
                line = in.readLine();

                while (line != null) {
                    int i = 0;
                    while (i < line.length()) {
                        input.add(line.charAt(i));
                        i++;
                    }
                    //System.out.println(line);
                    line = in.readLine();
                }
            } else {
                System.out.println("File does not exist");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //------------------
        
        DoToken(input, ObjectOfTable);
        return(input);
    }
}
