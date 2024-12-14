package Homework.Homework2;

public class HW1_Task2 {
    public static void main(String[] args) {

        int comPrice=1000;
        int comUnit=4;
        int tvPrice=800;
        int tvUnit=3;
        int tabletPrice=450;
        int tabletUnit=5;
        int totalComPrice=comPrice*comUnit;
        int totalTvPrice=tvPrice*tvUnit;
        int totalTabletPrice=tabletPrice*tabletUnit;
        System.out.println("Customer paid $"+totalComPrice +" for computer");
        System.out.println("Customer paid $"+totalTvPrice +" for TV");
        System.out.println("Customer paid $"+totalTabletPrice +" for tablet");
        int totalPaidAmount=totalComPrice+totalTabletPrice+totalTvPrice;
        System.out.println("Customer paid $"+totalPaidAmount +" for all devices");
    }
}
