
public class Review01 {

	public static void main(String[] args) {

		int yen=1500;
		double percent=0.1;
		int zei=tax(yen,percent);
		int sum=yen+zei;


		System.out.println(yen+"円の商品の税込価格は"+sum+"円（消費税は"+zei+"円）です。");


	}

    public static int tax(int yen,double percent) {


    	double result=(double)percent*yen;
    	int zei=(int)result;

    	return zei;

		}




}
