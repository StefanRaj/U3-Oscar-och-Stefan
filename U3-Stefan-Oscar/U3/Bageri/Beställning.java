package Bageri;

public class Beställning {
    private MenuItem[] produkter;
    private int produktIndex;

    public Beställning(int maxAntalProdukter){
        produkter = new MenuItem[maxAntalProdukter];
    }

    public void läggTillProdukt(MenuItem produkt){
        if(produktIndex < produkter.length){
            produkter[produktIndex] = produkt;
            produktIndex++;
        }else{
            System.out.println("Beställningen är full. " + produkter.length +" är max antal produkter per beställning.");
        }
    }

    public MenuItem[] getProdukter(){
        MenuItem[] resultat = new MenuItem[produktIndex];
        for(int i = 0; i < produktIndex; i++){
            resultat[i] = produkter[i];
        }
        return resultat;
    }

    public void visaBeställning(){
        if (produktIndex == 0){
            System.out.println("Din beställning är tom.");
        }
        System.out.println("Din bestänning:");
        for(int i = 0; i < produktIndex; i++){
            produkter[i].beskrivning();
        }
        System.out.println("Totalpriset blir: " + totalPris() + " kr." );
    }

    public int totalPris(){
        int total = 0;
        for(int i = 0; i < produktIndex; i++){
            total += produkter[i].getPris();
        }
        return total;
    }

}
