public class Main {

    public static void main(String args[]) {
        Blockchain blockchain = new Blockchain(4);
        blockchain.addBlock(blockchain.newBlock("DARA PENHCHET"));
        blockchain.addBlock(blockchain.newBlock("I WANT TO BUY A NEW MACBOOK PRO 15 INCH"));
        blockchain.addBlock(blockchain.newBlock("https://www.chungbuk.ac.kr"));

        System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
        System.out.println(blockchain);

        // add an invalid block to corrupt Blockchain
        //blockchain.addBlock(new Block(15, System.currentTimeMillis(), "aaaabbb", "Block invalid"));

        //System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
    }
}