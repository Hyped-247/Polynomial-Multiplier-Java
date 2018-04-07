import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;


/**
 *  A class that represents a mathematical polynomial
 */
public class Polynomial {
    private LinkedList<Term> firstPolynomial = new LinkedList<>();
    private LinkedList<Term> secondPolynomial = new LinkedList<>();
    private Map<Integer, Integer> result = new TreeMap<>();

    /**
     * Add Term objects to the first term.
     */
    public void AddToFirstPolynomial(Term term) {
        firstPolynomial.add(term);
    }

    /**
     * Add Term objects to the second term.
     */
    public void AddToSecondPolynomial(Term term) {
        secondPolynomial.add(term);
    }

    /**
     * Multiply this polynomial to another polynomial and return a new polynomial that is the result
     */
    public void multiply(){
        int theNewPower;
        int theNewCoefficient;

        for (int i = 0; i < firstPolynomial.size(); i++) {
            for (int j = 0; j < secondPolynomial.size(); j++) {
                theNewPower = firstPolynomial.get(i).getExponent() + secondPolynomial.get(j).getExponent();
                theNewCoefficient = firstPolynomial.get(i).getCoefficient() * secondPolynomial.get(j).getCoefficient();

                if (!result.containsKey(theNewPower)){
                    result.put(theNewPower, theNewCoefficient);
                }else {
                    result.put(theNewPower, result.get(theNewPower) + theNewCoefficient);
                }
            }
        }
    }
    /**
     *  Print out a polynomial to the console in a user friendly format
     *
     */
    public void print(){
        String answer = "";
        for(Map.Entry<Integer, Integer> entry: result.entrySet()) {
            if (entry.getKey() == 0){
                answer+= String.format("%d ", entry.getValue());
            }else {
                answer+= String.format("%d^%d ", entry.getValue(), entry.getKey());

            }
        }
        System.out.println(answer);
    }
}
