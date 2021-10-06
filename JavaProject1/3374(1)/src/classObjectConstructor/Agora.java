package classObjectConstructor;

public class Agora {
    int prod_id,prod_price,quantity; String prod_name;
    int mul,dis_price,main_price;

    Agora( int prod_id, String prod_name, int prod_price, int quantity){
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_price = prod_price;
        this.quantity = quantity;
    }

    void display1(){
        System.out.println("  "+prod_id+"   \t\t  "+prod_name+"  \t\t  "+prod_price+" \t\t\t  "+quantity);
    }

    void  display2(){
        mul= prod_price*quantity;
        if(mul>500){
            System.out.println(" Product name: "+prod_name+"  \t\t\t  Product id: "+prod_id);
        }
    }

    void discount(){
        mul= prod_price*quantity;
       if (mul>500){
           dis_price=(mul*10)/100;
           System.out.println(" Discount Price: "+dis_price);
           main_price=mul-dis_price;
           System.out.println(" Price: "+main_price);
       }
    }
}
