import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class p33 {
	public static void main(String[] args) {

		double res = 1;
		for (double nominator1 = 1; nominator1 < 10; nominator1++) {
			for (double nominator2 = 0; nominator2 < 10; nominator2++) {
				for (double denominator1 = 1; denominator1 < 10; denominator1++) {
					for (double denominator2 = 0; denominator2 < 10; denominator2++) {
						if(denominator1 == nominator1 || denominator1 == nominator2 || denominator2 == nominator1 || denominator2 == nominator2 )
						{
							if(denominator1 == 0 || denominator2 == 0)
								continue;
							double val = foo(denominator1,denominator2,nominator1,nominator2);
							if(val != 0)
								res*= val;
						}
					}
				}
			}
		}
		System.out.println(res);
	}

	public static double foo(double first1,double first2, double second1,double second2)
	{
		double f_num = second1*10 + second2; 
		double s_num = first1*10 + first2; 
		double res = f_num/s_num;
		if(((second1/first2 == res && second2==first1)  || (second1/first1 == res && second2 == first2 )|| (second2/first1 == res && second1 == first2)|| (second2/first2 == res && second1 ==first1)) && res < 1) 
		{
			if(second1 == first1 && second2 == first2)
				return 0;
			System.out.print((int)second1);
			System.out.print((int)second2);
			System.out.println("/" + (int)first1 + (int)first2);
			return res;
		}
		return 0;
	}
}

