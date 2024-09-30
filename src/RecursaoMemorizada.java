import java.util.HashMap;
import java.util.Map;

public class RecursaoMemorizada
{
	// Mapa para armazenar os resultados calculados previamente
    private Map<String, Integer> memo = new HashMap<>();

	public int calculo(String caminho, int posicao, boolean pulouTres)
	{
		
		String key = posicao + "-" + pulouTres;
		
		// Verificar se o resultado já foi memorizado
        if (memo.containsKey(key))
        {
            return memo.get(key);
        }
      
		// Caso base: se chegarmos ao fim, contamos uma maneira
        if (posicao == caminho.length() - 1)
        {
            return 1;
        }
        
        // Se estivermos fora dos limites ou em um '0', não conta como uma maneira válida de atravessar.
        if (posicao >= caminho.length() || caminho.charAt(posicao) == '0')
        {
            return 0;
        }
		
        int total = 0;
        
		total += calculo(caminho, posicao+1, false);
		total += calculo(caminho, posicao+2, false);
		//Quando pula 3, muda a flag para True e na próxima chamada não vai chamar para posicao+3
		if(!pulouTres)
		{
			total += calculo(caminho, posicao+3, true);	
		}
		
		//Memorizar o resultado antes de retornar
        memo.put(key, total);

		return total;
	}
}
