package mat335Labs.Lab4;

public class Lab4_2_TestInvoice {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1", "abc", 11, -20.0);
        Invoice invoice2 = new Invoice("12", "def", 23, 10.0);

        System.out.println("The amount of the Invoice 1 : " + invoice1.getInvoiceAmount());
        System.out.println("The amount of the Invoice 2 : " + invoice2.getInvoiceAmount());
    }

}
