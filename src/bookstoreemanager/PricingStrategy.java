/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoremanager;

public interface PricingStrategy {
    double calculatePrice(Book book);

}
