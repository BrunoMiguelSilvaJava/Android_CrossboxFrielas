package pt.statemachine.crossboxfrielas;

public class Glossary {
    private String name;
    private String description;
    public static final Glossary[] glossaries = {
            new Glossary("AMRAP",
                    "(As Many Rounds/Reps As Possible) – Realizar o maior número possível de séries/repetições em um determinado tempo."),
            new Glossary("AFAP ",
                    "(As Fast As Possible) – É o mesmo que “for time”, ou seja realizar o treino no menor tempo possível."),
            new Glossary("Unbroken",
                    "Realizar um número de repetições ou percorrer distâncias sem interromper/parar até ao final (ex.: 10 metros e caminhar em pino sem cair, 50 flexões sem parar)."),
            new Glossary("RX",
                    "(as prescribed) – Realizar o treino sem fazer alterações ou adaptações, tanto nos exercícios como nas cargas."),
            new Glossary("Scaled",
                    "Realizar o treino com alterações ou adaptações, modificar os exercícios ou alterar as cargas (Ex.: fazer elevações assistidas, baixar o peso nas barras, etc.)."),
            new Glossary("ROM",
                    "(Range Of Motion) – Amplitude do movimento."),
            new Glossary("MetCon",
                    "(Metabolic Conditioning) – Condicionamento metabólico, refere-se a padrões estruturados de trabalho e períodos de descanso para obter uma resposta desejada do corpo."),
            new Glossary("BW",
                    "(Body Weight) – Peso do corpo."),
            new Glossary("Chipper",
                    "Um treino com muitas repetições e muitos movimentos."),
            new Glossary("EMOM",
                    "Every Minute on the Minute."),
            new Glossary("WOD",
                    "(Workout Of the Day) ou Missão do Dia – Treino designado para cada dia.")
    };
    //Each Glossary has a name and description
    private Glossary(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
}