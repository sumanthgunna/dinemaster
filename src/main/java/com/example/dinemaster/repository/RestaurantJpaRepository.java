/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here
package com.example.dinemaster.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dinemaster.model.Restaurant;

@Repository
public interface RestaurantJpaRepository extends JpaRepository<Restaurant, Integer> {

}