/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Benutzer1
 */
public class Hackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hackerrank h = new Hackerrank();
        Solution loesung = new Solution();
        // initialize your new task here
        h.gradingStudents(loesung);
    }

    // Method could be private as it never used except of this class.
    private void gradingStudents(Solution loesung) {

        int[] grades = new int[]{4, 73, 67, 38, 33};
        
        int[] ergebnis = loesung.gradingStudents(grades);
        
        for(int i =  0; i < ergebnis.length; i++) {
            System.out.println(ergebnis[i]);
        }
    }

    private void stockMaximize(Solution loesung) {
        
        // For testing you would better to write Unit test. Google it please if you don't know.
        int[] testcase1 = new int[]{5,3,2};
        
        int[] testcase2 = new int[]{1,2,100};
        
        int[] testcase3 = new int[]{1,3,1,2};
        
        int ergebnis = loesung.stockMaximize(testcase3);
        System.out.println("Loesung stockMaximize: " + ergebnis);
    }
}

