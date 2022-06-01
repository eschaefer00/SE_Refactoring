
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();	    
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            Rental each = (Rental) enum_rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t" + each.getCharge() + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private double amountFor(Rental aRental) {
        return aRental.getCharge();
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration<Rental> enum_rentals = rentals.elements();
        while(enum_rentals.hasMoreElements()) {
            Rental each = enum_rentals.nextElement();
            result +=  each.getCharge();
        }
        return result;
    }

    private double getTotalFrequentRenterPoints(){
        double result = 0;
        Enumeration<Rental> enum_rentals = rentals.elements();
        while(enum_rentals.hasMoreElements()) {
            Rental each = enum_rentals.nextElement();
            result = each.getFrequentRenterPoints();
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                result ++;
        }
        return result;
    }
}
    