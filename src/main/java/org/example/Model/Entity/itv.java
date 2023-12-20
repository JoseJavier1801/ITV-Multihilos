package org.example.Model.Entity;

public class itv {
    private int id;
    private boolean ruedas;
    private boolean motor;
    private boolean aceite;
    private boolean luces;
    private boolean frenos;
    private boolean refrigeracion;
    private boolean seguros;
    private Car idCar;

    public itv(int id, boolean ruedas, boolean motor, boolean aceite, boolean luces, boolean frenos, boolean refrigeracion, boolean seguros, Car idCar) {
        this.id = id;
        this.ruedas = ruedas;
        this.motor = motor;
        this.aceite = aceite;
        this.luces = luces;
        this.frenos = frenos;
        this.refrigeracion = refrigeracion;
        this.seguros = seguros;
        this.idCar = idCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isAceite() {
        return aceite;
    }

    public void setAceite(boolean aceite) {
        this.aceite = aceite;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    public boolean isFrenos() {
        return frenos;
    }

    public void setFrenos(boolean frenos) {
        this.frenos = frenos;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    public boolean isSeguros() {
        return seguros;
    }

    public void setSeguros(boolean seguros) {
        this.seguros = seguros;
    }

    public Car getIdCar() {
        return idCar;
    }

    public void setIdCar(Car idCar) {
        this.idCar = idCar;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "itv{" +
                "id=" + id +
                ", ruedas=" + ruedas +
                ", motor=" + motor +
                ", aceite=" + aceite +
                ", luces=" + luces +
                ", frenos=" + frenos +
                ", refrigeracion=" + refrigeracion +
                ", seguros=" + seguros +
                ", idCar=" + idCar +
                '}';
    }
}
