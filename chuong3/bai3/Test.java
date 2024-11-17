package bai3;

public class Test {
	public static void main(String[] agrs) {
		//khoi tao gia tri
		DiaChi dc = new DiaChi("10", "Xuan Thien", "Tho Xuan", "Thanh Hoa");
		System.out.println(dc);
		//kiem tra pt tao va tostring
		NhanVien nv = new NhanVien("Son", dc, "23/01/2005", 'N');
		System.out.println(nv);
		//kiem tra pt getter va setter
		nv.setName("Le");
		nv.getName();
		nv.setAddress(dc);
		nv.getAddress();
		nv.setDob("23/02/2005");
		nv.getDob();
		nv.setGender('m');
		nv.getGender();
		System.out.println(nv);
	}
}
