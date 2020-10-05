package com.bad.code2;

/**
 * Интерфейс, описывающий трёхмерную фигуру
 */
public interface Shape3D {
    /**
     * Метод получения значения координат по оси x
     */
    Double getXCoordinates();

    /**
     * Метод получения значения координат по оси y
     */
    Double getYCoordinates();

    /**
     * Метод получения значения координат по оси z
     */
    Double getZCoordinates();

    /**
     * Метод расчёта объёма трёхмерной фигуры
     */
    Double getVolume();
}
