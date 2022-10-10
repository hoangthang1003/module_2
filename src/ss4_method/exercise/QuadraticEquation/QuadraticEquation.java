package ss4_method.exercise.QuadraticEquation;


public class QuadraticEquation {
    double numA, numB, numC;

    public QuadraticEquation(double numA, double numB, double numC) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }

    public double getDiscriminant() {
        return numB * numB - 4 * numA * numC;
    }

    public double getRoot1() {
        return ((-numB)+ Math.sqrt(numB * numB - 4 * numA * numC))/2*numA;
    }

    public double getRoot2() {
        return ((-numB)- Math.sqrt(numB * numB - 4 * numA * numC))/2*numA;
    }


}
