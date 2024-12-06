package service;

import java.math.BigDecimal;

import pojo.MarginAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService {
    
    private TradeAccountRepository repository;

    public MarginAccountService(TradeAccountRepository repository) {
        this.repository = repository;
    }

    public void create(MarginAccount tradeAccount) {
        this.repository.create(tradeAccount);
    }

    public MarginAccount get(String id) {
        return (MarginAccount)this.repository.get(id);
    }

    public void update(MarginAccount tradeAccount) {
        this.repository.update(tradeAccount);
    }

    public void delete(String id) {
        this.repository.delete(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        MarginAccount account = get(id);
        account.setMargin(account.getMargin().add(amount));
        update(account);
        
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        MarginAccount account = get(id);
        account.setMargin(account.getMargin().subtract(amount));
        update(account);
    }

}
