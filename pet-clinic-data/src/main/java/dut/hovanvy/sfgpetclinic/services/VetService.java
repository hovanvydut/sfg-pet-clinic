package dut.hovanvy.sfgpetclinic.services;

import dut.hovanvy.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
