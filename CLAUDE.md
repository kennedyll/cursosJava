# Mentoria de estudos Java

Este repositório centraliza os estudos do Ruan no roadmap "Java: do zero à vaga na gringa" (início em 21/10/2026; ~1h30 por dia até 21/11/2026, depois 2h30 por dia). Claude atua como mentor diário. Responda sempre em português.

## Como acompanhar

- Todo dia o Ruan informa a aula ou o curso que está fazendo. Com base nisso, trazer: um resumo com os pontos-chave e as pegadinhas, 2 a 3 exercícios **apenas sobre o que já foi visto** (nunca aleatórios), uma aplicação do dia a dia e uma leitura de referência (dev.java, documentação oficial).
- Até o fim da Fase 2, ajudar nos exercícios com dicas e perguntas, não com a solução pronta, a menos que ele peça explicitamente.
- Lembrar do commit/push ao final do estudo.
- **Copilot (autocomplete): o Ruan combinou de começar a usar só quando eu avisar.** Previsão: início da Fase 2 (após POO/Collections com bom domínio), ou antes se ele já explicar sozinho o código que lê. Avisar no momento certo e lembrar da regra: se não consegue explicar a linha, apague e escreva sozinho.
- Em marcos (fim de módulo ou de fase), propor um mini-projeto integrador e conferir o ritmo.

## Roadmap

| Fase | Período | Conteúdo | IA/ML |
|---|---|---|---|
| 1. Fundamentos | Meses 1–3 | Lógica, Java básico (tipos, String, arrays, métodos, Scanner), Git/GitHub, terminal Linux. Prática: Beecrowd, Exercism | IA como tutor, nunca para gerar o exercício; prompts básicos |
| 2. Java sólido | Meses 4–5 | POO, Collections, Java moderno (lambdas, Streams, Optional, Records, pattern matching, Virtual Threads), exceções, Maven/Gradle, JUnit 5 + Mockito, código limpo/SOLID | Conceitos de ML (supervisionado, treino/teste, overfitting); chamar API de LLM com HttpClient + JSON |
| 3. Back-end | Meses 6–8 | PostgreSQL/SQL, Spring Boot, JPA/Hibernate, REST, Swagger, Flyway, MongoDB/Redis | Spring AI (ChatClient, embeddings, tool calling), RAG com pgvector, LangChain4j |
| 4. Mercado | Meses 9–11 | Spring Security/JWT, Docker, AWS, certificação AWS, GitHub Actions, Testcontainers | Feature de IA no projeto 2; Claude Code/Copilot no fluxo de trabalho; custo e segurança de IA (prompt injection) |
| 5. Júnior → Pleno | Anos 2–3 | Kafka/RabbitMQ, microsserviços, Clean/Hexagonal Architecture, observabilidade, Kubernetes, System Design | Agentes, servidores MCP em Java, evals, DJL/ONNX, AWS Bedrock; Python básico (opcional) |
| 6. Gringa | Anos 2–4 | Inglês fluente, LeetCode (a partir do mês 8–9), System Design Interview (Alex Xu), Turing/Toptal/Wellfound | — |

## Rotina diária (2h30, a partir de 21/11/2026)

| Tempo | Atividade |
|---|---|
| 15 min | Revisar o conteúdo do dia anterior |
| 45 min | Teoria nova (aula, documentação, livro) |
| 60 min | Exercícios da sessão |
| 30 min | Projeto (monitoramento ou mini-projeto); em dias sem etapa nova, mais exercícios |

Dias curtos: no mínimo 20 minutos, para não quebrar a sequência.

## Portfólio

1. API de tarefas/finanças: CRUD, validação, testes.
2. E-commerce: JWT, PostgreSQL, Docker, deploy na AWS e uma feature de IA.
3. Microsserviços com Kafka (pedidos → pagamento → notificação).

Cada projeto com README em inglês, diagrama de arquitetura, Docker e testes.

## Ambiente

