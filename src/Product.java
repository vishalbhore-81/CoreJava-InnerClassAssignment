public class Product {
    private int productId;
    private String prodTitle;
    private float  prodPrice;
    private Review[] reviews;

    public Product(int productId, String prodTitle, float prodPrice) {
        this.productId = productId;
        this.prodTitle = prodTitle;
        this.prodPrice = prodPrice;
        this.reviews = new Review[10];
    }

    public void addReview(float rating, String body, String title) {
        for(int i=0;i<reviews.length;i++) {
            if(reviews[i]==null) {
                reviews[i]= new Review(rating, body, title);
                System.out.println("Review added successfully..");
                return;
            }
        }
        System.out.println("Review list is full.Cannot add more review..");
    }

    public void removeReview(int index) {
        if(index>=0 && index<reviews.length && reviews[index]!=null) {
            for(int i= index;i<reviews.length-1;i++) {
                reviews[i] = reviews [i+1];
            }
            reviews[reviews.length-1] = null;
            System.out.println("Review remove successfully..");
        }
    }

    public void printReviews() {
        for(Review review : reviews) {
            if(review != null) {
                System.out.println(review.toString());

            }
        }
    }


    public class Review
    {
        private float rating;
        private String body;
        private String title;

        public Review(float rating, String body, String title) {
            this.rating = rating;
            this.body = body;
            this.title = title;
        }

        public float getRating() {
            return rating;
        }

        public void setRating(float rating) {
            this.rating = rating;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Review{" +
                    "rating=" + rating +
                    ", body='" + body + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }

    }

}
