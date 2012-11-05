import java.util.ArrayList;


public class MapEvaluation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int kmap = 2;
		ArrayList<String> pred = new ArrayList<String>();
		ArrayList<String> orig = new ArrayList<String>();

		orig.add("1");
		orig.add("2");
		orig.add("3");
		orig.add("4");
		orig.add("5");
		
		pred.add("6");
		pred.add("4");
		pred.add("3");
		pred.add("5");
		pred.add("4");
		
		System.out.println("Map value: ---- " + calculateMap(pred,orig,kmap));
	}

	/*
	 * pass predicted  values in pred list
	 * pass original   values in orig list
	 * kmap map estimation at kmap: 2,5,10...
	 * return valu is map value
	 */
	private static double calculateMap(ArrayList<String> pred,
			ArrayList<String> orig,int kmap) {
		double k=0;
		if(orig.size()==0 || pred.size()==0)
			return 0;
		else{
			int corrItems=0;
			for (int i = 0; i < kmap; i++) {
				String tmp = pred.get(i);
				if(orig.contains(tmp)){
					corrItems++;
					k+=(((double)1/kmap)*((double)corrItems/(i+1)));
					System.err.println((double) 1/kmap + ", " +(double)corrItems/(i+1));
				}
			}
			
		}
		return k;
	}

}
