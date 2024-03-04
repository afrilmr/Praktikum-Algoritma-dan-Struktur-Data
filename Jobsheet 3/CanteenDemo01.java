import java.util.Scanner;
public class CanteenDemo01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        System.out.println("Masukkan nama makanan: ");
        String nama = sc01.nextLine();
        System.out.println("Masukkan harga: ");
        double harga = sc01.nextDouble();
        System.out.println("Masukkan stock makanan yang tersedia: ");
        int stock = sc01.nextInt();

        Item01 item1 = new Item01("Nasi goreng", 15000, 10);
        Item01 item2 = new Item01("Donat gula", 3000, 20);
        Item01 item3 = new Item01("Cimory", 7000, 15);
        Item01 item4 = new  Item01(nama, harga, stock);
        item4.displayInfo();
        System.out.println("-----------------");

        Item01[] items = new Item01[3];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
    
        for(int i = 0; i < items.length; i++) {
            items[i].displayInfo();
            System.out.println("-----------------");
        }
    }
}
