import java.util.*;
import java.io.*;

class LineThemUp{

    static int comparison(char prev, char curr){
        if(prev > curr){
            return -1;
        }else if(curr > prev){
            return 1;
        }
        else{
            return 0;
        }
    }
    static String solve(String [] a){
        char prevChar = a[0].charAt(0);
        char currChar = a[0].charAt(0);
        int comp1 = comparison(prevChar,currChar);
        int currComp=0;

        for(int i=2;i<a.length;i++){
            prevChar = a[i-1].charAt(0);
            currChar = a[i].charAt(0);
            currComp = comparison(prevChar,currChar);
            if(comp1 != currComp) return "NEITHER";
        }
        System.out.print(currComp+" "+comp1);
        if(comp1 == 1) return "INCREASING";
        else return "DECREASING";
    }
}


