package com.test;

import java.util.List;

public class SearchProductService {

//    This is a composition (kind of dependency injection)
    private SortingAlgoInterface sortingAlgoInterface;

//    tight coupling -> we are forced to use certain class here
    public SearchProductService() {
        sortingAlgoInterface = new BubbleSortAlgo();
    }

//    Loose coupling -> we can now pass different sorting algo object
    public SearchProductService(SortingAlgoInterface sortingAlgoInterface) {
        this.sortingAlgoInterface = sortingAlgoInterface;
    }


    List<String> searchProduct() {
        return null;
    }

    List<String> searchProductWithSortedOrder() {
        List<String> result = searchProduct();
        sortingAlgoInterface.sort(result);
        return result;
    }


}
