/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.tlivrariaJF.controler;

import java.util.ArrayList;
import br.com.senactech.tlivrariaJF.model.Cliente;

/**
 *
 * @author jairb
 */
public class CClientes {

    ArrayList<Cliente> clientes = new ArrayList<>();
    int idCliente = 1;

    public void mokClientes() {
        Cliente cli = new Cliente();
        cli.setIdcliente(this.addIdCliente());
        cli.setNome("Juventino Florencio");
        cli.setCpf("123");
        cli.setCnpj(null);
        cli.setEndereco("Flores da Cunha");
        cli.setTelefone("51 44334433");
        this.addCliente(cli);
        Cliente cli2 = new Cliente();
        cli2.setIdcliente(this.addIdCliente());
        cli2.setNome("Josnelson das Candongas");
        cli2.setCpf(null);
        cli2.setCnpj("321");
        cli2.setEndereco("Dorival de Oliveira");
        cli2.setTelefone("51 9 99998888");
        this.addCliente(cli2);
    }

    public int addIdCliente() {
        return this.idCliente++;
    }

    public void addCliente(Cliente c) {
        this.clientes.add(c);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Boolean verificaCliente(int idcliente) {
        boolean verCliente = false;
        for (Cliente cli : clientes) {
            if (cli.getIdcliente() == idcliente) {
                verCliente = true;
                System.out.println("Cliente: " + cli.getNome());
            }
        }
        return verCliente;
    }

    public Cliente pesqCli(int cpfCNPJ, String pesq) {
        Cliente c = new Cliente();
        switch (cpfCNPJ) {
            case 1:
                for (Cliente cli : clientes) {
                    if (cli.getCpf() != null && cli.getCpf().equals(pesq)) {
                        c = cli;
                        break;
                    }
                }
                break;
            case 2:
                for (Cliente cli : clientes) {
                    if (cli.getCnpj() != null && cli.getCnpj().equals(pesq)) {
                        c = cli;
                        break;
                    }
                }
                break;
            default:
                System.out.println("Cliente não Encontrado!!!");
                break;
        }
        return c;
    }

}