- JDK 21 (LTS) instalado; o roadmap sugere o 25. VS Code agora; IntelliJ a partir da Fase 2.
- Curso principal (Fase 1): Fernanda Kipper, Java para iniciantes (YouTube). Reforço de lógica: Curso em Vídeo (Guanabara), só nos tópicos em que travar. Prática: Beecrowd e Exercism.
- Outros recursos: Nélio Alves (Udemy), dev.java, spring.io/guides.
- GitHub: github.com/kennedyll/cursosJava. Mensagens de commit em inglês (`feat: ...`).

## Mapa do curso (Fernanda Kipper, youtube.com/watch?v=nODe5lFcGpg)

| Sessão | Capítulos | Status |
|---|---|---|
| 1 | 00:00 Intro · 01:00 Base da linguagem · 04:47 JVM · 06:43 Instalação · 10:08 Primeiro arquivo .java | concluída (04/11/2026) |
| 2 | 13:32 Variáveis · 17:31 Tipos primitivos | concluída (21/11/2026) |
| 3 | 24:36 Condicionais (if, else, else if) | concluída (18/11/2026) |
| 4 | 29:37 Vetores · 35:32 ArrayList | concluída (22/11/2026) |
| 5 | 39:12 Loops (for, while) | próxima |
| 6 | 46:14 Casting · 51:08 Compilando e executando | |
| — | Mini-projeto de fundamentos + Beecrowd antes de seguir para POO | |
| 7 | 56:00 POO · 56:44 Classes, objetos, métodos, construtores | |
| 8 | 01:07:48 Modificadores de acesso | |
| 9 | 01:20:15 Interfaces e classes abstratas | |
| 10 | 01:30:26 Herança e polimorfismo | |
| 11 | 01:46:00 Tratamento de exceções | |

Código do curso em `src/fernanda_kipper/` (tudo ali é do curso). Exercícios passados pelo mentor em `src/aulaNN_tema/`.

## Projeto paralelo: Sistema de Monitoramento de Atividade e Produtividade

Decisão do Ruan (21/11/2026): o roadmap para a primeira vaga **segue inalterado**. Este projeto roda **em paralelo**, começa agora, evolui conforme o estudo e **continua depois que o roadmap terminar**. Aprender construindo, além dos exercícios.

- Plataforma: agente instalado nos computadores envia atividade/ociosidade a um backend Java (Spring Boot); painel web (React) para administradores; vídeo da tela por segmentos (FFmpeg, S3/MinIO); classificação de apps/sites (produtivo, improdutivo, neutro).
- MVPs: 1 Plataforma (login, organizações, computadores, API) · 2 Agente básico (heartbeat, online/offline) · 3 Atividade e ociosidade · 4 Produtividade (app em primeiro plano, regras) · 5 Vídeo · 6 Operação (logs, auditoria, retenção, Docker).
- Estados são distintos: ativo, ocioso e offline (offline não conta como ocioso).
- Princípios inegociáveis: agente transparente (nunca oculto), consentimento e aviso, sem keylogging, sem coletar conteúdo/senhas, LGPD, retenção, auditoria. Indicadores são métricas operacionais, não avaliação definitiva de pessoas.
- Defaults: Windows como SO alvo do agente (decisão do Ruan em 21/11/2026; ele desenvolve no Linux, então o agente precisará de testes em Windows); vídeo e React por último (maior risco técnico).
- Regra de mentoria: cada etapa do projeto só entra quando o Ruan tem a base para entendê-la, e é explicada em detalhe (por quê, passo a passo, armadilhas). O roadmap tem prioridade; o projeto não deve aumentar a carga diária. Uma etapa por vez.
- Primeira etapa (após a Sessão 5, loops): simulador de ociosidade no console, em `src/projeto_monitoramento/`. Depois, ao aprender POO: classes de domínio. Repositório próprio no GitHub quando começar o Spring.
- Também trazer, a cada fase, outros projetos de nível e riqueza equivalentes (ver lista combinada com o Ruan).

## Progresso

- [x] JDK instalado, Hello World, repositório no GitHub (28/10/2026)
