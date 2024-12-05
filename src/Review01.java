
public class Review01 {

	public static void main(String[] args) {

		int yen=1500;
		double tax=0.1;
		double result=taxMethod(yen,tax);
		int zei=(int)result;
		int sum=yen+zei;


		System.out.println(yen+"円の商品の税込価格は"+sum+"円（消費税は"+zei+"円）です。");


	}

    public static double taxMethod(int yen,double tax) {


    	double result=(double)tax*yen;

    	return result;

		}




}
