package com.example.petapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.petapi.entity.Pet;
import com.example.petapi.repository.PetRepository;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public Pet getPetById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    public Pet createPet(Pet pet) {
        return petRepository.save(pet);
    }

    public Pet updatePet(Long id, Pet updatedPet) {
        Pet pet = petRepository.findById(id).orElse(null);
        if (pet == null) return null;

        pet.setName(updatedPet.getName());
        pet.setType(updatedPet.getType());
        pet.setAge(updatedPet.getAge());
        pet.setStatus(updatedPet.getStatus());

        return petRepository.save(pet);
    }

    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }
}
