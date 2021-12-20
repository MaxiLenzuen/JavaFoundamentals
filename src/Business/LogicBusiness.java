package Business;
import Entities.Customer;
import Interfaces.ISelling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LogicBusiness implements ISelling
{
    public ArrayList<Customer> customers = new ArrayList<>();

    public String showTotal() {

        StringBuilder sb = new StringBuilder();
        for (Customer cust: this.customers
             ) {
            sb.append(cust.ShowData());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LogicBusiness lb = new LogicBusiness();
        lb.customers.add(new Customer("Josecito"));
        System.out.println(lb.showTotal());
    }
}
