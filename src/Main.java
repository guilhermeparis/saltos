public class Main
{
	
	public static void main(String[] args)
	{
		//Pegar argumento da linha de comando
		String caminho = args[0];
		
		//Recursão Simples
		int recSimples = RecursaoSimples.calculo(caminho, 0, false);
		System.out.println("Recursão Simples: " + recSimples);

		//Recursão com Memorização
		RecursaoMemorizada rm = new RecursaoMemorizada();
		int recMemo = rm.calculo(caminho, 0, false);
		System.out.println("Recursão Memorizada: " + recMemo);
		
		//Sem Recursão
		SemRecursao sr = new SemRecursao();
		int semRec = sr.calculo(caminho, 0, false);
		System.out.println("Sem recursão: " + semRec);		
	}
}
