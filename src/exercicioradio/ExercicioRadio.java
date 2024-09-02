package exercicioradio;

import javax.swing.JOptionPane;

public class ExercicioRadio
{
    public static void main(String[] args)
    {
        Radio meuRadio = new Radio();
        int menuChoice = 1;

        while (menuChoice != 0)
        {
            if (meuRadio.getRadioLigado() == true)
            {
                double estacaoAtual = meuRadio.getEstacao();
                int volumeAtual = meuRadio.getVolume();
                String estacaoAtualFormatada = String.format("%.2f", estacaoAtual);
                menuChoice = Entrada.leiaInt(""
                        + "RADIO MENU \n\n"
                        + "Estação atual: " + estacaoAtualFormatada + "\n"
                        + "Volume: " + volumeAtual + "\n\n"
                        + "[1] - Ligar Radio \n"
                        + "[2] - Desligar Rádio \n"
                        + "[3] - Aumentar volume \n"
                        + "[4] - Baixar volume \n"
                        + "[5] - Avançar estação \n"
                        + "[6] - Retroceder estação \n"
                        + "[0] - Sair do aplicativo \n");
            } 
            else
            {
                menuChoice = Entrada.leiaInt(""
                        + "RADIO MENU \n\n"
                        + "Estação atual: --- \n"
                        + "Volume: --\n\n"
                        + "[1] - Ligar Radio \n"
                        + "[2] - Desligar Rádio \n"
                        + "[3] - Aumentar volume \n"
                        + "[4] - Baixar volume \n"
                        + "[5] - Avançar estação \n"
                        + "[6] - Retroceder estação \n"
                        + "[0] - Sair do aplicativo \n");
            }

            if (menuChoice == 1)
            {
                meuRadio.ligar();

            } 
            else if (menuChoice == 2)
            {
                meuRadio.desligar();

            } 
            else if (menuChoice == 3)
            {
                meuRadio.aumentarVolume();

            } 
            else if (menuChoice == 4)
            {
                meuRadio.baixarVolume();

            } 
            else if (menuChoice == 5)
            {
                meuRadio.avancarEstacao();
            } 
            else if (menuChoice == 6)
            {
                meuRadio.retrocederEstacao();
            }
        }
        System.exit(0);
    }
}
