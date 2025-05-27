🎓 AlunoOnlineP3B

Sistema de gestão acadêmica desenvolvido como projeto final da disciplina de Programação III (2025). O sistema realiza o gerenciamento de alunos, professores, disciplinas e matrículas, utilizando tecnologias modernas e princípios de arquitetura RESTful.

⸻

🔧 Tecnologias Utilizadas
	•	Linguagem: Java 17
	•	Framework: Spring Boot
	•	Banco de Dados: PostgreSQL
	•	Gerenciador de Dependências: Maven
	•	Ferramentas Auxiliares:
	•	DBeaver – Gerenciamento do banco de dados
	•	Insomnia – Testes de requisições HTTP (API REST)

⸻

📁 Organização do Projeto

👨‍🎓 Aluno
	•	POST /alunos – Criar aluno
	•	GET /alunos – Listar todos os alunos
	•	GET /alunos/{id} – Buscar aluno por ID
	•	PUT /alunos/{id} – Atualizar aluno por ID
	•	DELETE /alunos/{id} – Deletar aluno por ID

👨‍🏫 Professor
	•	POST /professores – Criar professor
	•	GET /professores – Listar todos os professores
	•	GET /professores/{id} – Buscar professor por ID
	•	PUT /professores/{id} – Atualizar professor
	•	DELETE /professores/{id} – Deletar professor

📚 Disciplina
	•	POST /disciplinas – Criar disciplina
	•	GET /disciplinas/professor/{id} – Listar disciplinas por ID do professor

📝 Matrícula
	•	POST /matriculas – Criar matrícula
	•	PUT /matriculas/{id}/nota – Atualizar notas
	•	PUT /matriculas/{id}/trancar – Trancar matrícula
	•	GET /matriculas/historico/{idAluno} – Emitir histórico do aluno

⸻

🚀 Como Executar o Projeto
1.Clone o repositório 
git clone https://github.com/GustavoAlbuq/AlunoOnlineP3B.git
cd AlunoOnlineP3B

2.	Configure o application.properties com as credenciais do seu banco PostgreSQL.
	3.	Execute o projeto com o Spring Boot (IDE ou terminal).
	4.	Utilize o Insomnia ou Postman para testar as requisições REST.

⸻

✅ Funcionalidades Implementadas
	•	Cadastro e gerenciamento de alunos e professores
	•	Criação de disciplinas e vínculo com professores
	•	Matrícula de alunos nas disciplinas
	•	Atualização de notas e trancamento de matrícula
	•	Geração de histórico escolar individual
