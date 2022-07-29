package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Objects;

@Entity
public class Customer {
    private @Id @GeneratedValue Long id;


    public HashMap<String, Double> purchases = new HashMap<>();
    private String name;
    private Customer (){};
    //    private Double points;

//
//    private Double totalDollars;
    public Customer(String name, HashMap<String,Double> purchases){
        this.purchases=purchases;
        this.name=name;
    }
    //
//    public Double getTotalDollars() {
//        return totalDollars;
//    }
//
//    public void setTotalDollars(Double totalDollars) {
//        this.totalDollars = totalDollars;
//
//    }
    public HashMap<String, Double> getPurchases() {
        return purchases;
    }
    //
    public void setPurchases(HashMap<String, Double> purchases) {
        this.purchases = purchases;
    }
    //
    public Long getId() {
        return id;
    }
    //    public Double getPoints() {
//        return points;
//    }
//
//
//    public void setPoints(Double points) {
//        this.points=points;
//
//    }
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //
//    public void calculateTotalDollars(){
//        for(Double value: purchases.values()){
//            totalDollars+=value;
//        }
//    }
//    public void calculateTotalPoints(){
//        if(totalDollars >=50 && totalDollars <100){
//            Math.round(points=totalDollars -50);
//        }else if(totalDollars>100){
//            points = Double.valueOf(Math.round(2 * (totalDollars-100) + 50));
//        }else{
//            points = Double.valueOf(0);
//        }
//    }
//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", purchases=" + purchases +
                ", name='" + name + '\'' +
                '}';
    }
}
