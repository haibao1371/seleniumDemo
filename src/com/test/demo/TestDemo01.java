package com.test.demo;
/*求1到100以内的素数（质数）*/
public class TestDemo01 {

	public static void main(String[] args) {
		int i,j,k = 0;
		for(i=2;i<100;i++) {
			j=(int) Math.sqrt(i);
			for(j=2;j<=k;j++) {
				if(i%j==0);
				break;
			}
			if(j>k) {
				System.out.println(i+""); 
			}
		}
      //验证上传的内容  
	}

}
