# Projeto iPhone Simulado

Este projeto simula algumas funcionalidades básicas de um iPhone utilizando Java. As principais funcionalidades incluem um reprodutor musical, navegador de internet, realizar ligações, atender chamadas e iniciar o correio de voz. (Apenas simulações de impressão no terminal)


## Funcionalidades

O menu principal oferece as seguintes opções:

1. **Reprodutor Musical**
2. **Navegador Internet**
3. **Ligar**
4. **Atender**
5. **Iniciar Correio de Voz**
6. **Sair**

### Detalhes das Funcionalidades

1. **Reprodutor Musical**: Permite ao usuário adicionar e reproduzir músicas.
2. **Navegador Internet**: Permite ao usuário navegar na internet.
3. **Ligar**: Permite ao usuário realizar ligações.
4. **Atender**: Permite ao usuário atender chamadas.
5. **Iniciar Correio de Voz**: Permite ao usuário iniciar o correio de voz.
6. **Sair**: Sai do programa.

## Como Executar

### Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) deve estar instalado.

### Passos para Execução

1. Clone o repositório:

    ```bash
    git clone <URL_DO_REPOSITORIO>
    cd <DIRETORIO_DO_REPOSITORIO>
    ```

2. Abra com alguma IDE de sua preferência, recomendado intellij idea.

## Exemplo de Uso

Ao executar o programa, você verá o menu principal. Escolha uma das opções digitando o número correspondente e pressione Enter.

```
============================
    BEM VINDO AO IPHONE
============================
1- Reprodutor Musical
2- Navegador Internet
3- Ligar
4- Atender
5- Iniciar Correio de Voz
6- Sair
============================
Escolha:

```

## Autor do desafio
- [Gleyson Sampaio](https://github.com/glysns)

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
    - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
    - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
    - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Instruções
1. Assista ao vídeo do lançamento do iPhone para entender as funcionalidades principais.
2. Utilize uma ferramenta UML de sua preferência para criar o diagrama das classes e interfaces. Você pode utilizar o modelo acima (criado na sintaxe [Mermaid](https://mermaid.js.org/)), uma alternativa open-source e compatível com arquivos Markdown como este.
3. Opcionalmente, caso esteja cheio(a) de confiança, pode implementar as classes Java representadas em seu diagrama UML.
4. Submeta seu repositório GitHub conforme as orientações da plataforma DIO. Por exemplo:

### UML
![Imagem do iPhone]()
