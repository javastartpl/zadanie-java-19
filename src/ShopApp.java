import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        final int add = 1;
        final int find = 2;
        final int show = 3;
        final int exit = 4;
        Shop shop = new Shop();
        //kilka produktów na start
        shop.addProduct(new Product(123, "Mleko", "Mlekowita"));
        shop.addProduct(new Product(15, "Czekolada", "Wedel"));
        shop.addProduct(new Product(65, "Lody", "Algida"));
        shop.addProduct(new Product(789, "Parówki", "Berlinki"));

        Scanner scan = new Scanner(System.in);
        int option = exit;
        do {
            System.out.println("Wybierz opcję:");
            System.out.println("1 - dodanie produktu");
            System.out.println("2 - wyszukiwanie produktu");
            System.out.println("3 - wyswietl wszystkie");
            System.out.println("4 - koniec programu");
            option=scan.nextInt();
            scan.nextLine(); //usuwamy znak nowego wiersza
            switch(option) {
                case add:
                    Product product = new Product();
                    System.out.println("Podaj id");
                    product.setId(scan.nextInt());
                    scan.nextLine();
                    System.out.println("Podaj nazwę");
                    product.setName(scan.nextLine());
                    System.out.println("Podaj producenta");
                    product.setProducer(scan.nextLine());
                    shop.addProduct(product);
                    break;
                case find:
                    System.out.println("Podaj id produktu do wyszukania:");
                    Product findProd = shop.findById(scan.nextInt());
                    scan.nextLine();
                    if(findProd != null) {
                        System.out.println("Znaleziono produkt");
                        findProd.showInfo();
                    } else {
                        System.out.println("Nie ma produktu o podanym id");
                    }
                    break;
                case show:
                    shop.showAll();
                    break;
                case exit:
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Błędna opcja");
            }
        } while (option != exit);
        scan.close();
    }
}
