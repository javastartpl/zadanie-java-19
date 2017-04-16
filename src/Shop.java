public class Shop {
    private Product[] products = new Product[10]; //max 10 produktów w sklepie
    private int numberOfProducts = 0; //na początku brak produktów

    public void addProduct(Product product) {
        //jeśli jest jeszcze miejsce na produkt, to go dodajemy
        if (numberOfProducts < products.length) {
            products[numberOfProducts] = product;
            numberOfProducts++;
        } else
            System.out.println("Brak miejsca na nowe produkty");
    }

    public void showAll() {
        for (int i = 0; i < numberOfProducts; i++) {
            products[i].showInfo();
        }
    }

    public Product findById(int id) {
        //szukamy produktu po id
        for (int i = 0; i < products.length; i++) {
            if(products[i].getId() == id)
                return products[i];
        }
        //zwracamy null jeśli nic nie znaleziono
        return null;
    }
}
