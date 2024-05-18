/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Pedro Alexandre
 */
public class Bitcoin extends Moeda implements Tarifacao{

    public Bitcoin() {
        this.setTaxaCompra(0.02);
        this.setTaxaVenda(0.03);
    }

    @Override
    
    public double getTaxaCompra() {
        return taxaCompra;
    }

    @Override
    
    public void setTaxaCompra(double taxaCompra) {
        this.taxaCompra = taxaCompra;
    }

    @Override
    
    public double getTaxaVenda() {
        return taxaVenda;
    }

    @Override
    
    public void setTaxaVenda(double taxaVenda) {
        this.taxaVenda = taxaVenda;
    }
}
