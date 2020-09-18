package com.tymkovskiy.pivot_table.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Класс для аггрегации данных из базы данных для формирования двумерной сводной таблицы;
 *
 */
@Component
public class TwoDimensionalResponseObject {

    /** Строки сводной таблицы */
    private String row;
    /** Столбцы сводной таблицы */
    private String col;
    /** Аггрегируемые данные */
    private Double val;

    public TwoDimensionalResponseObject(Object row, Object col, Object val) {
        this.row = String.valueOf(row);
        this.col = String.valueOf(col);
        this.val = Double.valueOf(String.valueOf(val));
    }

    public TwoDimensionalResponseObject() {
    }

    public String getRow() {
        return row;
    }

    public void setRow(Object row) {
        this.row = String.valueOf(row);
    }

    public String getCol() {
        return col;
    }

    public void setCol(Object col) {
        this.col = String.valueOf(col);
    }

    public Double getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = Double.valueOf(String.valueOf(val));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TwoDimensionalResponseObject)) return false;
        TwoDimensionalResponseObject that = (TwoDimensionalResponseObject) o;
        return Objects.equals(getRow(), that.getRow()) &&
                Objects.equals(getCol(), that.getCol()) &&
                Objects.equals(getVal(), that.getVal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRow(), getCol(), getVal());
    }

    @Override
    public String toString() {
        return "ResponseObject{" +
                "row='" + row + '\'' +
                ", col='" + col + '\'' +
                ", val=" + val +
                '}';
    }
}
