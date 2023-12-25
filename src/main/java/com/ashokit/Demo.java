package com.ashokit;

public class Demo {
	void add(int i, int j) {
		System.out.println("sum:"+(i+j));	
			}
		void add(int i,int j,int k) {
		System.out.println("sum:"+(i+j+k));
			}
		public static void main(String[] args) {
				Demo c =new Demo();
				c.add(10, 20);
				c.add(10,20,30);
			}
			

		}
