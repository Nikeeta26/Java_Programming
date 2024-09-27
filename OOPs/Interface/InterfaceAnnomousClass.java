Interface demo {

    void show();

}

public IntefaceAnnomousClass {
    public static void main(String args[]){
        demo d = new demo(){
            void show(){
                        System.out.println("hi i am nikeeta");
                    }
    };

    d.show();
}
}