<h1>Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet</h1>

<br />

<p>Modelagem e construção de programa em Java, baseado no marco histórico da geração de 
smartphones pelo toque, unificando as funcionalidades de Navegador, Player Multimídia e 
Telefone num único aparelho que cabe na palma da mão.
</p>

<br />

<h2>Regras do Desafio</h2>

* [Arquivo do Desafio](./POO-DESAFIO.md)

<br />

<h2>Diagrama de Classe</h2>

```mermaid
classDiagram
    class ReprodutorMultimidia {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class ChamadaAudio {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMultimidia
    iPhone --> ChamadaAudio
    iPhone --> NavegadorInternet
```

<br />