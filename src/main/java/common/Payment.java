package common;

import common.enums.PaymentType;

import java.util.List;

public class Payment {

    private List<Item> items;

    private PaymentType type;

    public Payment(List<Item> items, PaymentType type) {
        this.items = items;
        this.type = type;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }
}
