package com.cg.ibs.investment.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.cg.ibs.investment.bean.BankMutualFund;
import com.cg.ibs.investment.bean.MutualFund;
import com.cg.ibs.investment.exception.InsuffBalanceException;
import com.cg.ibs.investment.exception.InvalidAmountException;
import com.cg.ibs.investment.exception.InvalidDetailsException;
import com.cg.ibs.investment.exception.InvalidGoldPriceException;
import com.cg.ibs.investment.exception.InvalidMFException;
import com.cg.ibs.investment.exception.InvalidSilverPriceException;
import com.cg.ibs.investment.exception.InvalidUnitsException;
import com.cg.ibs.investment.service.BankService;
import com.cg.ibs.investment.service.BankServiceImpl;
import com.cg.ibs.investment.service.ClientService;
import com.cg.ibs.investment.service.ClientServiceImpl;

public class InvestmentUI {
	static Scanner sc;
	static double goldUnits = 0;
	static double silverUnits = 0;
	static int status = 3;

	public void doIt() {			//method to start the program
		while (status == 3) {
			System.out.println("	Press 1 for customer and 2 for bank representative");
			System.out.println("----------------------------------------------------------");
			status = sc.nextInt();

			Menu choice = null;
			BankMenu option = null;
			System.out.println("Enter the userId");
			String userId = sc.next();
			System.out.println("Enter the password");
			String password = sc.next();
			ClientService service = new ClientServiceImpl();
        
			if (status == 1){				//Customer Login
				

				
					try {
						if (service.validateCustomer(userId, password)) {
							while (choice != Menu.QUIT) {
								System.out.println("Choice");
								System.out.println("--------------------");
								for (Menu menu : Menu.values()) {
									System.out.println(menu.ordinal() + "\t" + menu.toString().replace("_", " "));
								}

								int ordinal = sc.nextInt();
								if (ordinal >= 0 && ordinal < Menu.values().length) {
									choice = Menu.values()[ordinal];

									switch (choice) {	//Various choices given to customer and their logic
									case VIEW_MY_INVESTMENT:	
										System.out.println(service.viewInvestments(userId));
										break;

									case VIEW_GOLD_PRICE:		 
										System.out.println(service.viewGoldPrice());

										break;
									case VIEW_SILVER_PRICE:
										System.out.println(service.viewSilverPrice());
										break;
									case VIEW_MF_PLANS:
										System.out.println(service.viewMFPlans());
										break;
									case BUY_GOLD:
										System.out.println("Enter number of gold units to buy:");
										try{
										
										double goldUnits = sc.nextDouble();

										
											service.buyGold(goldUnits, userId);
											System.out.println("transaction completed");
										} catch (InvalidUnitsException e) {
											System.out.println(e.getMessage());
										} catch (InsuffBalanceException e) {
											System.out.println(e.getMessage());
										}catch(InputMismatchException e){
											System.out.println("Please provide valid number of goldunits");
										}

										break;
									case SELL_GOLD:
										System.out.println("Enter number of gold units to sell:");
										goldUnits = sc.nextDouble();

										try {
											service.sellGold(goldUnits, userId);
											System.out.println("transaction completed");
										} catch (InvalidUnitsException e) {
											System.out.println(e.getMessage());
										} catch (InsuffBalanceException e) {
											System.out.println(e.getMessage());
										}

										break;
									case BUY_SILVER:
										System.out.println("Enter number of silver units to buy:");
										silverUnits = sc.nextDouble();

										try {
											service.buySilver(silverUnits, userId);
											System.out.println("transaction completed");
										} catch (InvalidUnitsException e) {
											System.out.println(e.getMessage());
										} catch (InsuffBalanceException e) {
											System.out.println(e.getMessage());
										}
										break;
									case SELL_SILVER:
										System.out.println("Enter number of silver units to sell:");
										silverUnits = sc.nextDouble();
										try {
											service.sellSilver(silverUnits, userId);
											System.out.println("transaction completed");
										} catch (InvalidUnitsException e) {
											System.out.println(e.getMessage());
										} catch (InsuffBalanceException e) {
											System.out.println(e.getMessage());
										}

										break;
									case INVEST_MF_PLAN:
										System.out.println(service.viewMFPlans());
										System.out.println("Enter the mutual fund Id:");
										int mfId = sc.nextInt();
										System.out.println("Enter the amount to invest");
										double mfAmount = sc.nextDouble();
										try {
											service.investMF(mfAmount, userId, mfId);
											System.out.println("transaction completed");
										} catch (InsuffBalanceException e) {
											System.out.println(e.getMessage());
										} catch (InvalidAmountException e) {
											System.out.println(e.getMessage());
										} catch (InvalidDetailsException e) {
											System.out.println(e.getMessage());
										}

										break;
									case WITHDRAW_MF_PLAN:

										List<MutualFund> InvestmentList = new ArrayList<>(
												service.viewInvestments(userId).getFunds());

										for (int i = 0; i < InvestmentList.size(); i++) {
											System.out.println(i + " -----  " + InvestmentList.get(i));
											
										}
										System.out.println("Enter the plan number you want to choose");
										int temp = sc.nextInt();
										MutualFund mutualFund = InvestmentList.get(temp);
										service.withdrawMF(userId, mutualFund);
										break;
									case QUIT:
										System.out.println("You are successfully logged out");
										break;
									}
								} else {
									System.out.println("Invalid Option");
									

								}


							}
						}System.out.println("Press 3 to continue");
						status= sc.nextInt();
					} catch(InvalidDetailsException e){
						System.out.println(e.getMessage());
						}
					catch(Exception e){
						System.out.println("An error occurred");
						}
         }
         else if (status == 2) {	//Bank Representative Login

				BankService bankservice = new BankServiceImpl();
				try {
					if (service.validateCustomer(userId, password)) {
						while (option != BankMenu.Quit) {
							System.out.println("Choice");
							System.out.println("--------------------");
							for (BankMenu menu : BankMenu.values()) {
								System.out.println(menu.ordinal() + "\t" + menu);
							}
							System.out.println("Choice");

							int ordinal = sc.nextInt();
							if (ordinal >= 0 && ordinal < BankMenu.values().length) {
								option = BankMenu.values()[ordinal];

								switch (option) { 	//Choices given to bank and their logic
								case updateGoldPrice:
									System.out.println("Enter the updated gold price");
									double goldPrice = sc.nextDouble();
									try {
										bankservice.updateGoldPrice(goldPrice);
										System.out.println("Gold Price updated successfully");
									} catch (InvalidGoldPriceException e) {
										System.out.println(e.getMessage());
									}

									break;
								case updateSilverPrice:
									System.out.println("Enter the updated silver price");
									double silverPrice = sc.nextDouble();
									try {
										bankservice.updateSilverPrice(silverPrice);
										System.out.println("Silver Price updated successfully");
									} catch (InvalidSilverPriceException e) {
										System.out.println(e.getMessage());
									}

									break;
								case updateMFplans:

									System.out.println("Enter mutualfundId");
									int mfId = sc.nextInt();
									System.out.println("Enter mutualfundtitle");
									String title = sc.next();

									System.out.println("Enter nav value");
									double nav = sc.nextDouble();
									try {
										bankservice.updateMF(new BankMutualFund(mfId, title, nav));
										System.out.println("Mutual FUnd plans updated successfully");
									} catch (InvalidMFException e) {
										System.out.println(e.getMessage());
									}

									break;

								case Quit:
									System.out.println("You are successfully logged out");

									break;

								}}}}
					System.out.println("Press 3 to continue");
					status= sc.nextInt();
					}catch(InvalidDetailsException e){
									System.out.println(e.getMessage());
								}
				catch(Exception e){
					System.out.println("An error occurred");
				}}
		}}
								//method to start the program ends
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		InvestmentUI investmentUI = new InvestmentUI();
		investmentUI.doIt();			//calling the method to start the program
		System.out.println("The program has ended");
		sc.close();

	}
}