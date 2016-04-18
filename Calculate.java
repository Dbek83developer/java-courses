public class Calculate {
		public static void main(String[] arg) {
			System.out.println("Calculate... ");
			// + плюс
			int first = Integer.valueOf(arg[0]);
			int second = Integer.valueOf(arg[1]);
			int summ = first + second;
			System.out.println("Sum " + summ);
			// - минус
			int third = Integer.valueOf(arg[2]);
			int fourth = Integer.valueOf(arg[3]);
			int summinus = third - fourth;
			System.out.println("Sum minus " + summinus);
			// / деление
			float fifth = Float.valueOf(arg[4]);
			float six = Float.valueOf(arg[5]);
			float divsumm = fifth / six;
			System.out.println("Divide " + divsumm);
			// * умножение
			Double seven = Double.valueOf(arg[6]);
			Double eight = Double.valueOf(arg[7]);
			Double msumm = seven * eight;
			System.out.println("Multiple " + msumm);
			// ^ daraja
			Double nine = Double.valueOf(arg[8]);
			Double ten = Double.valueOf(arg[9]);
			Double daraja = Math.pow(nine, ten);
			System.out.println("Daraja " + daraja);
		
		}
}