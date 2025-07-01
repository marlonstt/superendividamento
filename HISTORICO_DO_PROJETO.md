# Histórico do Projeto: Superendividamento

## Novidades / Alterações Recentes

- **[2024-06-XX] Botão Limpar agora limpa apenas dados da página atual:** Em todas as páginas que possuem o botão "Limpar", ele foi ajustado para remover apenas os dados inseridos na própria página, sem apagar informações de outras páginas (por exemplo, o botão Limpar de geral.html não apaga dados de index.html, e vice-versa). Isso garante que dados cadastrados em uma página não sejam perdidos ao limpar os dados de outra página.
- **[2024-06-XX] Remoção de linhas nas tabelas dinâmicas de dívidas**: Agora, ao selecionar a opção "Selecione" no dropdown dos credores em qualquer uma das tabelas dinâmicas de dívidas na página `geral.html` (Consignados, Não Consignados, Sem Parcelas, Dívidas Consolidadas), a linha correspondente é removida da tabela e todos os seus valores são apagados. O funcionamento de crescimento automático das tabelas (sempre mantendo uma linha vazia para inserção) permanece inalterado. Esta melhoria facilita a exclusão de lançamentos indesejados de forma intuitiva e rápida.

## Estrutura Atual do Projeto

```
superendividamento/
│
├── frontend/
│   ├── index.html
│   ├── geral.html
│   ├── plano-de-pagamento.html
│   ├── panorama.html
│   └── README.md
│
├── HISTORICO_DO_PROJETO.md
└── README.md
```

## Análise Detalhada dos Arquivos

### 1. `frontend/index.html` — **Dados Socioeconômicos**
- **Função:** Página inicial para preenchimento dos dados socioeconômicos do consumidor.
- **Estrutura:** Tabelas para receitas e despesas, cálculo automático do valor mensal disponível, campos com IDs únicos e persistência automática no localStorage. Botão para limpar campos. Navegação superior para as demais páginas.

### 2. `frontend/geral.html` — **Visão Geral das Dívidas**
- **Função:** Consolida e detalha as dívidas do consumidor, separando em consignados, não consignados e dívidas sem parcelas.
- **Estrutura:** Tabelas para cada tipo de dívida, cálculo de totais, campos editáveis com persistência automática, botão para limpar, link para cartilha do CNJ. Navegação superior.

### 3. `frontend/plano-de-pagamento.html` — **Plano de Pagamento**
- **Função:** Permite simular e montar um plano de pagamento para as dívidas do consumidor.
- **Estrutura:** Formulário para parâmetros do plano, tabela para distribuição das dívidas, cálculo automático, botões para imprimir e limpar, dados do consumidor para impressão, persistência automática. Navegação superior.

### 4. `frontend/panorama.html` — **Panorama Mensal Resumido**
- **Função:** Apresenta um resumo visual e consolidado da situação financeira mensal do consumidor.
- **Estrutura:** Cards exibindo totais de rendimentos, dívidas, valores livres, simulação de parcelamento, instruções detalhadas. Valores atualizados dinamicamente. Navegação superior.

### 5. `frontend/README.md`
- **Função:** Descreve que o diretório contém o código da interface web (frontend) da aplicação.

### 6. `README.md` (raiz do projeto)
- **Função:** Apresenta a estrutura geral do projeto, contextualiza o objetivo da ferramenta, lista benefícios e ressalta que o backend não está mais presente.

### 7. `HISTORICO_DO_PROJETO.md`
- **Função:** Documenta a evolução do projeto, estrutura, funcionalidades e observações importantes. Destaca que toda a lógica está no frontend, com persistência local e sem backend.

---

## Resumo Geral
- O projeto é uma ferramenta 100% frontend, composta por páginas HTML independentes, mas integradas por uma barra de navegação comum.
- Cada página aborda um aspecto do processo de superendividamento: dados socioeconômicos, detalhamento de dívidas, simulação de plano de pagamento e panorama financeiro.
- Todos os dados são persistidos no navegador via localStorage, permitindo navegação entre páginas sem perda de informações.
- O layout é responsivo, utiliza Bootstrap e segue modelos visuais fornecidos.
- Não há mais backend ou integração com APIs externas.

---

**Este arquivo será atualizado a cada nova funcionalidade ou alteração relevante no projeto.** 