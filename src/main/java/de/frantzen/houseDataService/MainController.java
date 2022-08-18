package de.frantzen.houseDataService;

import de.frantzen.houseDataService.dao.ValuesRepository;
import de.frantzen.houseDataService.model.Values;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private ValuesRepository valuesRepository;


    @GetMapping("/insert")
    public List<Values> getAll(@RequestBody int id) {
//        Optional<Values> value = valuesRepository.findById(id);
//        System.out.println(value.get().getValue());

//        return value.get().getMeter().getName();
        return valuesRepository.findAll();
    }

}
