package com.work.view;

public class GuGuDanTest {

	public static void main(String[] args) {
		
	}
	
	public static void main2(String[] args) {
		int i = 1;
		while(i<10) {
			int j = 2;
			while (j<10) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				j++;
			}
			i++;
			System.out.println();
		}
	}

	
	public static void main1(String[] args) {
		for(int i=2; i<=9; i++){
			System.out.print("["+i+"단]\t"); // \t 칸 간격 벌림
		}
		System.out.println();
		for(int i=1; i<=9; i++){
			for(int j=2; j<=9; j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}System.out.println();
		}
	}

}

