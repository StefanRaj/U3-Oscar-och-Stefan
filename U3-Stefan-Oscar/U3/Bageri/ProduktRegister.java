package Bageri;

public class ProduktRegister {
    private Tårta[] tårtor;
    private Stycksaker[] stycksaker;
    private MenuItem[] order = new MenuItem[100];
    private int orderIndex = 0;

    public Tårta[] getTårtor() {
        return tårtor;
    }

    public Stycksaker[] getStycksaker() {
        return stycksaker;
    }

    public void setTårta(Tårta[] tårtor){
        this.tårtor = tårtor;
    }

    public void setStycksaker(Stycksaker[] stycksaker){
        this.stycksaker = stycksaker;
    }

    public void läggTillOrder(MenuItem produkt){
        if(orderIndex < order.length){
            order[orderIndex] = produkt;
            orderIndex++;
        }
    }

    public MenuItem[] getOrder(){
        return order;
    }

}
