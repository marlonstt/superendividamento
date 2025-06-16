# Histórico do Projeto: Superendividamento

## Estrutura Atual do Projeto

```
superendividamento/
│
├── backend/
│   ├── pom.xml
│   └── src/main/java/com/superendividamento/
│       ├── SuperendividamentoApplication.java
│       ├── controller/
│       │   └── PlanoPagamentoController.java
│       ├── model/
│       │   ├── Divida.java
│       │   ├── ParcelaPlano.java
│       │   └── PlanoRequest.java
│       └── service/
│           ├── GeradorPlanoPagamento.java
│           └── ServicoCorrecaoMonetaria.java
│
├── frontend/
│   ├── index.html
│   ├── app.js
│   └── README.md
│
└── README.md
```

## Funcionalidades Implementadas

### 1. Organização do Projeto
- Separação em `backend/` (Java, Spring Boot) e `frontend/` (HTML, JS).
- Estrutura de pastas para facilitar manutenção e evolução.

### 2. Backend (Java + Spring Boot)
- **pom.xml**: Gerenciamento de dependências com Spring Boot, Web, Jackson e Lombok.
- **SuperendividamentoApplication.java**: Classe principal para inicialização do Spring Boot.
- **controller/PlanoPagamentoController.java**: Endpoint REST `/api/plano` que recebe dados do frontend e retorna o plano de pagamento calculado.
- **model/Divida.java**: Representa uma dívida individual (credor, valor, data de referência).
- **model/ParcelaPlano.java**: Representa uma parcela do plano de pagamento (número, vencimento, valor, % comprometimento da renda).
- **model/PlanoRequest.java**: Modelo para receber os dados do frontend (renda, data, parcelas, índice, lista de dívidas).
- **service/GeradorPlanoPagamento.java**: Gera a lista de parcelas do plano de pagamento, calculando vencimentos e comprometimento da renda.
- **service/ServicoCorrecaoMonetaria.java**: Simula a aplicação de correção monetária sobre cada dívida, conforme índice selecionado.

#### Fluxo Backend
1. O frontend envia um POST para `/api/plano` com os dados do consumidor e dívidas.
2. O controller soma o valor corrigido de todas as dívidas.
3. O serviço gera a lista de parcelas, respeitando prazo legal e cálculo de comprometimento da renda.
4. O backend retorna a lista de parcelas para o frontend.

### 3. Frontend (HTML + JS)
- **index.html**: Interface moderna para entrada de dados, seleção de índice, perfil de usuário e visualização da tabela de parcelas.
- **app.js**: Captura o submit do formulário, envia os dados para o backend e exibe a tabela de parcelas retornada.
- **README.md**: Explica o propósito do frontend.

#### Fluxo Frontend
1. Usuário preenche os dados e clica em "Gerar Plano".
2. O JS envia os dados para o backend via fetch.
3. A resposta (lista de parcelas) é exibida na tabela.

## Funcionalidades Atendidas (Lei nº 14.181)
- Correção monetária automática (ICJG, INPC, IPCA, IGP-M - simulado)
- Geração de tabela demonstrativa das parcelas futuras
- Percentual de comprometimento da renda
- Respeito ao prazo legal de início do plano (180 dias)
- Perfis de acesso diferenciados (mockup)

## Próximos Passos Sugeridos
- Implementar autenticação e autorização por perfil de usuário
- Persistência em banco de dados
- Melhorias na interface e validações
- Integração com fontes reais de índices de correção monetária

---

**Este arquivo será atualizado a cada nova funcionalidade ou alteração relevante no projeto.** 