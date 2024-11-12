package bai1;

public class Test {
	public static void main(String[] args) {
        Person p=new Person();
        p.setName("Lê Sơn");
        p.setDob("23/01/2005");
        p.setPob("Ha Noi");
        p.setGender('M');
        p.setEmail("lson@gmail.com");
        p.setPhone("0234867908");
        System.out.println(p.getName());
        System.out.println(p.toString());
    }
}
