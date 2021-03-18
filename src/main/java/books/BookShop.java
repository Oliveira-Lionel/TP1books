package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){

	double sum = 8*books.length;     //cost without discount
        int differentBooks = 0;          //amount of books with different name
	double sumToDiscount = 0;        //money that needs to be discounted
	
	for(int i=0 ; i<books.length-1 ; i++) {
		for(int j=i+1 ; j<books.length ; j++) {
			if(!(books.get(i).getName().equals(books.get(j).getName()))) {
				differentBooks++;
			}
		}
	}
	
	if(differentBooks==2) {
		sumToDiscount=(differentBooks*8*0.07);
	}

	if(differentBooks==3) {
		sumToDiscount=(differentBooks*8*0.14);
	}

	if(differentBooks==4) {
		sumToDiscount=(differentBooks*8*0.28);
	}

	if(differentBooks==5) {
		sumToDiscount=(differentBooks*8*0.35);
	}

	sum=sum-sumToDiscount;
	
        return sum;
    }
}
