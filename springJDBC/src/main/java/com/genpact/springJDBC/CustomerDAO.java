package com.genpact.springJDBC;

public interface CustomerDAO {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);

}
