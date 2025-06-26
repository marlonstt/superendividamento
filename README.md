# Superendividamento

## Estrutura do Projeto

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

## Descrição Geral
Ferramenta web para auxiliar na elaboração de planos de pagamento de superendividamento, conforme Lei nº 14.181/2021, voltada para uso por servidores, promotores, terceirizados, estagiários e partes externas.

- **Totalmente frontend:** Não há backend ou integração com APIs externas. Toda a lógica e persistência de dados ocorre no navegador, via localStorage.
- **Navegação:** Interface composta por páginas HTML independentes, integradas por uma barra de navegação superior comum.
- **Layout:** Responsivo, baseado em Bootstrap, seguindo modelos visuais fornecidos.

## Páginas e Arquivos Principais

- **frontend/index.html** — Dados Socioeconômicos: Formulário para receitas e despesas do consumidor, cálculo automático do valor mensal disponível.
- **frontend/geral.html** — Visão Geral das Dívidas: Consolidação e detalhamento das dívidas (consignados, não consignados, sem parcelas), com totais e persistência automática.
- **frontend/plano-de-pagamento.html** — Plano de Pagamento: Simulação e montagem de plano de pagamento, parâmetros customizáveis, impressão e persistência dos dados.
- **frontend/panorama.html** — Panorama Mensal Resumido: Resumo visual da situação financeira mensal, com cards de totais, percentuais e simulações.
- **frontend/README.md** — Descrição do diretório frontend.
- **HISTORICO_DO_PROJETO.md** — Histórico detalhado da evolução do projeto, funcionalidades e estrutura.

## Benefícios
- Redução de custos com peritos
- Conformidade legal
- Facilidade de uso e acompanhamento
- Dados persistentes entre páginas sem necessidade de servidor

---

**Este projeto está em evolução contínua. Consulte o arquivo HISTORICO_DO_PROJETO.md para detalhes sobre alterações e funcionalidades.**
