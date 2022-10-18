package com.usa.cabanasApp.controller;

import com.usa.cabanasApp.entities.Cabin;
import com.usa.cabanasApp.service.CabinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Cabin")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CabinController {
    @Autowired
    private CabinService cabinService;

    @GetMapping("/all")
    public List<Cabin> getAll(){
        return cabinService.getAll();
    }
    @GetMapping("/{idCabin}")
    public Optional<Cabin> getById(@PathVariable("idCabin") Integer id){
        return cabinService.getById(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cabin save(@RequestBody Cabin cabin){
        return cabinService.save(cabin);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cabin update (@RequestBody Cabin cabin){
        return cabinService.update(cabin);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete (@PathVariable("id")Integer id){
        return cabinService.delete(id);
    }
}
