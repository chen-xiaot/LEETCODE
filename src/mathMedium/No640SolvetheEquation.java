package mathMedium;

import java.util.ArrayList;
import java.util.List;

public class No640SolvetheEquation {

	public String solveEquation(String equation) {
        String[] part = equation.split("=");
        int leftSum = 0, rightSum = 0;
        
        for (String s : moveToList(part[0])) {
            if (s.indexOf("x") >= 0) {
                leftSum += Integer.parseInt(coeff(s));
            } else {
                rightSum -= Integer.parseInt(s);
            }
        }
        
        for (String s : moveToList(part[1])) {
            if (s.indexOf("x") >= 0) {
                leftSum -= Integer.parseInt(coeff(s));
            } else {
                rightSum += Integer.parseInt(s);
            }
        } 
        if (leftSum == 0) {
            if (rightSum == 0) {
                return "Infinite solutions";
            }
            return "No solution";
        }
        return "x=" + rightSum / leftSum;
    }
    
    private String coeff(String s) {
        if (s.length() > 1 && s.charAt(s.length() - 2) >= '0' && s.charAt(s.length() - 2) <= '9') {
            return s.replace("x", "");
        }
        return s.replace("x", "1");
    }
    
    private List<String> moveToList(String s) {
        List <String> res = new ArrayList <> ();
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (r.length() > 0)
                    res.add(r);
                r = "" + s.charAt(i);
            } else {
                r += s.charAt(i);
            }
        }
        res.add(r);
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
