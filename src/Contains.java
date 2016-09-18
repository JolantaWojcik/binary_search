
public class Contains {

	public static void main(String[] args) {
		boolean condition = false;
		int n= 5;
		int[] listItems = {1, 2, 3, 4, 5, 10, 15, 20, 30, 100};

		System.out.println(listItems[listItems.length/2] + " ");
		System.out.println((listItems.length/2)-1 + " ");
		System.out.println(listItems.length-1);
		
		while(condition!=true){
			int[] halfOfList = new int[listItems.length-1/2];
			if(n==listItems[listItems.length/2]){
				System.out.println("###");
				condition = true;
			}else{
				if(n>listItems.length/2){
					for(int i=listItems[listItems.length/2]; i<=listItems.length-1;i++){
						System.out.print(i + " ");
						halfOfList[i] = i;
						System.out.print(halfOfList[i] + " ");
					}
				}else{
					for(int i=listItems[0]; i<=(listItems.length/2)-1;i++){
						halfOfList[i] = i;
						System.out.print(halfOfList[i] + " ");
					}
				}
			}
		}
	}
}
