package src.skillbox.ru;

public class Basket {
    private String items = "";
    private int limit;
    private double totalWeight = 0;
    private  int totalPrice = 0;
    private  int allItemsBasket = 0;
    private static int basketCount = 0;
    private static int totalCountAllItems = 0;
    private static int totalPriceAllBasket = 0;


    public Basket() {
        basketCount = basketCount + 1;
        items = "Список товаров:";
        this.limit = 1000000;

    }

    public Basket(int limit, int count) {
        this();
        this.limit = limit;
    }

    public Basket(String name, int price, double weight) {
        this();
        this.items = this.items + name;
        this.totalPrice = price;
        this.totalWeight = weight;
        allItemsBasket = allItemsBasket + 1;
        increaseTotalCountAllItems();
        increaseTotalPriceAllBasket();
        clear();
    }


    public void add(String name, int price) {
        add(name, price, 1, 1);

    }

    public int add(String name, int price, int count, double weight) {

        boolean error = false;
        if (containts(name)) {
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }
        if (error) {
            System.out.println("Error occured");
            return price;
        }

        items = items + "\n" + name + " - " +
                count + " шт.; " + " Цена за шт.(кг):  " + price + " руб. " + " Вес товара: " + weight + "КГ";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
        allItemsBasket = allItemsBasket + count;
        increaseTotalCountAllItems();
        increaseTotalPriceAllBasket();
        clear();
        return allItemsBasket;

    }
    public int increaseTotalCountAllItems(){
        totalCountAllItems = totalCountAllItems +  allItemsBasket;
        return totalCountAllItems ;
    }
    public int increaseTotalPriceAllBasket(){
        totalPriceAllBasket = totalPriceAllBasket + totalPrice;
        return totalPriceAllBasket ;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
        allItemsBasket = 0;
    }

    public static int getBasketCount() {
        return basketCount;
    }

    public static int midlePriceItems() {
        return totalPriceAllBasket / totalCountAllItems;
    }

    public static int midlePriceBasket() {
        return totalPriceAllBasket / basketCount;
    }

    public static int getTotalPriceAllBasket() {

        return totalPriceAllBasket;
    }

    public static int getTotalCountItems() {

        return totalCountAllItems;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }


    public boolean containts(String name) {
        return items.contains(name);
    }


    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("Общая стоимость товаров: " + totalPrice + " руб." + "\n" +
                    "Общий вес товаров: " + totalWeight + " кг");
        }
    }
}