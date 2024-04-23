/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author Pedro Alexandre
 */
public interface Tarifacao {
    public double getTaxaCompra();
    public double getTaxaVenda();
    public void setTaxaCompra(double taxaCompra);
    public void setTaxaVenda(double taxaVenda);
}
