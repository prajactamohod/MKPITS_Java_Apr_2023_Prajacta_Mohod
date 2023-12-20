package com.example.Database_Mapping.repo;

import com.example.Database_Mapping.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address ,Integer>{
}
