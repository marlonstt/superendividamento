# Histórico do Projeto: Superendividamento

## Estrutura Atual do Projeto

```
superendividamento/
│
├── frontend/
│   ├── dados-socioeconomicos.html
│   ├── geral.html
│   ├── plano-de-pagamento.html
│   ├── panorama.html
│   └── README.md
│
└── README.md
```

## Funcionalidades Implementadas

### 1. Organização do Projeto
- Projeto atualmente focado apenas no frontend, com páginas HTML independentes.
- Estrutura de navegação entre páginas: Dados Socioeconômicos, Geral, Plano de Pagamento, Panorama.

### 2. Frontend (HTML + JS)
- Cada página HTML possui tabelas e campos para preenchimento manual dos dados.
- Todos os campos editáveis possuem IDs únicos, permitindo persistência dos dados.
- Os dados digitados em qualquer campo são automaticamente salvos no localStorage do navegador.
- Ao navegar entre as páginas, os dados inseridos são mantidos e restaurados automaticamente.
- Layout das páginas segue fielmente os modelos fornecidos (planilhas/imagens), com navegação superior consistente.
- Barra de navegação customizada, responsiva e destacando a página ativa.
- Remoção de arquivos não utilizados: `app.js`, `index.html` e qualquer JS externo não referenciado.

#### Fluxo de Uso
1. Usuário preenche os dados nas tabelas de qualquer página.
2. Os valores são salvos automaticamente no localStorage.
3. Ao retornar para a página, os campos são preenchidos com os dados previamente inseridos.
4. Navegação entre páginas é feita pela barra superior, sem perda de dados.

## Observações
- O projeto não possui mais backend ou integração com API/Java/Spring Boot.
- Toda a lógica de persistência é feita no navegador, sem necessidade de servidor.
- O histórico anterior referente ao backend, endpoints e integrações foi removido por não estar mais no contexto da aplicação.

---

**Este arquivo será atualizado a cada nova funcionalidade ou alteração relevante no projeto.** 