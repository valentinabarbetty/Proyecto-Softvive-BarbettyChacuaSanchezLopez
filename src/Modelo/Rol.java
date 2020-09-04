package Modelo;

import java.io.Serializable;

public enum Rol {

    GERENTE_PROPIETARIO, TRANSPORTISTA, TRABAJADOR;

    @Override
    public String toString() {
        switch (this) {
            case GERENTE_PROPIETARIO:
                return "GERENTE_PROPIETARIO";
            case TRANSPORTISTA:
                return "TRANSPORTISTA";
            case TRABAJADOR:
                return "TRABAJADOR";
        }
        return this.name();
    }
}
