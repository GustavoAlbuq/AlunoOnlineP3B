package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Disciplina;
import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    public void criarDisciplina(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> listarDisciplinaPorIdProfessor(Long idProfessor){
        return disciplinaRepository.findByProfessorIdProfessor(idProfessor);
    }
}
