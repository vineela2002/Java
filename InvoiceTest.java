class Invoice{
        //Define instance variables here
        String number;
        String description;
        int quantity;
        double price;
        public Invoice(){ }
        //Define parameterized constructor here
        public Invoice(String num, String desc, int quant, double pr) {
            number = num;
            description = desc;
            setQunatity(quant);
            setPrice(pr);
        }
       // Setters
        void setNumber(String num) {
            number = num;
        }
        void setDescription(String desc) {
            description = desc;
        }
        void setQunatity(int quant) {
                if (quant < 0) {
                        quantity = 0;
                } else {        
                        quantity = quant;
                }
        }
        void setPrice(double pr) {
            if (pr < 0) {
                        price = 0;
                } else {        
                        price = pr;
                }
        }
       // Getters
        String getNumber() {
            return number;
        }
        String getDescription() {
            return description;
        }
        int getQunatity() {
            return quantity;
        }
        double getPrice() {
            return price;
        }

       public double getInvoiceAmount() {
                double invoiceAmount = price * quantity;
                return invoiceAmount;
       }
}
public class InvoiceTest {
         public static void main(String []args){
                   Invoice myInvoice;
                   myInvoice = new Invoice("19BQ1A05J4", "My First Invoice :)", 5, 2.0);
                   myInvoice.setPrice(5.0);
                   System.out.println("Number: " + myInvoice.getNumber());
                   System.out.println("Description: " + myInvoice.getDescription());
                   System.out.println("Quantity: " + myInvoice.getQunatity());
                   System.out.println("Price:" + myInvoice.getPrice());
                   System.out.println("invoiceAmount: " + myInvoice.getInvoiceAmount());
         }
}