class AmountDue {
    public double ComputeAmountDue(double price) {
        return price * 0.12;
        }
        
    public double ComputeAmountDue(double price, int quantity) {
        double subtotal = price * quantity;
        return subtotal * 0.12;
        }
        
    public double ComputeAmountDue(double price, int quantity, double discount) {
        double subtotal = price * quantity;
        double AfterDiscount = subtotal - discount;
        return AfterDiscount *0.12;
        }
    }