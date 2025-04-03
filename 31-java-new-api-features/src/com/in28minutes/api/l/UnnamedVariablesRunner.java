package com.in28minutes.api.l;

public class UnnamedVariablesRunner {

	record Transaction(String sender, String receiver, int amount) {}
	
	private static void printTransactionOld(Object objTransaction) {
		if(objTransaction instanceof Transaction transaction) {
			String sender = transaction.sender();
			String receiver = transaction.receiver();
			int amount = transaction.amount();
			
			System.out.println(sender + " " + receiver + " " + amount);
			
		}
	}

	private static void printTransactionNew(Object objTransaction) {
		if(objTransaction 
				instanceof 
				Transaction(var sender, var receiver, var amount )) {
			
			System.out.println(sender + " " + receiver + " " + amount);
			
		}
	}

	
	public static void main(String[] args) {
//		Object objStr = "Some String";
//		
//		instanceofNew(objStr);

		printTransactionNew(new Transaction("You","Me",1_000_000));
	}

	private static void instanceofNew(Object objStr) {
		if(objStr instanceof String str) {
			System.out.println(str.toLowerCase());
		}
	}

	private static void instanceofOld(Object objStr) {
		if(objStr instanceof String) {
			String str = (String) objStr;
			System.out.println(str.toLowerCase());
		}
	}

}
