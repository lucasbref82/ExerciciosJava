package poo.contaBancaria;

public class Account {
	private Integer account;
	private String holder;
	private Double balance;
	
	public Account() {
		
	}
	
	public Account(Integer account, String holder) {
		this.account = account;
		this.holder = holder;
	}
	
	public Account(Integer account, String holder, Double balance) {
		this.account = account;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void deposit(Double value) {
		this.balance += value;
	}
	
	public void withraw(Double value) {
		this.balance -= value;
	}
	
	public Integer getAccount() {
		return account;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	
	public String toString() {
		return new StringBuilder()
				.append("Account ")
				.append(this.account)
				.append(", ")
				.append("Holder: ")
				.append(this.holder)
				.append(", ")
				.append("Balance: $ ")
				.append(this.balance == null ? "0" : this.balance).toString();

	}
}
