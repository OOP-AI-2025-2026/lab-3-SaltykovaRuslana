package org.example.task2;

public class Order {

    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(this.id).append(" for customer ").append(this.customer);
        builder.append("\n------------------\n");

        double sum = 0.0;

        Item[] itemsInCart = cart.getItems();

        for (Item item : itemsInCart) {
            sum += item.getPrice();
            builder.append("Item id: ").append(item.getId());
            builder.append(" name: ").append(item.getName());
            builder.append(" price: ").append(item.getPrice());
            builder.append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(sum);


        return builder.toString();
    }
}
