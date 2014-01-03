package access;

import access.dessert.Cookie;

public class Dinner {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Cookie x = new Cookie();
//		x.bite();	//包访问权限不足
	}
}
