package com.test.demo;
/*ì³²¨ÄÇÆõÊıÁĞ*/
public class TestDemo02 {

	public static void main(String[] args) {
		 System.out.println(fib(1));  
		  
    }  
    public static int fib(int n){   
        int sum = 0;  
        int n1=1;  
        int n2=1;  
        if(n==1||n==2){  
            sum=1;  
        }else{  
            for(int i=3;i<=n;i++){  
                sum=n1+n2;  
                n2=n1;  
                n1=sum;  
            }  
        }  
        return sum;  
	}

}
