package base;

import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;
public class Tuition {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	double Percentage;
	double APR;
	int semester;
	double initialTuition;
	double pmt;
	boolean paymentDue = true;
	System.out.println("What is the Interest on your tuition?");
	Percentage=input.nextDouble();
	System.out.println("What is your APR?");
	APR=input.nextDouble();
	System.out.println("How many terms do you plan to repay your loan in?");
	semester=input.nextInt();
	System.out.println("What is your Payment Amount?");
	initialTuition=input.nextDouble();
    double totalTuition; {
    	for(int i=0; i<=semester; i++){(initialTuition*(1+Percentage*semester));
    	}}
	pmt=FinanceLib.pmt(APR,semester,initialTuition, totalTuition, paymentDue );
	System.out.println(" The monthly payment for your school loan is" + pmt); 
    System.out.println("The total ammount of your tuition is " + totalTuition);
}}