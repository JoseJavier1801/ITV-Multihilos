package org.example.Model.Entity;

import java.util.Objects;

public class Car {

    private int ID;
    private String Matricula;

    public Car(int ID, String matricula) {
        this.ID = ID;
        Matricula = matricula;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return ID == car.ID && Objects.equals(Matricula, car.Matricula);
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", Matricula='" + Matricula + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Matricula);
    }
}
