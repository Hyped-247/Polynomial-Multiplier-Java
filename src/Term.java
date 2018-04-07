
//This class defines a single term for a Polynomial.
public class Term {

    private int coef;
    private int power;

    public Term(int coefficient, int power){
        this.coef = coefficient;
        this.power = power;
    }

    public int getCoefficient(){
        return coef;
    }

    public int getExponent(){
        return power;
    }
}
