package guru.springframework.sfg_di_mert.controllers;

import guru.springframework.sfg_di_mert.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }

}
