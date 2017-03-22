/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author marca
 */
public class Pergunta {
    
    private String pergunta1;
    private String pergunta2;
    private String pergunta3;
    private String pergunta4;
    private String pergunta5;
    private int levels;
//sets
public void setPergunta1(String pergunta1)
        {
            this.pergunta1 = pergunta1;
        }
public void setLevels(int levels)
        {
            this.levels = levels;
        }
//gets
public String getPergunta1()
        {
            return this.pergunta1;
        }
public int getLevels()
        {
            return this.levels;
        }
}