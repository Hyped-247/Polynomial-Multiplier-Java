public class Main {

    public static void main(String[] args) {
        // create a polynomial objects
        Polynomial polynomial = new Polynomial();

        // add term objects to first polynomial
        polynomial.AddToFirstPolynomial(new Term(4, 1));
        polynomial.AddToFirstPolynomial(new Term(3, 0));

        // add term objects to second polynomial
        polynomial.AddToSecondPolynomial(new Term(3, 2));
        polynomial.AddToSecondPolynomial(new Term(-5, 1));
        polynomial.AddToSecondPolynomial(new Term(-6, 0));

        // multiply two polynomials
        polynomial.multiply();

        // print answer
        polynomial.print();


    }
}
