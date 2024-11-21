package bai2;

public class TestException {
	public static void main(String[] args) {
        try {
            ThoiGian tg1 = new ThoiGian(23, 01, 2005); 
            System.out.println("Thời gian hợp lệ: " + tg1);
        } 
        catch (InvalidDateException e) {
            System.out.println(e);
        }

        try {
            ThoiGian tg2 = new ThoiGian(16, 12, 2005); 
            System.out.println("Thời gian hợp lệ: " + tg2);
        } 
        catch (InvalidDateException e) {
            System.out.println(e);
        }
 }
}
