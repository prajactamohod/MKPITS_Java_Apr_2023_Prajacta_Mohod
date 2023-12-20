package com.example.Database_Mapping.service;

import com.example.Database_Mapping.entity.Address;
import com.example.Database_Mapping.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl  implements AddressService{

    private AddressRepository addressRepository;
@Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void find(Integer id) {
       addressRepository.findById(id);
}
}
