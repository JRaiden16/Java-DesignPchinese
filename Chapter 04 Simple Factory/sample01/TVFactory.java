public class TVFactory
{
	public static TV produceTV(String brand) throws Exception
	{
		if(brand.equalsIgnoreCase("Haier"))
		{
			System.out.println("La fábrica de TV produce Haier TV!");
			return new HaierTV();
		}
		else if(brand.equalsIgnoreCase("Hisense"))
		{
			System.out.println("Fábrica de TV produce Hisense TV!");
			return new HisenseTV();
		}
		else
		{
			throw new Exception("Lo sentimos, no podemos producir esta marca de TV!");
		}
	}
}
