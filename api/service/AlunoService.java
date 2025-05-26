package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    // O AlunoService funciona como uma FACHADA (Facade) entre o Controller e o Repositório.
    // Ele centraliza toda a lógica de negócio relacionada ao Aluno, escondendo a complexidade da persistência de dados.

    @Autowired
    AlunoRepository alunoRepository;

    // Método para criar um novo aluno, delegando a persistência ao DAO (AlunoRepository)
    public void createAluno(Aluno aluno){
        alunoRepository.save(aluno);
    }

    // Método que retorna todos os alunos cadastrados no sistema
    public List<Aluno> listAllAlunos(){
        return alunoRepository.findAll();
    }

    // Método que busca um aluno pelo ID
    public Optional<Aluno> searchAlunoById(Long idAluno){
        return alunoRepository.findById(idAluno);
    }

    // Método que exclui um aluno pelo ID
    public void deleteAlunoById(Long idAluno){
        alunoRepository.deleteById(idAluno);
    }

    // Método que atualiza os dados de um aluno existente
    public void updateAlunoById(Long idAluno, Aluno aluno){
        // A lógica de verificação e atualização está encapsulada aqui, não no controller
        Optional<Aluno> alunoDataBase = searchAlunoById(idAluno);

        if (alunoDataBase.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Aluno não encontrado do banco de dados");
        }

        Aluno alunoEdit = alunoDataBase.get();

        alunoEdit.setNomeAluno(aluno.getNomeAluno());
        alunoEdit.setCpfAluno(aluno.getCpfAluno());
        alunoEdit.setEmailAluno(aluno.getEmailAluno());

        alunoRepository.save(alunoEdit);
    }

}
