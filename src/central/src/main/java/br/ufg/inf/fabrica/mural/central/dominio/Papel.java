package br.ufg.inf.fabrica.mural.central.dominio;

import java.util.Collection;

public class Papel {
    private Collection<GrupoDestinatario> gruposDestinatario;

    public Collection<GrupoDestinatario> getGruposDestinatario() {
        return gruposDestinatario;
    }

    public void setGruposDestinatario(Collection<GrupoDestinatario> gruposDestinatario) {
        this.gruposDestinatario = gruposDestinatario;
    }
}
