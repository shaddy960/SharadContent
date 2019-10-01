
public class FirstCl {
	int monthlyInterest=1000;
	int yearlyInterest=2000;
	void calInterest(int amount1, int amount2){
		int monthlyAmount=monthlyInterest*amount1;
		int yearlyAmount=yearlyInterest*amount2;
		System.out.println("Monthly Total= "+monthlyAmount);
		System.out.println("Yearly Total= "+yearlyAmount);
	}

}
