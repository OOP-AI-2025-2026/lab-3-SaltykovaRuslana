package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int size;

    public Cart(int capacity) {
        this.contents = new Item[capacity];
        this.size = 0;
    }

    public void add(Item item) {
        if (isFull()) {
            System.out.println("Кошик повний. Неможливо додати товар.");
            return;
        }
        this.contents[this.size] = item;
        this.size++;
    }

    public void removeById(long itemId) {
        int foundItemIndex = findItemIndexById(itemId);

        if (foundItemIndex == -1) {
            System.out.println("Товар з ID" + itemId + "не знайдено.");
            return;
        }

        for (int i = foundItemIndex; i < this.size - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }

        this.contents[this.size - 1] = null;
        this.size--;
    }


    private int findItemIndexById(long itemId) {
        for (int i = 0; i < this.size; i++) {
            if (this.contents[i].getId() == itemId) {
                return i;
            }
        }

        return -1;
    }


    public boolean isFull() {
        return this.size == this.contents.length;
    }

    public Item[] getItems() {
        return Arrays.copyOf(this.contents, this.size);
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                '}' + "\n";
    }
}
