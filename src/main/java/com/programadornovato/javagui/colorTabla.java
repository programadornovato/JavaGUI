/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.javagui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author eugenio
 */
public class colorTabla extends DefaultTableCellRenderer{
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if(esPar(row)){
            this.setBackground(new Color(0, 83, 255));
            this.setForeground(Color.white);
        }else{
            this.setBackground(new Color(64, 67, 74));
            this.setForeground(Color.white);            
        }
        return this;
    }
    protected boolean esPar(int row){
        if(row%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
