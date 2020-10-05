package com.bad.code2;

/**
 * Класс, описывающий фигуру куба
 */
public class Qube implements Shape3D {
    /**
     * Координаты по оси x
     */
    private final Double xCoordinates;

    /**
     * Координаты по оси y
     */
    private final Double yCoordinates;

    /**
     * Координаты по оси z
     */
    private final Double zCoordinates;

    /**
     * Длина ребра фигуры
     */
    private final Double edgeLength;

    /**
     * Конструктор - создание экземпляра класса
     * @param centerX - начало координат по оси X
     * @param centerY - начало координат по оси Y
     * @param centerZ - начало координат по оси Z
     * @param edgeLength - длина ребра куба
     */
    public Qube(Double centerX, Double centerY, Double centerZ, Double edgeLength) {
        this.xCoordinates = centerX;
        this.yCoordinates = centerY;
        this.zCoordinates = centerZ;
        this.edgeLength = edgeLength;
    }

    /**
     * Метод получения значения {@link Qube#xCoordinates}
     * @return значение поля xCoordinates
     */
    @Override
    public Double getXCoordinates() {
        return xCoordinates;
    }

    /**
     * Метод получения значения {@link Qube#yCoordinates}
     * @return значение поля yCoordinates
     */
    @Override
    public Double getYCoordinates() {
        return yCoordinates;
    }

    /**
     * Метод получения значения {@link Qube#zCoordinates}
     * @return значение поля zCoordinates
     */
    @Override
    public Double getZCoordinates() {
        return zCoordinates;
    }

    /**
     * Метод расчёта объёма куба
     * @return объём куба
     */
    @Override
    public Double getVolume() {
        return Math.pow(edgeLength, 3);
    }
}
