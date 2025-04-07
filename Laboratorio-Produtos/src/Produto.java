public class Produto {
    int code;
    String name;
    int quantity;
    String type;
    double price;

    public Produto(int code, String name, int quantity, String type, double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.type = type;
        this.price = price;
    }

    public Produto(int code) {
        this.code = code;
    }

    public Produto(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Produto(int code, String name, int quantity) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
    }

    
    public void sell(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println("Venda realizada com sucesso.");
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public void restock(int quantity, double price) {
        this.quantity += quantity;
        this.price = price;
        System.out.println("Produto reabastecido com sucesso. Novo valor: " + price);
    }

    public void restock(int quantity) {
        this.quantity += quantity;
        System.out.println("Produto reabastecido com sucesso.");
    }

    public void toStringProduct() {
        System.out.println("Código: " + code);
        System.out.println("Nome: " + name);
        System.out.println("Quantidade: " + quantity);
        System.out.println("Tipo: " + type);
        System.out.println("Preço: " + price);
    }

    public void update(String name, int quantity, String type, double price) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
        this.price = price;
    }

    public boolean equals(Produto other) {
        return this.code == other.code && this.name.equals(other.name);
    }
}
