package cn.wxy.triangle;

public class Triangle {
	// 0 stands for non-triangle
    // 1 stands for equilateral
    // 2 stands for isosceles
    // 3 stands for scalene
	public int classify(int a, int b, int c){
		
		if(a + b > c && b + c > a && a + c > b){
			
			if(a == b && b == c){
				return 1;
			}
			
			else if(a == b || b == c || a == c){
				return 2;
			}
		
			else
				return 3;
		}
		
		else{
			return 0;
		}
	}
}
