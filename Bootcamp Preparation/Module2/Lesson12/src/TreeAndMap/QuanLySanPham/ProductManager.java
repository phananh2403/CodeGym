package TreeAndMap.QuanLySanPham;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    ArrayList<Integer> listID = new ArrayList<Integer>();
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Integer> listCosts = new ArrayList<Integer>();


    private int id;
    private String item;
    private int cost;

    public int getCost() {
        return cost;
    }

    public int setCost(int cost) {
        this.cost = cost;
        return cost;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public String getItem() {
        return item;
    }

    public String setItem(String item) {
        this.item = item;
        return item;
    }

    public void addID(int iD) {
        listID.add(iD);
    }

    public void addProduct(String item) {
        list.add(item);
    }

    public void addCost(int cost){
        listCosts.add(cost);
    }

    public void fixProduct(int findID,String fixItem,int newCost) {
        for (int i = 0; i < listID.size(); i++) {
            if(findID == listID.get(i)){
                fixItem = list.get(i);
                newCost = listCosts.get(i);
            }
        }
    }

    public void removeItem(int inputID){
        for (int i = 0; i < listID.size() ; i++) {
            if(inputID == listID.get(i)){
                list.remove(i);
                listCosts.remove(i);
            }
        }
    }

    public void findItems(String inputItem){
        for (int i = 0; i < list.size(); i++) {
            if(inputItem.equals(list.get(i))){
                System.out.println("Item with ID: "
                        + listID.get(i) + ", Name: "
                        + list.get(i) + " and Cost is: " + listCosts.get(i));
            }
        }
    }

    public void printProductList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Item " + (i + 1) + " is: "
                    + list.get(i) + " with ID = "
                    + listID.get(i) + " and cost = "
                    + listCosts.get(i) + " $");
        }
    }

    public void sortProductList(){

    }
}
