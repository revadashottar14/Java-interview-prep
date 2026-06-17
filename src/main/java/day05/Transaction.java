package day05;

public class Transaction {

    private String id;
    private double amount;
    private String Ccy;
    private String type;

    private Transaction(Builder builder) {
        this.id = builder.id;
        this.amount = builder.amount;
        this.Ccy = builder.Ccy;
        this.type = builder.type;
    }
    public static class Builder {
        String id;
        double amount;
        String Ccy;
        String type;

        public Builder withId(String id){
            this.id = id;
            return this;
        }
        public Builder withAmount(double amount){
            this.amount = amount;
            return this;
        }
        public Builder withCcy(String Ccy){
            this.Ccy = Ccy;
            return this;
        }
        public Builder withType(String type){
            this.type = type;
            return this;
    }
    public Transaction build(){
        return new Transaction(this);
        }
    }
    public String toString(){
    return "Transaction{" +
            "id='" + id + '\'' +
            ", amount=" + amount +
            ", currency='" + Ccy + '\'' +
            ", type='" + type + '\'' + '}';
    }
}

