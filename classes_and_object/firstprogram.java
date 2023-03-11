package classes_and_object;


class bulb{
    //attributes
    String company_name;
    String type;
    int watt;
    boolean isON;

    // actions

    void setValues(String cn,String t,int w,boolean on){
        company_name=cn;
        type=t;
        watt=w;
        isON=on;
    }

    void showBulb(){

        System.out.println("*****************************");
        System.out.println(company_name);
        System.out.println(type);
        System.out.println(watt);
        System.out.println(isON);


    }
    void turnON(){
        isON=true;
    }
    void turnOFF(){
        isON=false;
    }
}
public class firstprogram {
    public static void main(String[] args) {
        bulb b1=new bulb();
        bulb b2=new bulb();
        b1.setValues("Philips", "LED", 20, true);
        b2.setValues("wipro", "LED", 10, false);

        b1.showBulb();
        b2.showBulb();
        b1.turnOFF();
        b1.showBulb();
    }
}
