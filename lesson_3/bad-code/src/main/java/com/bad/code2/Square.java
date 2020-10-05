package com.bad.code2;

/**
 * Класс, описывающий квадрат
 */
//Отказ от реализации интерфейса Shape3D, т.к. фигура двухмерная
public class Square{
    /**
     * Длина ребра квадрата
     */
    private Double edgeLength;

    /**
     * Количество рёбер квадрата
     */
    private static final byte N_EDGES = 4;

    /**
     * Конструктор - создание экземпляра класса
     * @param edgeLength - длина ребра фигуры
     */
    public Square(Double edgeLength) {
        this.edgeLength = edgeLength;
    }

    /**
     * Метод для расчёта периметра квадрата
     * @return периметр квадрата
     */
    public Double getPerimeter() {
        return edgeLength * N_EDGES;
    }
}
