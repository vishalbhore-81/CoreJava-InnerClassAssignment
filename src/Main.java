public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(201,"laptop",20000);
        Product p2 = new Product(202,"TV",23000);

        p1.addReview(3.4f,"Battery life could be good","Good Product");
        p1.addReview(5.4f,"Good build quality ","Highly recommemded");

        System.out.println();

        p2.addReview(4.4f,"TV Design is good","Good Product");
        p2.addReview(5.4f,"Improve build quality ","good value for money");
        System.out.println();

        System.out.println("Laptop review:");
        p1.printReviews();

        System.out.println("TV review:");
        p2.printReviews();

        p1.removeReview(1);
        System.out.println("Laptop review after removal :");


        p1.printReviews();

    }
}