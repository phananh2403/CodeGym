package TreeAndMap.QuanLySanPham;

import java.util.Scanner;
import TreeAndMap.QuanLySanPham.ProductManager;
public class Product {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        int choice = -1;
        Scanner input = new Scanner(System.in);

            while (choice != 0){
                System.out.println("Menu");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Sửa thông tin sản phẩm theo id");
                System.out.println("3. Xoá sản phẩm theo id");
                System.out.println("4. Hiển thị danh sách sản phẩm");
                System.out.println("5. Tìm kiếm sản phẩm theo tên");
                System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                choice = input.nextInt();

                String item = "";
                String fixedItem = "";
                int iD = 0;
                int cost = 0;

                int findID = 0;
                String fixItem = "";
                int newCost = 0;

                int inputID = 0;

                String inputItems = "";
                switch (choice) {
                    case 1:
                        System.out.println("Enter ID: ");
                        iD = new Scanner(System.in).nextInt();
                        productManager.addID(productManager.setId(iD));
                        System.out.println("Enter item: ");
                        item = new Scanner(System.in).nextLine();
                        productManager.addProduct(productManager.setItem(item));
                        System.out.println("Enter cost: ");
                        cost = new Scanner(System.in).nextInt();
                        productManager.addCost(productManager.setCost(cost));
                        break;
                    case 2:
                        System.out.println("Nhap ID san pham can Edit");
                        findID = new Scanner(System.in).nextInt();
                        System.out.println("Nhap thong tin moi: ");
                        fixItem = new Scanner(System.in).nextLine();
                        System.out.println("Nhap gia tien moi: ");
                        cost = new Scanner(System.in).nextInt();
                        productManager.fixProduct(findID,fixItem,newCost);
                        break;
                    case 3:
                        System.out.println("Nhap ID san pham can xoa: ");
                        inputID = new Scanner(System.in).nextInt();
                        productManager.removeItem(inputID);
                        break;
                    case 4:
                        productManager.printProductList();
                        break;
                    case 5:
                        System.out.println("Nhap ten san pham can tim: ");
                        inputItems = new Scanner(System.in).nextLine();
                        productManager.findItems(inputItems);
                        break;
//                case 6:
                    case 0:
                        System.exit(0);
                }
            }
        }

}
