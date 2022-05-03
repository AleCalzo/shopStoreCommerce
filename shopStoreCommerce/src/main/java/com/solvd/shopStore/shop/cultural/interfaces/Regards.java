package com.solvd.shopStore.shop.cultural.interfaces;

public interface Regards {

    /**
     * @return
     */
    default String sayHello() {
        return sayHello();
    }

    /**
     * @param greeting 
     * @return
     */
    String sayHello (String greeting);
}
