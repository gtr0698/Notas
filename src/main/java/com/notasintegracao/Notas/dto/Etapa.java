package com.notasintegracao.Notas.dto;

import java.util.Arrays;

public enum Etapa {

    NOTAS_REGULARES("Notas Regulares") {
        @Override
        int getCodEtapa() {
            return 5;
        }
    },
    PROVA_SUBSTITUTIVA("Prova Substitutiva") {
        @Override
        int getCodEtapa() {
            return 6;
        }
    };

    private final String nome;

    Etapa(String nome) {
        this.nome = nome;
    }

    abstract int getCodEtapa();

    public static Etapa fromString(String nome) throws IllegalArgumentException {
        return Arrays.stream(Etapa.values())
                .filter(v -> v.nome.equals(nome))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("unknown value: " + nome));
    }
}
