package secao_03_aula46;


public class CurrencyConverter {
	
		public final static double iof = 0.06;

		public static double valorEmReais(double valorDolar, double CotacaoDolar){
			double valorEmReais = valorDolar * CotacaoDolar;
			valorEmReais = valorEmReais - (valorEmReais * iof);
			return valorEmReais;
		}
}
