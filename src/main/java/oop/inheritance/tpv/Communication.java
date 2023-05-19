package oop.inheritance.tpv;

public interface Communication {

    public boolean open();

    public boolean send(Transaction message);

    TransactionResponse receive();

    public void close();

}
