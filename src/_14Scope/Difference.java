package _14Scope;

public class Difference {
    private int[] elements;
    public int maximumDifference;
    public Difference(int[] e) {
        elements = e;
    }

    public void computeDifference() {
        for (int i = 0; i < elements.length-1; i++) {
            for (int j = i+1; j <elements.length; j++) {
                int temp = Math.abs(elements[i] - elements[j]);
                maximumDifference = Math.max(temp, maximumDifference);
            }
        }
    }
}
