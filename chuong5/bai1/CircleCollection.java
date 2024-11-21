package bai1;

import java.util.ArrayList;

public class CircleCollection {
	private ArrayList<Circle> al = new ArrayList<>(); 

    public void addCircle(Circle c) {
        al.add(c);
    }

    public Circle getCircle(int pos) {
        if (pos >= 0 && pos < al.size()) {
            return al.get(pos);
        }
        return null; 
    }

    public void setCircle(int pos, Circle c) {
        if (pos >= 0 && pos < al.size()) {
            al.set(pos, c);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Circle c : al) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }

    public double calcSumArea() {
        double sum = 0;
        for (Circle c : al) {
            sum += c.getArea();
        }
        return sum;
    }

    public double findMinArea() {
        if (al.isEmpty()) return 0;
        double minArea = al.get(0).getArea();
        for (Circle c : al) {
            minArea = Math.min(minArea, c.getArea());
        }
        return minArea;
    }
    public double findMaxArea() {
        if (al.isEmpty()) return 0;
        double maxArea = al.get(0).getArea();
        for (Circle c : al) {
            maxArea = Math.max(maxArea, c.getArea());
        }
        return maxArea;
    }

}
