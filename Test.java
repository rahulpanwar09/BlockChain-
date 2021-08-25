public class Test {

	public static void main(String args[]) {

		BlockChain testCoin = new BlockChain();

		Block a = new Block("a", new java.util.Date(), "transaction2");
		Block b = new Block("b", new java.util.Date(), "transaction3");
		Block c = new Block("c", new java.util.Date(), "transaction4");

		testCoin.addBlock(a);
		testCoin.addBlock(b);
		testCoin.addBlock(c);

		c.setData("ABC");
		testCoin.displayChain();

		testCoin.isValid();

	}

}