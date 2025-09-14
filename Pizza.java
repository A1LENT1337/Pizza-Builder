public class Pizza {

    private final String size;
    private final String cheese;
    private final String topping;
    private final boolean extraSauce;

    private Pizza(Builder b) {
        this.size = b.size;
        this.cheese = b.cheese;
        this.topping = b.topping;
        this.extraSauce = b.extraSauce;
    }

    @Override
    public String toString() {
        return "Pizza: " +
                "size = " + size +
                ", cheese = " + cheese +
                ", topping = " + topping +
                ", extraSauce = " + extraSauce;
    }

    public static class Builder {
        private String size;
        private String cheese;
        private String topping;
        private boolean extraSauce;

        public Builder setSize(String s) {
            this.size = s;
            return this;
        }

        public Builder setCheese(String c) {
            this.cheese = c;
            return this;
        }

        public Builder setTopping(String t) {
            this.topping = t;
            return this;
        }

        public Builder setExtraSauce(boolean e) {
            this.extraSauce = e;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
