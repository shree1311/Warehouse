package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

        Warehouse w = new Warehouse();

        int numItems = StdIn.readInt();

        for (int i = 0 ; i < numItems ; i++){
            String type = StdIn.readString();
            if (type.charAt(0) == 'a'){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();

                w.addProduct(id, name, stock, day, demand);
            } else if (type.charAt(0) == 'd'){
                int id = StdIn.readInt();
                w.deleteProduct(id);
            }
        }
        StdOut.println(w);
    }
}
