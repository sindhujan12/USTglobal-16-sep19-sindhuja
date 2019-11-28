package com.ustglobal.objectclass;

public class Usb {
	public static void connect(Object o) {
		if(o instanceof Mouse) {
			Mouse m = (Mouse) o;
			m.click();
			m.scroll();
		}else if (o instanceof PenDrive) {
			PenDrive p = (PenDrive) o;
			p.read();
			p.write();
		}else {
			System.out.println("invalid chooice");
		}
	}

}
