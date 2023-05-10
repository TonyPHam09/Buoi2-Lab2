package Tuan2_Lab2;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Account {
	public long stk;
	public String tentk;
	public double sotien;
	Scanner input = new Scanner(System.in);
	public Account() {
		super();
	}
	public Account(long stk, String tentk, double sotien) {
		super();
		this.stk = stk;
		this.tentk = tentk;
		this.sotien = sotien;
	}
	
	public long getStk() {
		return stk;
	}
	public void setStk(long stk) {
		if(stk > 0 && stk != 999999) {
			this.stk = stk;
		}else {
			this.stk = 999999;
		}
	}
	public String getTentk() {
		return tentk;
	}
	public void setTentk(String tentk) {
		if(tentk != null) {
			this.tentk = tentk;
		}
	}
	public double getSoTien() {
		return sotien;
	}
	public void setSoTien(double soTien) {
		if(sotien >= 50) {
			this.sotien = sotien;
		}else {
			this.sotien = 50;
		}
	}
	public void nap() {
		double nap;
        System.out.print("nhap so tien can nap: ");
        nap = input.nextDouble();
        if (nap >= 0) {
            sotien = nap + sotien;
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String str1 = formatter.format(nap);
            System.out.println("so tien vua nap la : " + str1);
        } else {
            System.out.println("khong hop le");
        }
	}
	public void rut() {
		
	}
	public void chuyen() {
		
	}
	public void daohan() {
		
	}
	@Override
	public String toString() {
		Locale local = new Locale("vi", "vn");
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String st = formatter.format(sotien);
		return tentk + "\t\t" + stk + "\t\t" + sotien + "\t\t" + local + "\t\t" + st;
	}
}

