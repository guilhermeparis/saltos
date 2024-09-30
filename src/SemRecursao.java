public class SemRecursao
{

    public int calculo(String caminho, int posicaoInicial, boolean pulouTresInicial)
    {
        int n = caminho.length();
        int[][] dp = new int[n + 1][2]; // dp[posição][pulouTres] -> guarda o total de maneiras

        //Caso base: no final, sempre há uma maneira de terminar
        dp[n - 1][0] = 1;
        dp[n - 1][1] = 1;

        // Iterar de trás para frente
        for (int pos = n - 2; pos >= 0; pos--)
        {
            for (int pulouTres = 0; pulouTres <= 1; pulouTres++)
            {
                // Se estivermos fora dos limites ou em um '0', não conta como uma maneira válida
                if (caminho.charAt(pos) == '0')
                {
                    dp[pos][pulouTres] = 0;
                }
                else
                {
                    int total = 0;

                    // Pular 1 passo
                    total += dp[pos + 1][0];

                    // Pular 2 passos (verificar limites)
                    if (pos + 2 < n)
                    {
                        total += dp[pos + 2][0];
                    }

                    // Pular 3 passos se ainda não pulou 3
                    if (pulouTres == 0 && pos + 3 < n)
                    {
                        total += dp[pos + 3][1];
                    }

                    dp[pos][pulouTres] = total;
                }
            }
        }

        // Retornar o resultado para a posição inicial
        return dp[posicaoInicial][pulouTresInicial ? 1 : 0];
    }
}