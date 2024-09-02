package exercicioradio;

import javax.swing.JOptionPane;

public class Radio
{
    private double estacao = 100;
    private int volume = 0;
    private boolean radioLigado = false;

    public void ligar()
    {
        if (radioLigado == false)
        {
            radioLigado = true;
            JOptionPane.showMessageDialog(null, "Ligando rádio!");
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "\nO rádio já está ligado!\n");
        }
    }

    public void desligar()
    {
        if (radioLigado == true)
        {
            radioLigado = false;
            JOptionPane.showMessageDialog(null, "Desligando rádio...");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O rádio já está desligado!");
        }
    }

    public void aumentarVolume()
    {
        if (radioLigado == true)
        {
            if (volume < 30)
            {
                volume += 1;
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "O volume já está no máximo!");
            }
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "Você não pode aumentar o volume com o rádio desligado! \n");
        }
    }

    public void baixarVolume()
    {
        if (radioLigado == true)
        {
            if (volume > 0)
            {
                volume -= 1;
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "O volume já está no mínimo!");
            }
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "Você não pode baixar o volume com o rádio desligado! \n");
        }
    }

    public void avancarEstacao()
    {
        if (radioLigado == true)
        {
            estacao += 0.2;

            if (estacao > 108.1)
            {
                estacao = 76;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Você não pode avançar a estação com o rádio desligado! \n");
        }
    }

    public void retrocederEstacao()
    {
        if (radioLigado == true)
        {
            estacao -= 0.2;

            if (estacao < 76)
            {
                estacao = 108;
            }
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "Você não pode retroceder a estação com o rádio desligado! \n");
        }
    }

    public double getEstacao()
    {
        if (radioLigado == true)
        {
            return estacao;
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "Você não pode verificar a estação com o rádio desligado! \n");
            return 0;
        }
    }

    public int getVolume()
    {
        if (radioLigado == true)
        {
            return volume;
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "Você não pode verificar o volume com o rádio desligado! \n");
            return 0;
        }
    }

    public boolean getRadioLigado()
    {
        if (radioLigado == true)
        {
            return true;   
        } 
        else
        {
            return false;   
        }
    }
}
