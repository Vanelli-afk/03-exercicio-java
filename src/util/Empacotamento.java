package util;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;

public class Empacotamento {
    public static void gravarArquivoBinario(ArrayList<Pessoa> lista, String nomeArq){
        File arq = new File(nomeArq); //cria arquivo
        
        try{
            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq)); // cria tradutor e anexa ao escritor
            objOutput.writeObject(lista);
            objOutput.close();
        } catch (IOException erro){
            System.out.printf("Erro: %s", erro.getMessage());
        }
    }
    
    
    public static ArrayList<Pessoa> lerArquivoBinario(String nomeArq){
        ArrayList<Pessoa> lista = new ArrayList();
        
        try{
            File arq = new File(nomeArq);
            if(arq.exists()){
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                lista = (ArrayList<Pessoa>)objInput.readObject();
                objInput.close();
            }
        } catch(IOException erro1){
            System.out.printf("Erro: %s", erro1.getMessage());
        } catch(ClassNotFoundException erro2){
            System.out.printf("Erro: %s", erro2.getMessage());
        }
        
        return lista;
    }
}