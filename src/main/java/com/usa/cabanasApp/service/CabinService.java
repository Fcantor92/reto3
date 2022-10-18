package com.usa.cabanasApp.service;

import com.usa.cabanasApp.entities.Cabin;
import com.usa.cabanasApp.repository.CabinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CabinService {
    @Autowired
    private CabinRepository cabinRepository;

    public List<Cabin> getAll(){
        return cabinRepository.getAll();
    }

    public Optional<Cabin> getById(Integer id){
        return cabinRepository.getById(id);
    }
    public Cabin save (Cabin cabin){
        if (cabin.getId()==null) {
            return cabinRepository.save(cabin);
        }else{
            Optional<Cabin> optional=cabinRepository.getById(cabin.getId());
            if (optional.isEmpty()) {
                return cabinRepository.save(cabin);
            }else{
                return cabin;
            }
        }
    }
    public Cabin update (Cabin cabin){
        if (cabin.getId()!=null){
            Optional<Cabin> optional=cabinRepository.getById(cabin.getId());
            if(!optional.isEmpty()){
                if(cabin.getName()!=null){
                    optional.get().setName(cabin.getName());
                }
                if(cabin.getBrand()!=null){
                    optional.get().setBrand(cabin.getBrand());
                }
                if(cabin.getRooms()!=null){
                    optional.get().setRooms(cabin.getRooms());
                }
                if(cabin.getDescription()!=null){
                    optional.get().setDescription(cabin.getDescription());
                }
                if(cabin.getCategory()!=null){
                    optional.get().setCategory(cabin.getCategory());
                }
                cabinRepository.save(optional.get());
                return optional.get();
            }else{
                return cabin;
            }
        }else{
            return cabin;
        }
    }
    public boolean delete(Integer id){
        Boolean aBoolean=getById(id).map(cabin -> {
            cabinRepository.delete(cabin);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
