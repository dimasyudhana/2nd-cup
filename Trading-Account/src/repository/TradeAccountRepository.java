package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.TradeAccount;

public class TradeAccountRepository {
 
    private Map<String, TradeAccount> datastore = new HashMap<>();

    public void create(TradeAccount tradeAccount) {
        this.datastore.put(tradeAccount.getId(), tradeAccount.clone());
    }

    public TradeAccount get(String id) {
        return this.datastore.get(id) == null ? null : this.datastore.get(id).clone();
    }

    public void update(TradeAccount tradeAccount) {
        this.datastore.put(tradeAccount.getId(), tradeAccount.clone());
    }

    public void delete(String id) {
        this.datastore.remove(id);
    }

}
