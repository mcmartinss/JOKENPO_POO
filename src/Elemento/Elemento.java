package Elemento.java;

public enum elemento {
        PEDRA, PAPEL, TESOURA;

        //encapsula as regras do jokepo
        public Resultado compararCom(Elemento outro) {
            if (this == outro) {
                return Resultado.EMPATE;
            }

            switch (this) {
                case PEDRA:
                    return (outro == TESOURA) ? Resultado.VITORIA : Resultado.DERROTA;
                case PAPEL:
                    return (outro == PEDRA) ? Resultado.VITORIA : Resultado.DERROTA;
                case TESOURA:
                    return (outro == PAPEL) ? Resultado.VITORIA : Resultado.DERROTA;
                default:
                    throw new IllegalArgumentException("Elemento inválido");
            }
        }
}

public enum Resultado {
    VITORIA, DERROTA, EMPATE
}

