package Tuan2_Lab2;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountList accl = new AccountList();
		int a;
		do {
			System.out.println("\n1.them tai khoan");
			System.out.println("2.xuat thong tin");
			System.out.println("3.so luong tai khoan");
			System.out.println("4.nap tien");
			System.out.println("5.rut tien");
			System.out.println("6.chuyen tien");
			System.out.println("7.dao han");
			System.out.println("8.thoat");
			a = input.nextInt();
			 if(a < 1 || a > 8) {
				 System.out.println("------------------");
				 System.out.println("vui long nhap lai!");
				 System.out.println("------------------");
			 }else {
				 switch(a) {
				 case 1: {
					 Account acc = new Account();
					 System.out.println("nhap ten tai khoan: ");
					 input.nextLine();
					 acc.setTentk(input.nextLine());
					 System.out.println("nhap so tai khoan: ");
					 acc.setStk(input.nextLong());
					 System.out.println("nhap so tien: ");
					 acc.setSoTien(input.nextInt());
//					 acc.status();
					 accl.add(acc);
					 break;
				 }
				 case 2: {
					 System.out.println("\nten tai khoan" + "\tso tai khoan\t" + "so tien\t" + "\tquoc gia\t");
					 System.out.println("-----------------------------------------------------------------------------------------------");
					 accl.xuat();
					 break;
				 }
				 case 3: {
					 
					 break;
				 }
				 case 4: {
					 Account acc = new Account();
					 acc.nap();
					 break;
				 }
				 case 5: {
					 
					 break;
				 }
				 case 6: {
					 
					 break;
				 }
				 }
			 }
		}while (a != 8);
	}
}
