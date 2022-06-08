package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.*;

public interface IMoneyService {
	
	
		public Money addMoney(Money money);

		public void removeMoney(Integer moneyId);
		
		public List<Money> getAllMoney ();
		
		public Money updateMoney(Money money, Integer moneyId);
		
		public Money getMoney(Integer moneyId);

}
