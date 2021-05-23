package org.testinium;



class Product {
    private int [] productPrice;
    private int idx = 0;
    private String [] productModel;
    public String productName;

     public Product(String s, int length)
    {
       productName = s;
       productPrice = new int[length];
       productModel = new String[length];
    }

    public void addTobBasket(String model, int price)
    {

       productPrice[idx] = price;
       productModel[idx] = model;
       idx++;

    }

    public void clearBasket()
    {
        for(int i = 0; i < productPrice.length; ++i) {
            productPrice[i] = 0;
            productModel[i] = "";
        }
    }
    public int [] getProductPrice()
    {
        return  productPrice;
    }
    public  String[] getProductModel()
    {
        return productModel;
    }

    public int getTotalPrice()
    {
        int sumPrice = 0;

        for(int result : productPrice) {
            sumPrice += result;
        }
        return sumPrice;
    }




}
