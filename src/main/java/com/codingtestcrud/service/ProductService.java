package com.codingtestcrud.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingtestcrud.entiti.Kendaraan;
import com.codingtestcrud.util.RandomNumber;

@Service
public class ProductService {
    private static List<Kendaraan>kendaraans = new ArrayList<>(){
        {
            add(new Kendaraan(RandomNumber.random(1000, 9999), "B 111 C", "Rohmat", "jakarta", "vario", 2020, 125, "hitam", "pertalite"));
            add(new Kendaraan(RandomNumber.random(1000, 9999), "B 222 C", "Rohmat", "jakarta", "vario", 2020, 125, "hitam", "pertalite"));
            add(new Kendaraan(RandomNumber.random(1000, 9999), "B 333 C", "Rohmat", "jakarta", "vario", 2020, 125, "hitam", "pertalite"));
            add(new Kendaraan(RandomNumber.random(1000, 9999), "B 444 C", "Rohmat", "jakarta", "vario", 2020, 125, "hitam", "pertalite"));
            
        }
    };
      
    

    public List<Kendaraan> fineAll(){
        return kendaraans;
    }

    public void addKendaraan(Kendaraan kendaraan){
        kendaraan.setId( RandomNumber.random(1000,9999 ));
        kendaraans.add(kendaraan);
    }

    public void deleteById(long id){
        kendaraans.removeIf(p -> p.getId() == id);
    }

    public Optional<Kendaraan>fineById(long id){
        return kendaraans.stream().filter(p -> p.getId()==id).findFirst();
    }

    public void update(Kendaraan kendaraan){
        deleteById(kendaraan.getId());
        kendaraans.add(kendaraan);
    }
}
